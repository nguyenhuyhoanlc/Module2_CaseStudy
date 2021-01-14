public class TicketPlanesVietJet extends TicketPlanes{
    private String voucher;

    public TicketPlanesVietJet(String voucher) {
        this.voucher = voucher;
    }

    public TicketPlanesVietJet(String id, String name, String date, String bag, int price, String voucher) {
        super(id, name, date, bag, price);
        this.voucher = voucher;
    }

    public TicketPlanesVietJet(String id, String name, String date, String bag, double price, String nameCustomer, String ageCustomer, String dateOfBirthDay, String numberIDCustomer, String phoneNumberCustomer, String addressCustomer, String voucher) {
        super(id, name, date, bag, price, nameCustomer, ageCustomer, dateOfBirthDay, numberIDCustomer, phoneNumberCustomer, addressCustomer);
        this.voucher = voucher;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    @Override
    public double getPromotion(){
        double promotion = 0.01;
        return promotion * getPrice();
    }
}
