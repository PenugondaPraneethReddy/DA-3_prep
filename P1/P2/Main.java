package P1.P2;
import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter no. of strings to be stored: ");
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        Concatenate cat = new Concatenate(n);
        System.out.println("Get string data");
        cat.put_data();
        System.out.println(Arrays.toString(cat.get_data()));
        cat.concat_all_strings();
        scan.close();
    }
}