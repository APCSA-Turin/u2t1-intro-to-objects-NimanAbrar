public class Student {
   
    private String name;
    private double gpa;
    private int numberOfAps;

    public Student(String studentName, double studentGpa, int studentNumberOfAps) {
      name = studentName;
      gpa = studentGpa;
      numberOfAps = studentNumberOfAps;


       

    }
    public void introduce() {
        if (gpa >= 3.0) {
            System.out.println("Hello, I am " + name + " and I have a good GPA!");
        } else {
            System.out.println("Hello, I am " + name + " and I don't have a good GPA!");
        }
    }
 public void printStudentInfo() {
    System.out.println("Name: "  + name);
    System.out.println("GPA: " + gpa);
    System.out.println("Number of APs: " + numberOfAps);
 }


}