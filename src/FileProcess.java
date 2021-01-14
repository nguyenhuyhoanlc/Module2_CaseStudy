import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileProcess {
    public static final String FILEPATH = "DuLieuChuyenBay.dat";

    public static void writeObjectToFile(List<TicketPlanes> a){
        try {
            FileOutputStream out = new FileOutputStream(FILEPATH);
            ObjectOutputStream oss = new ObjectOutputStream(out);
            oss.writeObject(a);
            oss.flush();
            oss.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
