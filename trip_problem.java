
import java.util.Scanner;

class trip_problem{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in );
        // take an n number of student 
        int n=sc.nextInt();
        double[] exp= new double[n];
        double sum=0;
        for(int i=0;i<n;i++){
            exp[i]=sc.nextInt();
            sum+=exp[i];
     
        }
        double avg =sum/n;
        double take=0, give=0;
        for(int i=0;i<n;i++){
            if(exp[i]>avg){
                //math floor-round the no at lowest value
                give+=Math.floor((exp[i]-avg)*100)/100;
            }
            else{
                take+=Math.floor((exp[i]-avg)*100)/100;
            }
            
        }
        double result=Math.min(give,take);
        System.out.printf("$%.2f\n",result);
       sc.close(); 
    }
/* input
3
10.00
20.00
30.00
4
15.00
15.01
3.00
3.01
0
output
$10.00
$11.99
*/

    

}
