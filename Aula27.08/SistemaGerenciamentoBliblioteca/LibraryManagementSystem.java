package SistemaGerenciamentoBliblioteca;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem book = new Book("1984", "George Orwell", 1949, "Distopia");
        LibraryItem magazine = new Magazine("National Geographic", "Vários Autores", 2023, 150);
        LibraryItem digitalMedia = new DigitalMedia("Inception", "Christopher Nolan", 2010, "MP4");
        LibraryItem[] items = {book, magazine, digitalMedia};
        for (LibraryItem item : items) {
            System.out.println("-----");
            item.displayInfo();
            item.borrow();
            item.borrow();
            item.returnItem();
            item.returnItem();
            if (item instanceof Book) {
                ((Book) item).readSample();
            } else if (item instanceof Magazine) {
                ((Magazine) item).flipPages();
            } else if (item instanceof DigitalMedia) {
                ((DigitalMedia) item).play();
            }
            System.out.println();
        }
    }
}
