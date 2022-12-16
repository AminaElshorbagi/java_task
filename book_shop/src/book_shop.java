public class book_shop {

    public static void main(String[] args) {
        product [] book_arr = new product[3];
        book_arr[0]=new childrenbook("book1",100);
        book_arr[1]=new book("book2",1345);
        book_arr[2]=new childrenbook("book3",1524);
        for (product p : book_arr)
        {
            p.print();
        }





    }
}