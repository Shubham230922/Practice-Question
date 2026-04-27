//find the count of string integer float in a sentance
import java.util.Scanner;

public class practiceQ1 {
    public void count(String str){
        String [] words=str.split(" ");
        int ic=0;
        int fc=0;
        int cc=0;
        for (String word : words) {
            // Remove punctuation like commas
            word = word.replaceAll("[^a-zA-Z0-9.]", "");

            try {
                if (word.contains(".")) {
                    Double.parseDouble(word);
                    fc++;
                } else {
                    Integer.parseInt(word);
                    ic++;
                }
            } catch (NumberFormatException e) {
                if (!word.isEmpty()) {
                    cc++;
                }
            }
        }

        System.out.println("Integers: " + ic);
        System.out.println("Floats: " + fc);
        System.out.println("Strings: " + cc);
    }


    
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String str= sc.nextLine();
    practiceQ1 obj = new practiceQ1();
    obj.count(str);
    sc.close();
}
}
