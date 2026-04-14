import java.util.Scanner;
public class practicalno2 {
    public int cyclecount(int n){
        int count =1;
        while(n!=1){
            if(n%2==0){
                n=n/2;
            }
            else{
                n=3*n+1;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        practicalno2 obj = new practicalno2();
        int count = obj.cyclecount(n);
        System.out.println("The cycle count for " + n + " is: " + count);
        sc.close();
    }
}