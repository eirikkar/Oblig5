
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private Name name;
    private CourseCollection courses;
    
    /**
     * Constructor for objects of class Student
     */
    public Student(String firstName, String surname) {
       name = new Name(firstName, surname);
       courses = new CourseCollection();
    }
    
    public Student(String encodedStudent) {
        String [] parts = new String[2];
        parts = encodedStudent.split("\t");
        String names = parts[0];
        String [] newname = new String[2];
        newname = names.split(";");
        String firstName = newname [0];
        String surname = newname [1];
        String course = parts [1];
        name = new Name(firstName, surname);
        courses = new CourseCollection();
        addCourse(course);

    }
    
    public String encode() {
        String encodeStudent = name.encode() + "\t" + courses.encode();
        return encodeStudent;
    }
    
    /**
     * Method getName
     *
     * @return The return value
     */
    public Name getName() {
        return name;
    }
    
    /**
     * Method getCourses
     *
     * @return The return value
     */
    public CourseCollection getCourses() {
        return courses;
    }
    
    public void addCourse (String course) {
        courses.addCourse(course);
    }
    
}
