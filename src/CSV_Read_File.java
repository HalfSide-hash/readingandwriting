import java.io.*;
import java.util.Scanner;
public class CSV_Read_File {
    public static void main(String[] args) throws Exception {
    	File file = new File("csit111.csv");
        Scanner scan = new Scanner(file);
        while (scan.hasNext()) {
        	System.out.println(scan.nextLine());
        } 
        
        scan.close();
    }
}
