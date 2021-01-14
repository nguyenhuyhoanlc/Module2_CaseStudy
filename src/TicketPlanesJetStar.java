public class TicketPlanesJetStar extends TicketPlanes{
    private String relativePhoneNumber;

    public TicketPlanesJetStar(String relativePhoneNumber) {
        this.relativePhoneNumber = relativePhoneNumber;
    }

    public TicketPlanesJetStar(String id, String name, String date, String bag, int price, String relativePhoneNumber) {
        super(id, name, date, bag, price);
        this.relativePhoneNumber = relativePhoneNumber;
    }

    public TicketPlanesJetStar(String id, String name, String date, String bag, double price, String nameCustomer, String ageCustomer, String dateOfBirthDay, String numberIDCustomer, String phoneNumberCustomer, String addressCustomer, String relativePhoneNumber) {
        super(id, name, date, bag, price, nameCustomer, ageCustomer, dateOfBirthDay, numberIDCustomer, phoneNumberCustomer, addressCustomer);
        this.relativePhoneNumber = relativePhoneNumber;
    }

    public String getRelativePhoneNumber() {
        return relativePhoneNumber;
    }

    public void setRelativePhoneNumber(String relativePhoneNumber) {
        this.relativePhoneNumber = relativePhoneNumber;
    }

    @Override
    public double getPromotion(){
        double promotion = 0.012;
        return promotion * getPrice();
    }
}
