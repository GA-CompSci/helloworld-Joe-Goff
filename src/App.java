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
    }
}
