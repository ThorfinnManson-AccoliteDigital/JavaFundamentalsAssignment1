package book;

public class Book {
    int bno = -1;
    String bName = "";
    float price = 0.0f;

    public Book() {
    }

    public Book(int bno, String bName, float price) {
        this.bno = bno;
        this.bName = bName;
        this.price = price;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book: " +
                "bno=" + bno +
                ", bName='" + bName + '\'' +
                ", price=" + price;
    }

    public void disp(){
        System.out.print(this.toString() + "\n");
    }
}
