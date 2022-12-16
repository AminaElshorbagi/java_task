public class childrenbook extends book{

    public childrenbook(String name, float price ) {
        super(name,price);

    }

    public double discount_prise(){
        return (super.getPrice()*0.5);
    }

    public void print(){
        System.out.println("children_book{" +
                "name='" + name + '\'' +"    price="+discount_prise()+
                '}');
    }


}
