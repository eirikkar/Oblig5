import java.util.ArrayList;
/**
 * Write a description of class CourseCollection here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CourseCollection
{
    private ArrayList <String> courses;
    /**
     * Constructor for objects of class CourseCollection
     */
    public CourseCollection()
    {
        courses = new ArrayList<String>();
    }
    
    public CourseCollection(String coursesEncoded) {
        
    }
    
    public String encode () {
        String courseEncode = ";";
        for (String encoded : courses) {
            courses.add(courseEncode);
            return encoded;
        }
        return null;
    }
    
    public void addCourse(String courseCode) {
        if (courseCode.equals(null) || courseCode.contains(";")) {
            throw new IllegalArgumentException("Is null or contains ';'");
        } else {
            courses.add(courseCode);
        }
    }
    public void printTest() {
        System.out.println(courses);
    }
}
