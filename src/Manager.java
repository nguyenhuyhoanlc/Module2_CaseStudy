import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Manager {
    static List<TicketPlanes> ticketPlanesList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    private static Pattern pattern;
    private static Matcher matcher;
    public void addNewTicketPlanes(TicketPlanes ticketPlanes){
        ticketPlanesList.add(ticketPlanes);
    }

    public void deleteTicketPlanes(String id){
        for (int i = 0; i < ticketPlanesList.size(); i++) {
            if (id.equals(ticketPlanesList.get(i).getId())){
                ticketPlanesList.remove(ticketPlanesList.get(i));
            }
        }
    }

    public void searchTicketPlanes(String id){
        for (int i = 0; i < ticketPlanesList.size(); i++) {
            if (id.equals(ticketPlanesList.get(i).getId())){
                System.out.println(ticketPlanesList.get(i));
                break;
            }
        }
        System.out.println("Không tìm thấy vé bạn đã đặt");
    }

    public void editTicketPlanes(String id, TicketPlanes ticketPlanes){
        for (int i = 0; i < ticketPlanesList.size(); i++) {
            if (id.equals(ticketPlanesList.get(i).getId())){
                ticketPlanesList.set(i,ticketPlanes);
                break;
            }
        }
        System.out.println("Không tìm vé bạn đã đặt");
    }

    public void showAllTicketPlanes(){
        for (int i = 0; i < ticketPlanesList.size(); i++) {
            System.out.println(ticketPlanesList.get(i));
        }
    }

    public static boolean validate(String regex,String s) {
         pattern = Pattern.compile(regex);
        matcher = pattern.matcher(s);
        return matcher.matches();
    }

    public static void sort(List<TicketPlanes> ticketPlanesList){
        Collections.sort(ticketPlanesList, new Comparator<TicketPlanes>() {
            @Override
            public int compare(TicketPlanes o1, TicketPlanes o2) {
                if (o1.getPrice() < o2.getPrice()){
                    return -1;
                }
                return 1;
            }
        });
    }
}
