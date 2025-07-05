package xt.studentsapp;
import java.util.Scanner;
public class StudentsApp {
    
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in); 
        System.out.println("Enter your Age please");
        int age = S.nextInt();
        
        System.out.println("Enter your Name");
        String name = S.nextLine();
        
        System.out.println("Enter your Course");
        String course = S.nextLine();
         
        System.out.println("Enter your Registration Number");
        String reg = S.nextLine();
        UndergraduateStudent Stdt1 =new UndergraduateStudent(22,"Mukisa Godwin","BSc.Medicine & Surgery","24/U/2080");
        Stdt1.getStudentDetails();
        
        if(Stdt1.isAbove18()){
            System.out.println("Congs,this is a home to many next geen parents");
        }
        else{
            System.out.println("Ooh this program is designed for Adults Try to check later");
        }   
    }
}
