import java.util.*;
abstract class JobRole {
    private String roleName;
    public JobRole(String roleName) {
        this.roleName = roleName;
    }
    public String getRoleName() {
        return roleName;
    }
}
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer");
    }
}
class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist");
    }
}
class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager");
    }
}

class Resume<T extends JobRole> {
    private String candidateName;
    private T jobRole;
    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }
    public String getCandidateName() {
        return candidateName;
    }
    public T getJobRole() {
        return jobRole;
    }
}
class AIResumeScreening {
    private List<Resume<? extends JobRole>> resumes = new ArrayList<>();
    public void addResume(Resume<? extends JobRole> resume) {
        resumes.add(resume);
    }
    public void processResumes() {
        for (Resume<? extends JobRole> resume : resumes) {
            System.out.println("Processing resume: " + resume.getCandidateName() + " - " + resume.getJobRole().getRoleName());
        }
    }
}
class ResumeScreening{
    public static void main(String[] args) {
            Resume<SoftwareEngineer> seResume = new Resume<>("Rashi", new SoftwareEngineer());
        Resume<DataScientist> dsResume = new Resume<>("Riya", new DataScientist());
        Resume<ProductManager> pmResume = new Resume<>("Diksha", new ProductManager());

        AIResumeScreening screening = new AIResumeScreening();
        screening.addResume(seResume);
        screening.addResume(dsResume);
        screening.addResume(pmResume);
        
        screening.processResumes();
    }
}
