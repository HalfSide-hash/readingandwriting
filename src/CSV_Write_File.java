import java.io.*;
import java.util.Scanner;
public class CSV_Write_File {
    public static void main(String[] args) throws IOException {
    	String str = "";
    	File file = new File("csit111.csv");
        Scanner scan = new Scanner(file);
        PrintWriter outFile = new PrintWriter("newFile.txt");
        while (scan.hasNext())
        	outFile.println(scan.nextLine());

        outFile.close();
        scan.close();
    }
}