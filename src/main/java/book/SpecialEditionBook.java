package book;

public class SpecialEditionBook extends Book{

    ///As a percentage
    float discount = 0;

    public SpecialEditionBook() {
        super();
    }

    public SpecialEditionBook(int bno, String bName, float price, float discount) {
        super(bno, bName, price);
        this.discount = discount;
    }

    public float getDiscountAmount(){
        float factor = discount/100;
        return factor * price;
    }

    @Override
    public String toString() {
        return super.toString() +
                " With a discount of "+ discount +"% which is: £" + getDiscountAmount();
    }

    public void display(){
        System.out.print(this.toString());
    }
}
