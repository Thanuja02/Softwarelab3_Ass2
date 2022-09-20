import java.util.*;  

class Student {
    
    public String Name;
    public String University;
    public String Branch;
    public String City;
    public int PinCode;

    static {
        System.loadLibrary("Student");
    }

    public native void changeDetails(String Name,String University,String Branch,String City,int PinCode);
    
    public Student() {
        Name="Thanuja";
        University="VNIT";
        Branch="CSE";
        City="Nagpur";
        PinCode=507002;
    }

    public void display() {
        System.out.println("\n** Student Details **\n");
        System.out.println("Name : "+Name);
        System.out.println("University : " + University);
        System.out.println("Branch : "+Branch);
        System.out.println("City : "+City);
        System.out.println("Pin Code : "+PinCode);
    }

    public static void main(String[] args){
        Student student = new Student();
        Scanner sc=new Scanner(System.in);

        student.display();

        System.out.print("\nEnter New Details for Student: \n\n");
        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        System.out.print("Enter University: ");
        String univ = sc.nextLine();
        System.out.print("Enter Branch : ");
        String branch = sc.nextLine();
        System.out.print("Enter City : ");
        String city = sc.nextLine();
        System.out.print("Enter Pin Code : ");
        int pincode = sc.nextInt();

        student.changeDetails(name,univ,branch,city,pincode);

        System.out.println("\n Student Details Updated!\n");
        student.display();
    }
}
