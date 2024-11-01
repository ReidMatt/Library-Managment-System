package Users;

import java.util.ArrayList;
import java.util.List;

import Items.LibraryItem;

public abstract class Patron {
  private List<LibraryItem> borrowedItems;

  public Patron(String name, String address, String phoneNumber) {
    this.borrowedItems = new ArrayList<>();
  }

  public void borrowItem(LibraryItem item) {
    borrowedItems.add(item);
  }
  
  public void returnItem(LibraryItem item) {
    borrowedItems.remove(item);
  }

  //Getters and setters here
}
