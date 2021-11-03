package assign2;

//3. Create a Teacher class and derive Professor/Associate_Professor/Assistant_Professor class from Teacher class.
//        Define appropriate constructor for all the classes.
//        Also define a method to display
//        information of Teacher.
//        Make necessary assumptions as required.

class teacher{
    String name;
    int age,id;
    teacher(){
        name="NULL";
        age=id=0;
    }
    void display(){
        System.out.println("Name is "+name+" age is "+age+" id is "+id);
    }
}
class professor extends teacher{
    professor(String n,int a ,int b){
        name=n;
        age = a;
        id=b;
    }
}
class associateProfessor extends teacher{
    associateProfessor(String n,int a,int b){
        age=a;
        name=n;
        id=b;
    }
}
class assistantProfessor extends teacher{
    assistantProfessor(String n,int a,int b){
        name=n;
        age=a;
        id=b;
    }
}
public class college {
    public static void main(String[] args){
        professor p1=new professor("Ram",12,22);
        associateProfessor p2=new associateProfessor("Rem",11,33);
        assistantProfessor p3=new assistantProfessor("Raj",13,21);
        p1.display();
        p2.display();
        p3.display();
    }
}