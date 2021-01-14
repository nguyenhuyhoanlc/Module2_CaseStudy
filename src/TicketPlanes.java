import java.io.Serializable;

public abstract class TicketPlanes  implements Serializable {
    private String nameCustomer;
    private String ageCustomer;
    private String dateOfBirthDay;
    private String numberIDCustomer;
    private String phoneNumberCustomer;
    private String addressCustomer;
    private double price;
    private String id;
    private String name;
    private String date;
    private String bag;

    public TicketPlanes() {
    }
//    public TicketPlanes(String id){
//        this.id=id;
//    }
//    public TicketPlanes withName(String name){
//        this.name=name;
//        return this;
//    }
//    public TicketPlanes withDate(String date){
//        this.date=date;
//        return this;
//    }
//    public TicketPlanes build(){
//        return this;
//    }


    public TicketPlanes(String id, String name, String date, String bag, int price) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.bag = bag;
        this.price = price;
    }

    public TicketPlanes(String id, String name, String date, String bag, double price, String nameCustomer, String ageCustomer, String dateOfBirthDay, String numberIDCustomer, String phoneNumberCustomer, String addressCustomer) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.bag = bag;
        this.price = price;
        this.nameCustomer = nameCustomer;
        this.ageCustomer = ageCustomer;
        this.dateOfBirthDay = dateOfBirthDay;
        this.numberIDCustomer = numberIDCustomer;
        this.phoneNumberCustomer = phoneNumberCustomer;
        this.addressCustomer = addressCustomer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBag() {
        return bag;
    }

    public void setBag(String bag) {
        this.bag = bag;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getAgeCustomer() {
        return ageCustomer;
    }

    public void setAgeCustomer(String ageCustomer) {
        this.ageCustomer = ageCustomer;
    }

    public String getDateOfBirthDay() {
        return dateOfBirthDay;
    }

    public void setDateOfBirthDay(String dateOfBirthDay) {
        this.dateOfBirthDay = dateOfBirthDay;
    }

    public String getNumberIDCustomer() {
        return numberIDCustomer;
    }

    public void setNumberIDCustomer(String numberIDCustomer) {
        this.numberIDCustomer = numberIDCustomer;
    }

    public String getPhoneNumberCustomer() {
        return phoneNumberCustomer;
    }

    public void setPhoneNumberCustomer(String phoneNumberCustomer) {
        this.phoneNumberCustomer = phoneNumberCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public double getPromotion() {
        return 0;
    }

    @Override
    public String toString() {
        return "TicketPlanes{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", bag='" + bag + '\'' +
                ", price=" + price +
                ", nameCustomer='" + nameCustomer + '\'' +
                ", ageCustomer='" + ageCustomer + '\'' +
                ", dateOfBirthDay='" + dateOfBirthDay + '\'' +
                ", numberIDCustomer='" + numberIDCustomer + '\'' +
                ", phoneNumberCustomer='" + phoneNumberCustomer + '\'' +
                ", addressCustomer='" + addressCustomer + '\'' +
                '}';
    }
}

