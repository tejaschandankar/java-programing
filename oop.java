public class oop {
    public static void main(String[] args) {
        student s1=new student();
        student s2=new student();
        s1.name="sachin";   
        s2.name="rahul";
        s1.rollno=1;
        s2.rollno=2;    
        s1.age=20;
        s2.age=21;  
        s1.collegeName="abc";
        s2.collegeName="xyz";   
        s1.attendance();
        s2.attendance();
        
       s1.print();
       s2.print();
    }
}
class student{
    String name;
    int rollno;
    int age;
    String collegeName;

    void attendance(){
        System.out.println("student is present"+ name);

    }
    void print(){
       // System.out.println(name +","+age+","+rollno+","+collegeName);
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("rollno:"+rollno);   
        System.out.println("collegeName:"+collegeName);
    }

}
