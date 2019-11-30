// Java program to illustrate
// working of toString() method
public class Best_Friend {
    private String name;
    private int age;
    private String college;
    private String course;
    private String address;
    
    public Best_Friend(String n, int a, String col, String crse, String add)
    {
        name = n;
        age = a;
        college = col;
        course = crse;
        address = add;
    }
    
    public String toString()
    {
      return "Name = " + name + "\nAge = " + age + "\nCollege = " + college;
    }
 
    public static void main(String[] args)
    {
        Best_Friend b = new Best_Friend("Ms. Smith", 101, "Miami U", "Comp Sci", "1 Tiger Trail");
        System.out.println(b);
        System.out.println(b.toString());
    }
}
