package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerOwnerTester {
    	public static void main(String[] args) {

        StreetUSAddress kevinHouse = new StreetUSAddress("100 Casals Place","Apt 22H","Bronx","NY", "10475");
        DateAndPlaceOfBirth kevinDOB = new DateAndPlaceOfBirth(2000,8,4,"Bronx","NY","USA");
        Person kevin = new Person("Kevin","Agyapong","876-55-4321", kevinDOB, kevinHouse);

        ComputerOwner kevOwner = new ComputerOwner(kevin);

        Computer microsoft = new Computer("Microsoft", "super fast cpu", 6, 1100, true, 800);
        Computer sony = new Computer("Sony", "newly renovated cpu", 6, 800, false, 750);
        Computer apple = new Computer("Apple", "the all new Amber Lake Cpu", 8, 1200, true, 1000);
        Computer toshiba = new Computer("Toshiba", "Japan's all new cpu", 6, 750, false, 500);

        kevOwner.addComputer(microsoft);
        kevOwner.addComputer(sony);
        kevOwner.addComputer(apple);
        kevOwner.addComputer(toshiba);

        System.out.println(kevOwner);

        kevOwner.removeComputer(0);
        kevOwner.removeComputer(1);

        System.out.println(kevOwner);

        try(var output =new PrintWriter(new FileOutputStream(
      new File("output.txt"), true /* true means append to file */))) {
  output.println("\nTESTS FOR ComputerOwner.java:");

  StreetUSAddress kevinHouse2 = new StreetUSAddress("100 Casals Place","Apt 22H","Bronx","NY", "10475");
  DateAndPlaceOfBirth kevinDOB2 = new DateAndPlaceOfBirth(2000,8,4,"Bronx","NY","USA");
  Person kevin2 = new Person("Kevin","Agyapong","876-55-4321", kevinDOB2, kevinHouse2);

  ComputerOwner kevOwner2 = new ComputerOwner(kevin2);

  Computer microsoft2 = new Computer("Microsoft", "super fast cpu", 6, 1100, true, 800);
  Computer sony2 = new Computer("Sony", "newly renovated cpu", 6, 800, false, 750);
  Computer apple2 = new Computer("Apple", "the all new Amber Lake Cpu", 8, 1200, true, 1000);
  Computer toshiba2 = new Computer("Toshiba", "Japan's all new cpu", 6, 750, false, 500);

  kevOwner.addComputer(microsoft2);
  kevOwner.addComputer(sony2);
  kevOwner.addComputer(apple2);
  kevOwner.addComputer(toshiba2);

  output.println(kevOwner2);

  kevOwner.removeComputer(0);
  kevOwner.removeComputer(1);

  output.println(kevOwner2);

//Copy all your lines above, add an extra "2" to every variable name
// and replace every System.out.print or System.out.println
// by output.print or output.println
} catch (FileNotFoundException e) {
  e.printStackTrace();
}
}
}
