package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class USAddressTester {
    	public static void main(String[] args) {

        StreetUSAddress addressA = new StreetUSAddress("4400 Vestal Pkwy E", "", "Binghamton", "NY", "13902");
        StreetUSAddress addressB = new StreetUSAddress("100 Casals Place", "Apt 22H", "Bronx", "NY", "10475");

        System.out.println(addressA);
        System.out.println(addressB);

        try(var output =new PrintWriter(new FileOutputStream(
      new File("output.txt"), true /* true means append to file */))) {
  output.println("\nTESTS FOR StreetUSAddress.java:");

  StreetUSAddress addressA2 = new StreetUSAddress("4400 Vestal Pkwy E", "", "Binghamton", "NY", "13902");
  StreetUSAddress addressB2 = new StreetUSAddress("100 Casals Place", "Apt 22H", "Bronx", "NY", "10475");

  output.println(addressA2);
  output.println(addressB2);


//Copy all your lines above, add an extra "2" to every variable name
// and replace every System.out.print or System.out.println
// by output.print or output.println
} catch (FileNotFoundException e) {
  e.printStackTrace();
}
}
}
