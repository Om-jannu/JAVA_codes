package assign3;


interface vehicle{
    void display();
}
class bicycle implements vehicle {
    public void display() {
        System.out.println("bicycle has no display");
    }
}
class bike implements vehicle {
    public void display() {
        System.out.println("bike has a smaller display");
    }
}
class car implements vehicle {
    public void display() {
        System.out.println("car has bigger displays");
    }
}
public class learn_interface {

    public static void main(String[] args) {
        vehicle obj = new bicycle();
        obj.display();
        vehicle obj2 = new bike();
        obj2.display();
        vehicle obj3 = new car();
        obj3.display();
    }
}

