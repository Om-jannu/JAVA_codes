package assign2;
//Write a Java program to illustrate Constructor Chaining
      class usingthis {
    //constructor chaining using this()

    //default constructor
    usingthis() {
        //constructor 1
        this(20);//constructor 3 is called
        System.out.println("default constructor called");
    }

    usingthis(int age) {
        //constructor 2
        System.out.println("parameterized constructor - int as parameter");
    }
}
   class usingsuper extends usingthis{
         //constructor chaining using super()

         //derived default constructor1
       usingsuper(){
           this("name","java"); //derived default constructor2 is called
           System.out.println("derived class default constructor called");
       }

       //derived default constructor2
       usingsuper(String name,String java){
           super();//parent class - usingthis is called
           System.out.println("derived class parameterized constructor called");
       }
     }
     public class a2q2{
         public static void main(String[] args) {
             usingsuper us = new usingsuper();
             System.out.println("------------------------------------------------------------------");
             usingthis ut = new usingthis();
         }
     }