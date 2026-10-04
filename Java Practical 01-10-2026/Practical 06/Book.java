public class Book {
    String bookName = "Java";
    double bookPrice = 512.15; 
    public void bookDetail(){
        System.out.println("Book Name is: " + bookName);
        System.out.println("Book Price is: " + bookPrice);
    }
    public static void main(String[] args) {
        Book obj = new Book();
        obj.bookDetail();
    }
}
