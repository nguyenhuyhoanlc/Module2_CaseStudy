import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Running {
    static Manager manager = new Manager();
    static Scanner sc = new Scanner(System.in);
    static final String REGEX_VNAIRLINE = "^VN+[0-9]{3}+[0-9]*?$";
    static final String REGEX_VNVIETJET = "^VJ+[0-9]{3}$";
    static final String REGEX_VNJETSTAR = "^JET+[0-9]{3}$";
    public static void main(String[] args) {
        List<TicketPlanes> ticketPlanesList = new ArrayList<>();
        int choice;
        do {
            System.out.println("1.Nhập thông tin vé máy bay mới");
            System.out.println("2.Hiển thị thông tin toàn bộ chuyến bay");
            System.out.println("3.Tìm kiếm vé máy bay đã đặt");
            System.out.println("4.Xoá thông tin vé đã đặt");
            System.out.println("5.Sửa thông tin vé đã đặt");
            System.out.println("6.Sắp xếp thông tin vé đã đặt theo giá");
            System.out.println("7.Thoát chương trình");
            System.out.println("Choice :");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
//                    String id;
//                    do {
//                        System.out.println("Nhập mã chuyến bay :");
//                            id = sc.nextLine();
//                        if (Manager.validate(REGEX_VNAIRLINE,id)){
//                            System.out.println("Nhập tên chuyến bay :");
//                            String name = sc.nextLine();
//                            System.out.println("Nhập ngày tháng bay :");
//                            String date = sc.nextLine();
//                            System.out.println("Nhập số kg hành lý mang theo (Tối đa 25 kg)");
//                            String bag = sc.nextLine();
//                            System.out.println("Nhập giá vé : ");
//                            double price = sc.nextDouble();
//                            System.out.println("Nhập tên khách hàng :");
//                            String nameCustomer = sc.nextLine();
//                            sc.nextLine();
//                            System.out.println("Nhập tuổi khách hàng :");
//                            String ageCustomer = sc.nextLine();
//                            System.out.println("Nhập ngày tháng năm sinh khách hàng :");
//                            String dateOfBirthDay = sc.nextLine();
//                            System.out.println("Nhập số CMT khách hàng :");
//                            String numberIdCustomer = sc.nextLine();
//                            System.out.println("Nhập số điện thoại khách hàng :");
//                            String numberPhoneCustomer = sc.nextLine();
//                            System.out.println("Nhập địa chỉ nơi ở :");
//                            String addressCustomer = sc.nextLine();
//                            System.out.println("Nhập địa chỉ email :");
//                            String email = sc.nextLine();
//                            TicketPlanes ticketPlanes = new TicketPlanesVietNamAirline(id,name,date,bag,price,nameCustomer,ageCustomer,dateOfBirthDay,numberIdCustomer,numberPhoneCustomer,addressCustomer,email);
//                            manager.addNewTicketPlanes(ticketPlanes);
//                        } else if (Manager.validate(REGEX_VNVIETJET,id)){
//                            Object[] aa=addNew();
//                            System.out.println("Nhập vocher :");
//                            String vocher = sc.nextLine();
//                            TicketPlanes ticketPlanes = new TicketPlanesVietNamAirline(id,(String) aa[0],aa[1],aa[2],vocher);
//                            manager.addNewTicketPlanes(ticketPlanes);
//                        } else if (Manager.validate(REGEX_VNJETSTAR,id)){
//                            System.out.println(" Nhập tên chuyến bay :");
//                            String name = sc.nextLine();
//                            System.out.println(" Nhập ngày tháng bay :");
//                            String date = sc.nextLine();
//                            System.out.println(" Nhập số kg hành lý mang theo (Tối đa 20 kg)");
//                            String bag = sc.nextLine();
//                            System.out.println(" Nhập giá vé : ");
//                            double price = sc.nextDouble();
//                            System.out.println(" Nhập tên khách hàng :");
//                            String nameCustomer = sc.nextLine();
//                            System.out.println(" Nhập tuổi khách hàng :");
//                            String ageCustomer = sc.nextLine();
//                            System.out.println(" Nhập ngày tháng năm sinh khách hàng :");
//                            String dateOfBirthDay = sc.nextLine();
//                            System.out.println(" Nhập số CMT khách hàng :");
//                            String numberIdCustomer = sc.nextLine();
//                            System.out.println(" Nhập số điện thoại khách hàng :");
//                            String numberPhoneCustomer = sc.nextLine();
//                            System.out.println(" Nhập địa chỉ nơi ở :");
//                            String addressCustomer = sc.nextLine();
//                            System.out.println("Nhập số điện thoại người thân");
//                            String relativePhoneNumbe = sc.nextLine();
//                            TicketPlanes ticketPlanes = new TicketPlanesVietNamAirline(id,name,date,bag,price,nameCustomer,ageCustomer,dateOfBirthDay,numberIdCustomer,numberPhoneCustomer,addressCustomer,relativePhoneNumbe);
//                            manager.addNewTicketPlanes(ticketPlanes);
//                        }
//                    }while (!(Manager.validate(REGEX_VNAIRLINE,id)||Manager.validate(REGEX_VNVIETJET,id)||Manager.validate(REGEX_VNJETSTAR,id)));
//                    break;
                    System.out.println("Nhập vé máy bay của hãng bạn muốn mua: 1.VietJet    2.JetStar    3.VietNamAirLine");
                    int choose = sc.nextInt();
                    addNew(choose);
                    break;
                case 2:
                    manager.showAllTicketPlanes();
                    break;
                case 3:
                    System.out.println("Nhập mã chuyến bay cần tìm :");
                    String id1 = sc.nextLine();
                    manager.searchTicketPlanes(id1);
                    break;
                case 4:
                    System.out.println("Nhập mã chuyến bay cần xoá :");
                    String id2 = sc.nextLine();
                    manager.deleteTicketPlanes(id2);
                    break;
                case 5:
                    System.out.println("Nhập mã chuyến bay cần sửa :");
                    String id3 = sc.nextLine();
//                    manager.editTicketPlanes(id3,);
                    break;
                case 6:
                case 7:
            }
        }while (choice != 0);
        System.exit(0);
    }

    public static Object addNew(int choice){
        String id;
        System.out.println(" Nhập tên chuyến bay :");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.println(" Nhập ngày tháng bay :");
        String date = sc.nextLine();
        System.out.println(" Nhập số kg hành lý mang theo (Tối đa 20 kg)");
        String bag = sc.nextLine();
        System.out.println(" Nhập giá vé : ");
        double price = sc.nextDouble();
        System.out.println(" Nhập tên khách hàng :");
        String nameCustomer = sc.nextLine();
        sc.nextLine();
        System.out.println(" Nhập tuổi khách hàng :");
        String ageCustomer = sc.nextLine();
        System.out.println(" Nhập ngày tháng năm sinh khách hàng :");
        String dateOfBirthDay = sc.nextLine();
        System.out.println(" Nhập số CMT khách hàng :");
        String numberIdCustomer = sc.nextLine();
        System.out.println(" Nhập số điện thoại khách hàng :");
        String numberPhoneCustomer = sc.nextLine();
        System.out.println(" Nhập địa chỉ nơi ở :");
        String addressCustomer = sc.nextLine();
        switch (choice) {
            case 1:
                do {
                    System.out.println("Nhập mã chuyến bay :");
                    id = sc.nextLine();
                } while (!id.matches(REGEX_VNVIETJET));
                System.out.println("Nhập vocher :");
                String vocher = sc.nextLine();
                TicketPlanes ticketPlanesVietJet = new TicketPlanesVietJet(id, name, date, bag, price, nameCustomer, ageCustomer, dateOfBirthDay, numberIdCustomer, numberPhoneCustomer, addressCustomer, vocher);
                return ticketPlanesVietJet;
            case 2:
                do {
                    System.out.println("Nhập mã chuyến bay :");
                    id = sc.nextLine();
                } while (!id.matches(REGEX_VNJETSTAR));
                System.out.println("Nhập số điện thoại người thân :");
                String relativePhoneNumber = sc.nextLine();
                TicketPlanes ticketPlanesJetStar = new TicketPlanesJetStar(id, name, date, bag, price, nameCustomer, ageCustomer, dateOfBirthDay, numberIdCustomer, numberPhoneCustomer, addressCustomer, relativePhoneNumber);
                return ticketPlanesJetStar;
            case 3:
                do {
                    System.out.println("Nhập mã chuyến bay :");
                    id = sc.nextLine();
                } while (!id.matches(REGEX_VNAIRLINE));
                System.out.println("Nhập email :");
                String email = sc.nextLine();
                TicketPlanes ticketPlaneVietNamAirline = new TicketPlanesVietNamAirline(id, name, date, bag, price, nameCustomer, ageCustomer, dateOfBirthDay, numberIdCustomer, numberPhoneCustomer, addressCustomer, email);
                return ticketPlaneVietNamAirline;
        }
        return addNew(choice);
    }
}
