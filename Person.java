import java.util.Scanner;
class Person {
    String name;
    String gender;
     String address;
    int age;
    Person(){
      name=" ";
      gender=" ";
      address=" ";
      age=0;
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name: ");
        name=sc.next();
        System.out.println("Enter gender :");
        gender=sc.next();
        System.out.println("Enter address: ");
        address=sc.next();
        System.out.println("Enter the age: ");
        age=sc.nextInt();
    }
}
 class  Employee extends Person{
    int empid;
    String cname;
    String qualification;
    int salary;
    Employee(){
        empid=0;
        cname=" ";
        qualification=" ";
        salary=0;
    }
   void input2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employee id: ");
        empid=sc.nextInt();
        System.out.println("Enter company name: ");
        cname=sc.next();
        System.out.println("Enter qualification: ");
        qualification=sc.next();
        System.out.println("Enter salary: ");
        salary=sc.nextInt();
    }
}
class Teacher2 extends Employee{
    String subject;
     String dept;
    int teacherid;
    Teacher2(){
        subject=" ";
        dept=" ";
        teacherid=0;
    }
    void input3(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter subject: ");
        subject=sc.next();
        System.out.println("Enter department: ");
        dept=sc.next();
        System.out.println("Enter teacher id: ");
        teacherid=sc.nextInt();

    }

   void display(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Address: "+address);
        System.out.println("Age: "+age);
        System.out.println("Employee Id: "+empid);
        System.out.println("Company Name: "+cname);
        System.out.println("Qualification: "+qualification);
        System.out.println("Salary: "+salary);
        System.out.println("Subject: "+subject);
        System.out.println("Department: "+dept);
        System.out.println("Teacher Id: "+teacherid+"\n");
    }


   
}
