package assign2;

/*Consider a hierarchy, where a sportsperson can either be an athlete or a hockey player. Every sportsperson has
        a unique name. An athlete is characterized by the event in which he/she participates; whereas a hockey player is
        characterised by the number of goals scored by him/her. Perform the following tasks using Java :

        (i)Create the class hierarchy with suitable instance variables and methods.
        (ii) Create a suitable constructor for each class.
        (iii) Create a method named display_all_info with suitable parameters. This method should display all the
        information about the object of a class.
        (iv) Write the main method that demonstrates
        polymorphism*/

class sportsperson {
    String name;

    sportsperson(String n) {
        name = n;
    }

    sportsperson() {
    }

    void display_all_info() {
        System.out.println(" OLYMPICS");
    }
}

class athlete extends sportsperson {
    String event;

    athlete(String n, String e) {
        super(n);
        event = e;
    }

    void display_all_info() {
        System.out.println("\n Name : " + name + "\n Event : ");
        System.out.println("--------------------");
    }
}

class hockey extends sportsperson {
    int goal;

    hockey(String n, int g) {
        super(n);
        goal = g;
    }

    void display_all_info() {
        System.out.println("\n Name : " + name + "\n Goal : " + goal);
    }
}

public class Hierarchy {
    public static void main(String[] args) {
        sportsperson superOB = new sportsperson();
        superOB.display_all_info();

        athlete subOB = new athlete("Michel", "Swimming");
        subOB.display_all_info();

        hockey subOB1 = new hockey("Alex", 10);
        subOB1.display_all_info();
    }
}

