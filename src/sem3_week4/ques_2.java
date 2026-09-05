package sem3_week4;

public class ques_2 {

        static void main() {

            Item[] items = {
                    new Item("Samosa", 15),
                    new Item("Tea Powder", 40),
                    new Item("Bread", 8),
                    new Item("Biscuit Packs", 25)
            };

            for (Item item : items) {

                item.restock();

                System.out.println(item.itemName +
                        " | Final Stock: " + item.stock);
            }
        }
    }

    class Item {

        String itemName;
        int stock;

        Item(String itemName, int stock) {
            this.itemName = itemName;
            this.stock = stock;
        }

        void restock() {
            this.stock = this.stock + 20;
        }
    }
