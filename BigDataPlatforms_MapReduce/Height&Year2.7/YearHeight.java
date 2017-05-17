package ecp.bigdata.yearheight;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;



public class YearHeight {
      @SuppressWarnings({ "resource", "deprecation" })
	public static void main(String[] args) {
            try {
            String fName = "/home/cloudera/Desktop/TreeDataSet/arbres.csv";
            String thisLine;
            FileInputStream fis;
                fis = new FileInputStream(fName);
            DataInputStream myInput = new DataInputStream(fis);
            File file = new File ("output.txt");
            PrintStream printStreamToFile = new PrintStream(file);
            System.setOut(printStreamToFile);
            while ((thisLine = myInput.readLine()) != null) {
                String col[] = thisLine.split(";");
                System.out.println("Year - " + col[5] + " , Height-" + col[6]);
                             
                }
              }catch(IOException e){
                  e.printStackTrace();
              }
        
}
}    