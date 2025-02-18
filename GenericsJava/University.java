import java.util.ArrayList;
import java.util.List;
abstract class CourseType {
    private String name;
    public CourseType(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class ExamCourse extends CourseType {
    public ExamCourse() {
        super("Exam-Based");
    }
}
class AssignmentCourse extends CourseType {
    public AssignmentCourse() {
        super("Assignment-Based");
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse() {
        super("Research-Based");
    }
}
class Course<T extends CourseType> {
    private String courseName;
    private T courseType;
    public Course(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }
    public String getCourseName() {
        return courseName;
    }
    public T getCourseType() {
        return courseType;
    }
}
class CourseManager {
    private List<Course<? extends CourseType>> courses = new ArrayList<>();
    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }
    public void displayCourses() {
        for (Course<? extends CourseType> course : courses) {
            System.out.println(course.getCourseName() + " - " + course.getCourseType().getName());
        }
    }
}
class University{
    public static void main(String[] args) {
        Course<ExamCourse> math = new Course<>("Hindi", new ExamCourse());
        Course<AssignmentCourse> literature = new Course<>("English Literature", new AssignmentCourse());
        Course<ResearchCourse> physics = new Course<>("Physics", new ResearchCourse());
        CourseManager manager = new CourseManager();
        manager.addCourse(math);
        manager.addCourse(literature);
        manager.addCourse(physics);
        
        manager.displayCourses();
    }
}
