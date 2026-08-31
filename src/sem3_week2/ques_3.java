package sem3_week2;
import java.util.*;
public class ques_3 {
        static void parseInventoryRecord(String csvLine) {

            String[] fields = csvLine.split(",");

            if (fields.length != 3) {

                System.out.println("Invalid Record");
            }
            else {

                String product = fields[0];
                String sku = fields[1];
                String quantity = fields[2];

                System.out.println("Product: " + product + " | SKU: " + sku + " | Qty: " + quantity);
            }
        }

        static void main() {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter inventory record: ");
            String csvLine = sc.nextLine();

            parseInventoryRecord(csvLine);
        }
    }

