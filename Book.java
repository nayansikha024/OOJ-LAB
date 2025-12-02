import java.util.Scanner;

public class Book {

    String name;
    String author;
    float price;
    int numPages;

    public Book(String var1, String var2, float var3, int var4) {
        this.name = var1;
        this.author = var2;
        this.price = var3;
        this.numPages = var4;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String var1) {
        this.name = var1;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String var1) {
        this.author = var1;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float var1) {
        this.price = var1;
    }

    public int getNumPages() {
        return this.numPages;
    }

    public void setNumPages(int var1) {
        this.numPages = var1;
    }

    public String toString() {
        return "Book Name: " + this.name +
               "\nAuthor: " + this.author +
               "\nPrice: ₹" + this.price +
               "\nNumber of Pages: " + this.numPages;
    }

    public static void main(String[] args) {
        Scanner scanner =      new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Book[] books = new Book[count];

        for (int i = 0; i < count; ++i) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Author: ");
            String author = scanner.nextLine();

            System.out.print("Price: ");
            float price = scanner.nextFloat();

            System.out.print("Number of Pages: ");
            int pages = scanner.nextInt();
            scanner.nextLine(); // consume newline

            books[i] = new Book(name, author, price, pages);
        }

        System.out.println("\n--- Book Details ---");
        for (int i = 0; i < count; ++i) {
            System.out.println("\nBook " + (i + 1) + ":");
            System.out.println(books[i]);
        }

        scanner.close();
    }
}