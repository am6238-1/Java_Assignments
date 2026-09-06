package sem3_week4_practice;

public class ques_1 {

        static void main() {

            String[] titles = {"Clean Code", "Untitled Draft", "1984", "Notes"};
            String[] isbns = {"978-0132350884", "", "9780451524935", ""};

            for (int i = 0; i < titles.length; i++) {

                LibraryBook book;

                if (isbns[i].isEmpty()) {
                    book = new LibraryBook(titles[i]);
                } else {
                    book = new LibraryBook(titles[i], isbns[i]);
                }

                book.printStatus();
            }
        }
    }

    class LibraryBook {

        String title;
        String isbn;
        boolean catalogued;

        public LibraryBook(String title, String isbn) {
            this.title = title;
            this.isbn = isbn;
            this.catalogued = true;
        }

        public LibraryBook(String title) {
            this(title, "PENDING");
        }

        void printStatus() {
            System.out.println(title + " | " + isbn + " | Catalogued: " + catalogued);
        }
    }
