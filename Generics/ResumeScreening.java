import java.util.List;
import java.util.ArrayList;

abstract class JobRole {
    public abstract String getRoleName();
}

class SoftwareEngineer extends JobRole {
    public String getRoleName() { return "Software Engineer"; }
}

class DataScientist extends JobRole {
    public String getRoleName() { return "Data Scientist"; }
}

class Resume<T extends JobRole> {
    private String candidateName;
    private T targetRole;

    public Resume(String candidateName, T targetRole) {
        this.candidateName = candidateName;
        this.targetRole = targetRole;
    }
    
    public String toString() {
        return "Resume for " + candidateName + " (Role: " + targetRole.getRoleName() + ")";
    }
}

public class ResumeScreening {

    public static void screenResumes(List<Resume<? extends JobRole>> resumes) {
        System.out.println("--- Screening " + resumes.size() + " Resumes ---");
        for (Resume<?> resume : resumes) {
            System.out.println("Processing: " + resume);
        }
    }

    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>("Alex", new SoftwareEngineer());
        Resume<DataScientist> dsResume = new Resume<>("Brie", new DataScientist());

        List<Resume<? extends JobRole>> pipeline = new ArrayList<>();
        pipeline.add(seResume);
        pipeline.add(dsResume);

        screenResumes(pipeline);
    }
}
