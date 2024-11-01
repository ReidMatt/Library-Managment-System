package Main;

import Items.Book;
import Items.LibraryItem;
import Users.Student;

public class LibraryManagementDemo {
  public static void main(String[] args) {
    LibraryItem library = new LibraryItem();

    //Add example data
      new Student("Doug Moore", "12 West Street", "782-9876");
      library.addPatron();

      new Book(1, "Java Programming", "Jim Smith", "7097854321", "TechBooks", 3, true, true, true);
      library.addLibraryItem();

    //Test borrowing a book
    library.borrowItem();
    //Display borrow item
  }
}
