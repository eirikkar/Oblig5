public class Main {
    public static void main(String[] args) {

        Student student = new Student("Asdf", "Qwerty");
        student.addCourse("Kurset");
        UserDatabase userDatabase = new UserDatabase();

        //userDatabase.addStudent(student);

        //System.out.println(userDatabase.saveDatabase());
        System.out.println(userDatabase.loadDatabase());
        System.out.println("Ferdig!");


    }
}
