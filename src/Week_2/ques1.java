package Week_2;
import java.util.*;
public class ques1 {
    static void checkPinLength(String pin) {
        if (pin.length() == 4)
            System.out.println("PIN length OK");
        else
            System.out.println("Invalid PIN — must be exactly 4 digits");
    }
    static void main(){
        Scanner sc=new Scanner(System.in);
        String pin=sc.nextLine();
         checkPinLength(pin);
    }
}
