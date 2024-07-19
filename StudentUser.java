public class StudentUser {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.Name);
        System.out.println(s.MoNo);

        //Modifying data in Student class
        s.Name = "Amith";
        System.out.println(s.Name);
        //If we create the variable using private keyword we cant access the data in this particular program.

    }
}
