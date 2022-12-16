public class book extends product{
    public void print(){
        System.out.println("book{" +
                "name='" + name + '\'' +"   price="+discount_prise()+
                '}');
    }

    public book(String name, float price) {
        super(name, price);
    }


    public double discount_prise(){
        return (super.getPrice()*0.3);
    }

    @Override
    public String toString() {
        return "book{" +
                "name='" + name + '\'' +
                '}';
    }
}
