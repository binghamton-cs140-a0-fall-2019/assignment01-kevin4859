package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester {
    	public static void main(String[] args) {

        StreetUSAddress kofiHouse = new StreetUSAddress("100 Casals Place","Apt 22H","Bronx","NY", "10475");
        DateAndPlaceOfBirth kofiDOB = new DateAndPlaceOfBirth(2000,8,4,"Bronx","NY","USA");
        Person kofi = new Person("Kofi", "Agyapong", "123-44-5678", kofiDOB,kofiHouse);

        System.out.println(kofi);

        try(var output =new PrintWriter(new FileOutputStream(
      new File("output.txt"), true /* true means append to file */))) {
  output.println("\nTESTS FOR Person.java:");

  StreetUSAddress kofiHouse2 = new StreetUSAddress("100 Casals Place","Apt 22H","Bronx","NY", "10475");
  DateAndPlaceOfBirth kofiDOB2 = new DateAndPlaceOfBirth(2000,8,4,"Bronx","NY","USA");
  Person kofi2 = new Person("Kofi", "Agyapong", "123-44-5678", kofiDOB2,kofiHouse2);

  output.println(kofi2);

//Copy all your lines above, add an extra "2" to every variable name
// and replace every System.out.print or System.out.println
// by output.print or output.println
} catch (FileNotFoundException e) {
  e.printStackTrace();
}
}
}
