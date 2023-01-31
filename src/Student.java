import java.util.Scanner;
public class Student{
    private String name,regNo;
    private int yob,admyr;
    private float feeBal;
    private Scanner s=new Scanner (System.in);
    public Student(){
        System.out.println("Enter student name");
        name= s.nextLine();
        System.out.println("Enter regNo for "+ name);
        regNo=s.next();
           System.out.println("when was "+ name+"born?");
           yob=s.nextInt();
        System.out.println("Enter year of admission ");
        admyr=s.nextInt();
         System.out.println("Enter fees to be paid ");
         feeBal=s.nextFloat();
        
    }
    public void getAge(){
        int cyr;
        System.out.println("enter current year");
        cyr=s.nextInt();
        int age =cyr-yob;
        System.out.println( name +" you are "+age +"years old");
    }
    public void  feebalance(){
       int 

    }
    public void gradYr(){
        int  gyear= admyr+4;
        System.out.println( name +" you wil graduate in "+ gyear);
  
    }
    public static void main(String[] args){
        Student s1=new Student();
        s1.getAge();
        s1.gradYr();
    }
}
