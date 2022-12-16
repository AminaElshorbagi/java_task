public class product {
    protected String name;
    protected float price;
   /* public void print(){
        System.out.println("book{" +
                "name='" + name + '\'' +"price"+discount_prise()+
                '}');
    }*/

    public product(String name , float price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void print() {
            System.out.println("book{" +
                    "name='" + name + '\'' +"price"+price+
                    '}');
        }
    }

