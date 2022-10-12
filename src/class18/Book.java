package class18;

public class Book {
    private String name;
    private int pages;
    private double price;
    private int pubYear;

public Book(String name, int pages, double price){
   this.name=name;
   this.pages=pages;
}
    void printBookInfo(){
    System.out.println("Name of the book "+name);
    System.out.println("Book contains "+pages+" pages" );
}
Book(){
    this("Omen",400,23.5);
        System.out.println(pubYear);

    }

    public static void main(String[] args) {
        new Book("Name",300,20.5).printBookInfo();

        Book b=new Book();
    }
}
