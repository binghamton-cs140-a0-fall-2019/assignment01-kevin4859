package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
    	public static void main(String[] args) {
    	//TODO make 4 different Computer objects with different
    	//combinations of disk size (two more than a terabyte and two less)
    	//and for each make one an SSD drive and the other not.
    	//Then call System.out.println(comp); for each "comp" object
    	//and observe that there are small differences in how the computer
    	//information prints out.
      Computer microsoft = new Computer("Microsoft", "super fast cpu", 6, 1100, true, 800);
      Computer sony = new Computer("Sony", "newly renovated cpu", 6, 800, false, 750);
      Computer apple = new Computer("Apple", "the all new Amber Lake Cpu", 8, 1200, true, 1000);
      Computer toshiba = new Computer("Toshiba", "Japan's all new cpu", 6, 750, false, 500);
      System.out.println(microsoft);
      System.out.println(sony);
      System.out.println(apple);
      System.out.println(toshiba);


    		try(var output =new PrintWriter(new FileOutputStream(
    			    new File("output.txt"), true /* true means append to file */))) {
    			output.println("\nTESTS FOR Computer.java:");

          Computer microsoft2 = new Computer("Microsoft", "super fast cpu", 6, 1100, true, 800);
          Computer sony2 = new Computer("Sony", "newly renovated cpu", 6, 800, false, 750);
          Computer apple2 = new Computer("Apple", "the all new Amber Lake Cpu", 8, 1200, true, 1000);
          Computer toshiba2 = new Computer("Toshiba", "Japan's all new cpu", 6, 750, false, 500);
          output.println(microsoft2);
          output.println(sony2);
          output.println(apple2);
          output.println(toshiba2);
    		//Copy all your lines above, add an extra "2" to every variable name
    		// and replace every System.out.print or System.out.println
    		// by output.print or output.println
    		} catch (FileNotFoundException e) {
    			e.printStackTrace();

    		}
    	}
    }
