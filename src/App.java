import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    static List<SavingsAccount> savingsAccList = new ArrayList<>();
    public static void main(String[] args) throws Exception {

        initAccount("savings_account.csv");
        displayMenu();

    }

    public static void initAccount(String fileName) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String a = br.readLine();

        while ((a = br.readLine()) != null) {
            String[] b = a.split(",");

            savingsAccList.add(new SavingsAccount(b[0], b[1], Double.parseDouble(b[2]), Double.parseDouble(b[3])));
            
        }

    }

    public static void displayMenu() {
        
        

    }
}
