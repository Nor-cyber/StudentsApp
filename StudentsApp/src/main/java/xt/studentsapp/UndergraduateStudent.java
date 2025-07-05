 package xt.studentsapp;

public class UndergraduateStudent {
    int Age;
    String name;
    String course;        
    String regNo;
    
    public UndergraduateStudent(int age,String Name,String Course,String regs){
        Age = age;
        name = Name;
        course = Course;
        regNo = regs;
        
    }
    public void getStudentDetails(){
    System.out.println("Hello"+name + " aged " +Age);
    System.out.println("Your Course details are"+course);
    System.out.println("Your registration number is"+regNo); 
    
    }
    public boolean isAbove18(){
        return Age>=18;
    }
            
}

