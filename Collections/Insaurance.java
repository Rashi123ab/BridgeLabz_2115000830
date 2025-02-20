import java.time.LocalDate;
import java.util.*;
class InsurancePolicy {
    String policyNumber;
    String policyHolder;
    LocalDate expiryDate;
    InsurancePolicy(String policyNumber, String policyHolder, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.expiryDate = expiryDate;
    }
    public String toString() {
        return "PolicyNumber: " + policyNumber + ", Holder: " + policyHolder + ", Expiry: " + expiryDate;
    }
}
class Insaurance{
    Map<String, InsurancePolicy> policyMap = new HashMap<>();
    Map<String, InsurancePolicy> orderedPolicies = new LinkedHashMap<>();
    TreeMap<LocalDate, List<InsurancePolicy>> sortedByExpiry = new TreeMap<>();

    void addPolicy(InsurancePolicy policy) {
        policyMap.put(policy.policyNumber, policy);
        orderedPolicies.put(policy.policyNumber, policy);
        sortedByExpiry.computeIfAbsent(policy.expiryDate, k -> new ArrayList<>()).add(policy);
    }

    InsurancePolicy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    List<InsurancePolicy> getPoliciesExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate threshold = today.plusDays(30);
        List<InsurancePolicy> result = new ArrayList<>();
        sortedByExpiry.subMap(today, true, threshold, true).values().forEach(result::addAll);
        return result;
    }

    List<InsurancePolicy> getPoliciesByHolder(String policyHolder) {
        List<InsurancePolicy> result = new ArrayList<>();
        for (InsurancePolicy policy : orderedPolicies.values()) {
            if (policy.policyHolder.equals(policyHolder)) {
                result.add(policy);
            }
        }
        return result;
    }

    void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        Iterator<Map.Entry<LocalDate, List<InsurancePolicy>>> iterator = sortedByExpiry.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<LocalDate, List<InsurancePolicy>> entry = iterator.next();
            if (entry.getKey().isBefore(today)) {
                for (InsurancePolicy policy : entry.getValue()) {
                    policyMap.remove(policy.policyNumber);
                    orderedPolicies.remove(policy.policyNumber);
                }
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        Insaurance system = new Insaurance();
        system.addPolicy(new InsurancePolicy("P001", "Rashi", LocalDate.of(2025, 3, 10)));
        system.addPolicy(new InsurancePolicy("P002", "Shantanu", LocalDate.of(2024, 2, 20)));
        system.addPolicy(new InsurancePolicy("P003", "Diksha", LocalDate.of(2024, 3, 5)));

        System.out.println(system.getPolicyByNumber("P001"));
        System.out.println(system.getPoliciesExpiringSoon());
        System.out.println(system.getPoliciesByHolder("Rashi"));
        system.removeExpiredPolicies();
    }
}

