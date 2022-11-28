package biography_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Biography {    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println(Author.askFirstName);
    String firstName = scan.nextLine();

    System.out.println(Author.askLastName);
    String lastName = scan.nextLine();

    System.out.println(Author.askCountry);
    String country = scan.nextLine();

    System.out.println(Author.isAuthorAlive);
    boolean isAlive = scan.nextLine().toLowerCase().startsWith("y");

    ArrayList<Book> booksList = new ArrayList<>();
    ArrayList<Author> authors = new ArrayList<>();
    String enterInfo;
    if (isAlive) {
        System.out.println(Author.askAge);
        int age = scan.nextInt();
        scan.nextLine();
    }
    do {
        System.out.println(Book.askBook);
        enterInfo = scan.nextLine();
        if (enterInfo.toLowerCase().equals("y")) {
            System.out.println(Book.askBook);
            String name = scan.nextLine();

            System.out.println(Book.bookGenre);
            String genre = scan.nextLine();

            System.out.println(Book.pages);
            int totalPages = scan.nextInt();
            scan.nextLine();
            Book books = new Book(name,genre,totalPages);
            booksList.add(books);
        }else System.out.println("THE END RESULT OF ABOVE PROGRAM");
    } while (enterInfo.toLowerCase().equals("y"));
    int age = 0;
    Author author = new Author(firstName,lastName,country,isAlive,age,booksList);
    authors.add(author);
    System.out.println("Author's information = " + authors);
    System.out.println("Author's books are as listed below: ");
    for (Book b : booksList) {
        System.out.println(b);
    }
//booksList.forEach(System.out::print);
    /**
     * WORK ON BOOK AND AUTHOR CLASSES FIRST
     This will be our actual program that we define author and his books
     In this program we will write the biography of Stefan Zweig, an Austrian novelist.


     Write a program that will get information from user and
     -Print information for the favorite author
     -Print information of the books of favorite author

     Full name = Stefan Zweig
     County = Austria
     Is still alive: No (28 November 1881 – 22 February 1942)
     Some of his books as listed below:

     BookName                            Genre           TotalPage
     Amok                                tale            189
     The Royal Game                      novella         53
     24 Hours in the Life of a Woman     novella         80
     */

        /*
        Expected result:
        Author's information = Author{firstName='Stefan', lastName='Zweig', country='Austria', isAlive=false}
        Author's books are as listed below:
        Book{name='Amok', genre:'tale', page=189}
        Book{name='The Royal Game', tale='novella', page=53}
        Book{name='24 Hours in the Life of a Woman', tale='novella', page=80}
         */

    //YOUR CODE HERE

}
}