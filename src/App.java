import javax.management.OperationsException;

public class App {
    public static void main(String[] args) throws Exception {
        // DATA TYPES
        int x = 5;
        char c = 'c';
        double y = 5.5;
        boolean b = false;
        int w; // decleration
        w = 66; // initialization
        int infractedStudents; // camelCasing
        final int CONNY = 5; //constants are all-caps
        //OPERATIONS
        System.out.println(w-3);
        w-=3;
        System.out.println(w);

        // COMPARISONS
        System.out.println(true == false);
        boolean boo = false;
        System.out.println(!boo !=false);
        //CONDITIONAL
        if(!boo) System.out.println("boo passed");

        // SHORT CIRCUIT
        int divisor = 0;
        if(divisor !=0 && 5/divisor > 1 ) System.out.println("omg");
        //ARRAYS
        int n, m, u, i = 0; // multi-declaration
        n = 0;
        m = 0;
        u = 0;
        int[] arr = {n, m, u, i}; // copies, not links to the values
        n = 5;
        System.out.println(arr[0]);
        System.out.println(n);
        arr[0] = 5; // I'd have to do that to change the array's value
        System.out.println("The array is " + arr.length + "items long");

        // FUNCTIONS / METHODS
        System.out.println(addYaBoi("I do my homework"));

    } // closes the main method

    public static String addYaBoi(String str){
        return str + " yaboi";

    }

} // closes the app class
