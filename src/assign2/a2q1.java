//1. Create a Java based application to perform various ways of Method overloading
// i.e No parameters, types of paratemeters, Constructor Overloading/
package assign2;
public class a2q1 {
    public class overloading {
        static int sub() {
            System.out.println(("no parameters"));
            int a = 1, b = 4;
            return (a - b);
        }

        static int sub(int a, int b) {
            System.out.println("int parameter");
            return (a - b);
        }

        static double sub(double a, double b) {
            System.out.println("double parameter");
            return (a - b);
        }

        static int sub(int a, int b, int c) {
            System.out.println("int datatype");
            return (a - b - c);
        }
    }
        public static void main(String[] args) {
            System.out.println(overloading.sub(20, 37));
            System.out.println(overloading.sub(20.534, 3.47));
            System.out.println(overloading.sub());
            System.out.println(overloading.sub(4, 4.5));
            System.out.println(overloading.sub(4, 4, 6));
        }
    }
