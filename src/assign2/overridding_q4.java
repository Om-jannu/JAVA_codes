package assign2;

    class Book{
    String name="NULL";
    int serialNo=0;
    void setBookInfo(String a,int b){
        name=a;
        serialNo=b;
    }
    void display(){
        System.out.println("Name of book is "+name+"\n Serial no. is "+serialNo);
    }
}
class referenceBook extends Book{
    String category;

    void setBookInfo(String a, int b,String cat) {
        super.setBookInfo(a, b);
        category=cat;
    }

    void display(){
        System.out.println("Name of the Reference "+name+"\nSerial no. "+serialNo+"\nCategory "+category);
    }
}
class magazine extends Book{
    String publisher;
    void setBookInfo(String a, int b,String p) {
        super.setBookInfo(a, b);
        publisher=p;
    }
    void display(){
        System.out.println("Name of the Reference "+name+"\nSerial no. "+serialNo+"\nPublisher "+publisher);
    }
}
public class overridding_q4 {
    public static void main(String[] args){
        //book b1 = new book;
        //b1.setbookinfo("chap","joke");
        referenceBook b2=new referenceBook();
        b2.setBookInfo("dwa",323,"Science");
        magazine b3=new magazine();
        b3.setBookInfo("ddad",223,"Vogue");
        //b1.display();
        b2.display();
        b3.display();
    }
}