package SistemaGerenciamentoBliblioteca;

public abstract class LibraryItem implements Borrowable {

    protected String title;
    protected String author;
    protected int publicationYear;
    protected boolean isBorrowed;

    public LibraryItem(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isBorrowed = false;
    }

    public void displayInfo() {
        System.out.println("Título " + title);
        System.out.println("Autor " + author);
        System.out.println("Ano de Publicação " + publicationYear);
        System.out.println("Status " + (isBorrowed ? "Emprestado" : "Disponível"));
    }

    @Override
    public void borrow() {
        if (isBorrowed) {
            System.out.println("Item já está emprestado.");
        } else {
            isBorrowed = true;
            System.out.println("Item emprestado com sucesso.");
        }
    }

    @Override
    public void returnItem() {
        if (!isBorrowed) {
            System.out.println("Item não está emprestado.");
        } else {
            isBorrowed = false;
            System.out.println("Item devolvido com sucesso.");
        }
    }
}
