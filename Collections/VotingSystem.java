import java.util.*;
class VotingSystem{
    private Map<String, Integer> votes = new HashMap<>();
    private LinkedHashMap<String, Integer> voteOrder = new LinkedHashMap<>();
    private TreeMap<String, Integer> sortedResults = new TreeMap<>();
    public void castVote(String candidate) {
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, votes.get(candidate));
        sortedResults.put(candidate, votes.get(candidate));
    }
    public void displayVotes() {
        System.out.println("Votes in order of casting:");
        for (Map.Entry<String, Integer> entry : voteOrder.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    public void displayResults() {
        System.out.println("Sorted Results:");
        for (Map.Entry<String, Integer> entry : sortedResults.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        VotingSystem v = new VotingSystem();
        v.castVote("Rashi");
        v.castVote("Shaan");
        v.castVote("Riya");
        v.castVote("Diksha");
        v.castVote("Vivek");
        v.displayVotes();
        v.displayResults();
    }
}
