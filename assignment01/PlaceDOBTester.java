package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {
    	public static void main(String[] args) {

        //In the main method make 5 DateAndPlaceOfBirth objects 3 with birth places in the USA (with a State) and 2 from other countries using the 2nd constructor that does not have a state parameter.
        //Give two objects the same birth date and have another object with the same birthday (day and month) but a different birth year.
        //Use System.out.println to print each of the 5 objects and then to print the values of the four other methods that are not getter methods, e.g., System.out.println(object1.hasSameBirthDayAs(object2)).

        DateAndPlaceOfBirth birth1 = new DateAndPlaceOfBirth(2000,8,4,"Los Angeles","California","USA");
        DateAndPlaceOfBirth birth2 = new DateAndPlaceOfBirth(2000,8,4,"New York","New York","USA");
        DateAndPlaceOfBirth birth3 = new DateAndPlaceOfBirth(1996,8,4,"Boston","Massachusetts","USA");
        DateAndPlaceOfBirth birth4 = new DateAndPlaceOfBirth(1980,7,16,"Accra","Ghana");
        DateAndPlaceOfBirth birth5 = new DateAndPlaceOfBirth(2000,8,4,"Lagos","Nigeria");

        System.out.println(birth1);  //printing for objects
        System.out.println(birth2);
        System.out.println(birth3);
        System.out.println(birth4);
        System.out.println(birth5);

        System.out.println(birth1.hasSameBirthDayAs(birth2)); //printing for same birthdays
        System.out.println(birth2.hasSameBirthDayAs(birth3));
        System.out.println(birth3.hasSameBirthDayAs(birth4));
        System.out.println(birth4.hasSameBirthDayAs(birth5));
        System.out.println(birth1.hasSameBirthDayAs(birth5));
        System.out.println(birth2.hasSameBirthDayAs(birth4));
        System.out.println(birth1.hasSameBirthDayAs(birth3));

        try(var output =new PrintWriter(new FileOutputStream(
      new File("output.txt"), true /* true means append to file */))) {
  output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

  DateAndPlaceOfBirth birth12 = new DateAndPlaceOfBirth(2000,8,4,"Los Angeles","California","USA");
  DateAndPlaceOfBirth birth22 = new DateAndPlaceOfBirth(2000,8,4,"New York","New York","USA");
  DateAndPlaceOfBirth birth32 = new DateAndPlaceOfBirth(1996,8,4,"Boston","Massachusetts","USA");
  DateAndPlaceOfBirth birth42 = new DateAndPlaceOfBirth(1980,7,16,"Accra","Ghana");
  DateAndPlaceOfBirth birth52 = new DateAndPlaceOfBirth(2000,8,4,"Lagos","Nigeria");

  output.println(birth12);
  output.println(birth22);
  output.println(birth32);
  output.println(birth42);
  output.println(birth52);

  output.println(birth12.hasSameBirthDayAs(birth22));
  output.println(birth22.hasSameBirthDayAs(birth32));
  output.println(birth32.hasSameBirthDayAs(birth42));
  output.println(birth42.hasSameBirthDayAs(birth52));
  output.println(birth12.hasSameBirthDayAs(birth52));
  output.println(birth22.hasSameBirthDayAs(birth42));
  output.println(birth12.hasSameBirthDayAs(birth32));

//Copy all your lines above, add an extra "2" to every variable name
// and replace every System.out.print or System.out.println
// by output.print or output.println
} catch (FileNotFoundException e) {
  e.printStackTrace();
}
}
}
