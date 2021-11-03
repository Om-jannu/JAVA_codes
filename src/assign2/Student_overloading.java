package assign2;

//5. A university has two types of students — graduate students and research students.
//        The University maintains the record of name, age and programme of every student.
//        For graduate students, additional information like percentage of marks and stream, like
//        science, commerce, etc. is recorded;
//        whereas for research students, additionally, specialization and years of working experience, if any, is recorded.
//        Each class has a constructor. The constructor of subclasses makes a call to constructor of the superclass.
//        Assume that every constructor has the same number of parameters as the
//        number of instance variables.
//        In addition, every subclass has a method that may update the instance variable values of that subclass.
//        All the classes have a function display_student_info( ), the subclasses must override this method of the base class.
//
//        Every student is either a graduate student or a research student.
//        Perform the following tasks for the description given above using Java :
//
//        (i) Create the three classes with proper instance variables and methods, with suitable inheritance.
//        (ii) Create at least one parameterised constructor for each class.
//        (iii) Implement the display_student_info( ) method in each class.
class Student{
    String name,programme;
    int age;
    Student(String n,String p,int a){
        name=n;
        programme=p;
        age=a;
    }
    void display_student_info(){}
    void update(int a){age=a;}

}
class gradStudent extends Student {
    int percentage,sciMarks,comMarks,mathMarks;
    gradStudent(String n,String p,int a,int per,int sM,int cM,int mM){
        super(n,p,a);
        percentage=per;
        sciMarks=sM;
        comMarks=cM;
        mathMarks=mM;
    }
    void update(String n,String p,int a,int per,int sM,int cM,int mM){
        name=n;
        programme=p;
        age=a;
        percentage=per;
        sciMarks=sM;
        comMarks=cM;
        mathMarks=mM;
    }
    void display_student_info(){
        System.out.println("Name : "+name+"\nProgramme : "+programme+"\nAge : "+age+"\nPercentage : "+percentage
                +"\nScience marks : "+sciMarks+"\nCommerce Marks"+comMarks+"\nMath Marks"+mathMarks);
    }
}
class researchStudent extends Student{
    String spec;
    int exp;
    researchStudent(String n,String p,int a,int ex,String sp){
        super(n,p,a);
        spec=sp;
        exp=ex;
    }
    void update(String n,String p,int a,int ex,String sp){
        name=n;
        programme=p;
        age=a;
        spec=sp;
        exp=ex;
    }
    void display_student_info(){
        System.out.println("Name : "+name+"\nProgramme : "+programme+"\nAge : "+age+"\nSpecifications : "+spec
                +"\nExperience : "+exp);
    }
}
public class Student_overloading {
    public static void main(String[] args){
        gradStudent g1=new gradStudent("Mark","Science",21,45,80,90,70);
        gradStudent g2=new gradStudent("Tar","General",21,45,90,99,79);
        researchStudent r1=new researchStudent("Den","Public",23,4,"Law");
        researchStudent r2=new researchStudent("Bush","Health",22,2,"Med");
        g1.update("Mark","Science",21,45,80,90,80);
        r2.update("Bush","Health",22,5,"Med");
        g1.display_student_info();
        g2.display_student_info();
        r1.display_student_info();
        r2.display_student_info();
    }
}