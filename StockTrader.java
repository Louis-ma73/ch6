import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class StockTrader {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("tiny.txt"));
        String symbol = in.next();
        int n = in.nextInt();

       int [] years = new int[];
       int [] month = new int[];
       double [] price = new double[];

        LoadDeta (in year, month, price);
    }
    public static void loadDeta( Scanner in, int[] year, int[] month, double[] price);
           for (int i = 0; i<price.length; i++) {
             years[i] = in.nextInt();
             month[i] = in.nextInt();
             price[i] = in.nextDoulbe();
    }
}
    public static String monthName(int month){
       String[] names = {"Jan", "Fed", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};
       return names [month-1];
    }
    public static void printDeta (int[] years, int[] months, double[] price){
           for (int i =0; i<price.length; i++){
             System.out.println(year[i], month[i], price[i]);
         }
 }

    public static int indexOflowest(double[] price){
