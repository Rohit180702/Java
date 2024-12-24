public class TestMain {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "123 Main Street");
        System.out.println(person);

        Student student = new Student("Alice", "456 Elm Street", "Computer Science", 2023, 15000.50);
        System.out.println(student);

        student.setProgram("Data Science");
        student.setYear(2024);
        student.setFee(16000.75);
        System.out.println("Updated Student: " + student);

        Staff staff = new Staff("Bob", "789 Maple Avenue", "Engineering School", 55000.75);
        System.out.println(staff);

        staff.setSchool("Business School");
        staff.setPay(60000.80);
        System.out.println("Updated Staff: " + staff);
    }
}
