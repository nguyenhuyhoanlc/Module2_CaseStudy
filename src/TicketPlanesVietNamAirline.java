public class TicketPlanesVietNamAirline extends TicketPlanes{
    private String email;

    public TicketPlanesVietNamAirline(String email) {
        this.email = email;
    }

    public TicketPlanesVietNamAirline(String id, String name, String date, String bag, int price, String email) {
        super(id, name, date, bag, price);
        this.email = email;
    }

    public TicketPlanesVietNamAirline(String id, String name, String date, String bag, double price, String nameCustomer, String ageCustomer, String dateOfBirthDay, String numberIDCustomer, String phoneNumberCustomer, String addressCustomer, String email) {
        super(id, name, date, bag, price, nameCustomer, ageCustomer, dateOfBirthDay, numberIDCustomer, phoneNumberCustomer, addressCustomer);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public double getPromotion(){
        double promotion = 0.011;
        return promotion * getPrice();
    }
}
