public class Customer {
    private int ID;
    private String name;
    private int discount;
    private char gender;

    public Customer(int ID, String name, int discount) {
        this.ID = ID;
        this.name = name;
        this.discount = discount;
        this.gender = 'm';
    }

    public int getID() { return ID; }
    public String getName() { return name; }
    public int getDiscount() { return discount; }
    public void setDiscount(int discount) { this.discount = discount; }
    public char getGender() { return gender; }

    @Override
    public String toString() {
        return "name(" + ID + ")";
    }
}
