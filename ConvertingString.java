
import java.util.Scanner;

public class ConvertingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character =");
        String str = sc.nextLine();
        String a = str.toUpperCase();
        int b = str.length();
     
        String c = str.replace( 'b','s');
        String subString=str.substring(0,8);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(subString);


        

        


        sc.close();
    }
    
}
