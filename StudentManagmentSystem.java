 import java.util.*;
public class StudentManagmentSystem{
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        
        int choice;

        do{
            System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println("Enter  Roll no:");
        int rollno = sc.nextInt();

        System.out.println("Enter Age:");
        int age = sc.nextInt();

        if (age>=18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }

        sc.nextLine();

        System.out.println("Enter Student Branch:");
        String branch = sc.nextLine();

        System.out.println("Enter Smester:");
        int semester = sc.nextInt();

        System.out.println("Enter CGPA:");
        double cgpa = sc.nextDouble();

        if (cgpa>=9.0){ 
        System.out.println("Outstanding");
        }else if(cgpa>=8.0){
            System.out.println("Excellent");
        }else if(cgpa>=7.0){
            System.out.println("Good");
        }else if(cgpa>=6.0){
            System.out.println("Average");
        }else if(cgpa>=0.0){
            System.out.println("Need improvement");
        }else{
            System.out.println("Invaid cgpa");
        }

        System.out.println("Enter marks:");
        int marks= sc. nextInt();

        if (marks>=35){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }


        
        System.out.println("STUDENT INFORMATION");
        System.out.println("Name :"+ name);

        System.out.println("Roll No :" + rollno);
        System.out.println("Age :"+ age);
        System.out.println("Branch :" + branch);
        System.out.println("Semester :" + semester);
        System.out.println("CGPA :" + cgpa);
        System.out.println("Marks :"+ marks);

        System.out.println("Do you want to add another student?");
        System.out.println("choice 1. Yes");
        System.out.println("choice 2. No");

        System.out.println("Enter your choice");
        choice = sc.nextInt();
        sc.nextLine();
        } while(choice == 1);

        System.out.println("Thank you for using Student Managment System.");
        sc.close();
        

        
        
    }
} 
    

