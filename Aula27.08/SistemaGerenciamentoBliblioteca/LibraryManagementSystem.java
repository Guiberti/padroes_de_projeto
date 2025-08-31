package SistemaGerenciamentoBliblioteca;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Criar instâncias dos materiais
        LibraryItem book = new Book("1984", "George Orwell", 1949, "Distopia");
        LibraryItem magazine = new Magazine("National Geographic", "Vários Autores", 2023, 150);
        LibraryItem digitalMedia = new DigitalMedia("Inception", "Christopher Nolan", 2010, "MP4");
        // Array para demonstrar polimorfismo
        LibraryItem[] items = {book, magazine, digitalMedia};
        for (LibraryItem item : items) {
            System.out.println("-----");
            item.displayInfo();
            item.borrow();
            item.borrow(); // tentar emprestar novamente para testar
            item.returnItem();
            item.returnItem(); // tentar devolver novamente para testar
            // Comportamentos específicos via instanceof e cast
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
