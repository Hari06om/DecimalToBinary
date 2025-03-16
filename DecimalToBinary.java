import java.util.*;

public class DecimalToBinary {
    //  Construct a Decimal number to be converted to Binary format using the specified number
    public static void bintodec(int n){
        int mynum =n;
        int p =0;
        int binnum =0;
        while(n>0){
            int rem = n % 2;
            binnum= binnum + (rem *(int) Math.pow(10,p));
            p++;
            n /=2;
        }
        System.out.println("The Binary number of "+mynum+" is "+binnum);
    }
    // Main method to calculate the number of points in the decimal number
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal number: ");
        int n = sc.nextInt();
        bintodec(n);
        sc.close();
    }
}
