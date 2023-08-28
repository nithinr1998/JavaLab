import java.util.*;

class Publisher {
    String name;

    public Publisher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Book {
    String title;
    Publisher publisher;
    int year;
    double price;

    public Book(String title, Publisher publisher, int year, double price) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    
public Publisher getPublisher() {
       
 return publisher;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
}

class Literature extends Book {
    String author;

    public Literature(String title, Publisher publisher, int year, double price, String author) {
        super(title, publisher, year, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class Fiction extends Book {
    String genre;

    public Fiction(String title, Publisher publisher, int year, double price, String genre) {
        super(title, publisher, year, price);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}

public class BookDe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        System.out.println("Welcome to the Bookstore!");

        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. Add a Literature Book");
            System.out.println("2. Add a Fiction Book");
            System.out.println("3. List Literature Books");
            System.out.println("4. List Fiction Books");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
			sc.nextLine();

            if (choice == 1) {
                System.out.println("Please enter the title of the book:");
                String title = sc.nextLine();

                System.out.println("Please enter the name of the publisher:");
                String publisherName = sc.nextLine();
                Publisher publisher = new Publisher(publisherName);

                System.out.println("Please enter the year of publication:");
                int year = sc.nextInt();

                System.out.println("Please enter the price of the book:");
                double price = sc.nextDouble();

                System.out.println("Please enter the name of the author:");
                String author = sc.nextLine();

                Literature literature = new Literature(title, publisher, year, price, author);
                books.add(literature);

                System.out.println("The book has been added successfully!");
            } else if (choice == 2) {
                System.out.println("Please enter the title of the book:");
                String title = sc.nextLine();

                System.out.println("Please enter the name of the publisher:");
                String publisherName = sc.nextLine();
                Publisher publisher = new Publisher(publisherName);

                System.out.println("Please enter the year of publication:");
                int year = sc.nextInt();

                System.out.println("Please enter the price of the book:");
                
double price = sc.nextDouble();

                System.out.println("Please enter the genre of the book: ");
                String genre = sc.nextLine();

                Fiction fiction = new Fiction(title, publisher, year, price, genre);
                books.add(fiction);

                System.out.println("The book has been added successfully!");
            } else if (choice == 3) {
                System.out.println("Here are the Literature books:");
                for (Book book : books) {
                    if (book instanceof Literature) {
                        System.out.println("Title: " + book.getTitle());
                        System.out.println("Publisher: " + book.getPublisher().getName());
                        System.out.println("Year: " + book.getYear());
                        System.out.println("Price: " + book.getPrice());
                        System.out.println("Author: " + ((Literature) book).getAuthor());
                        System.out.println("------------------------");
                    }
                }
            } else if (choice == 4) {
                System.out.println("Here are the Fiction books:");
                for (Book book : books) {
                    if (book instanceof Fiction) {
                        System.out.println("Title: " + book.getTitle());
                        System.out.println("Publisher: " + book.getPublisher().getName());
                        System.out.println("Year: " + book.getYear());
                        System.out.println("Price: " + book.getPrice());
                        System.out.println("Genre: " + ((Fiction) book).getGenre());
                        System.out.println("------------------------");
                    }
                }
            } else if (choice == 5) {
                System.out.println("Thank you for using the Bookstore!");
                break;
            } else {
                System.out.println("Invalid option, please try again.");
            }
        }
    }
}		

