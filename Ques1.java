import java.util.*;

public class Ques1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter size of vector: ");
        int size = sc.nextInt();
        Vector v = new Vector();
        int i = 0;
        System.out.println("Enter the elements of vector. Enter -1 to stop.");
        while (i < size) {
            int element = sc.nextInt();
            if (element == -1)
                break;
            v.addElement(element);
            i++;
        }
        for (int j = 0; j < i; j++) {
            System.out.println(v.elementAt(j));
        }
    }
}