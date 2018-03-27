import java.io.*;
import java.util.Scanner;
public class CSV_Mod_File {
    public static void main(String[] args) throws IOException {
    	String str = "";
    	File file = new File("csit111.csv");
        Scanner scan = new Scanner(file);
        PrintWriter outFile = new PrintWriter("newFile.txt");
        while (scan.hasNext()) {
        	str = scan.nextLine();
        	if (str.contains("Midterm"))
        	outFile.println(str+","+"Sum");
         	else
        	outFile.println(str + "," + (Double.parseDouble(str.split(",")[1]) + Double.parseDouble(str.split(",")[2])));
        	
        }
        outFile.close();
        scan.close();
    }
}