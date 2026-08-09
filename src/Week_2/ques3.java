package Week_2;
import java.util.*;
public class ques3 {
    static void parseInventoryRecord(String csvLine){
      String[] word=csvLine.split(",");
      if(word.length!=3){
          System.out.println("Invalid Record");
      }
      System.out.println("Product: "+word[0]+" | SKU: "+word[1]+" | Qty: "+word[2]);



    }
    static void main(){
        Scanner sc=new Scanner(System.in);
        String csvLine=sc.nextLine();
        parseInventoryRecord(csvLine);
    }
}
