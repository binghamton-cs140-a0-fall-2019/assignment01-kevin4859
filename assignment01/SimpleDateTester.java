package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class SimpleDateTester {
    	public static void main(String[] args) {

        SimpleDate exampleDate = SimpleDate.of(2040,8,19);
        SimpleDate date = SimpleDate.of(2041,10,19);

        System.out.println(exampleDate.before(date));

        try(var output =new PrintWriter(new FileOutputStream(
      new File("output.txt"), true /* true means append to file */))) {
  output.println("\nTESTS FOR SimpleDate.java:");

  SimpleDate exampleDate2 = SimpleDate.of(2040,8,19);
  SimpleDate date2 = SimpleDate.of(2041,10,19);

  output.println(exampleDate.before(date2));


//Copy all your lines above, add an extra "2" to every variable name
// and replace every System.out.print or System.out.println
// by output.print or output.println
} catch (FileNotFoundException e) {
  e.printStackTrace();
}
}
}
