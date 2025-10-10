import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentCode {
    public static void main(String[] args) {
        // an example showing how to read the input from the sample.txt file into a list
        int[] lines = readIntsFromFile("sample.txt");  // change this filename when you are ready to run your program on the actual inputs

        /**
         *No real need to edit anything below here
         */
        
        // here is where your parts actually run and return their results!
        System.out.println(partA(lines));
        System.out.println(partB(lines));
    }

    // ------------------------------------------------------------------------------------------------------------------------------------------------

    // TODO: Complete Part A!
    public static long partA(int[] lines) {
        return -1;
    }

    // TODO: Complete Part B!
    public static long partB(int[] lines) {
        return -1;
    }

    // ------------------------------------------------------------------------------------------------------------------------------------------------


    /**
     * A method to read Strings from a file into an array that is then returned.
     * Pass in the path to the file you want to read.
     */
    public static String[] readStringsFromFile(String fileName) {
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            int lineCount = 0;

            while (myReader.hasNextLine()) {
                myReader.nextLine();
                lineCount++;
            }
            myReader.close();

            String[] lines = new String[lineCount];
            Scanner myReader2 = new Scanner(myObj);
            int index = 0;
            while (myReader2.hasNextLine()) {
                String data = myReader2.nextLine();
                lines[index] = data;
                index++;
            }
            myReader2.close();
            return lines;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            String[] dummy = new String[1];
            return dummy;
        }
    }

    /**
     * A method to read ints from a file into an array that is then returned.
     * Pass in the path to the file you want to read.
     */
	public static int[] readIntsFromFile(String fileName) {
		try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            int lineCount = 0;

            while (myReader.hasNextLine()) {
                myReader.nextLine();
                lineCount++;
            }
            myReader.close();

            int[] lines = new int[lineCount];
            Scanner myReader2 = new Scanner(myObj);
            int index = 0;
            while (myReader2.hasNextLine()) {
                int data = Integer.parseInt(myReader2.nextLine());
                lines[index] = data;
                index++;
            }
            myReader2.close();
            return lines;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            int[] dummy = new int[1];
            return dummy;
        }
            
    }

    /**
     * A method to read longs from a file into an array that is then returned.
     * Pass in the path to the file you want to read.
     */
	public static long[] readLongsFromFile(String fileName) {
		try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            int lineCount = 0;

            while (myReader.hasNextLine()) {
                myReader.nextLine();
                lineCount++;
            }
            myReader.close();

            long[] lines = new long[lineCount];
            Scanner myReader2 = new Scanner(myObj);
            int index = 0;
            while (myReader2.hasNextLine()) {
                long data = Long.parseLong(myReader2.nextLine());
                lines[index] = data;
                index++;
            }
            myReader2.close();
            return lines;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            long[] dummy = new long[1];
            return dummy;
        }
    }
	
        
}
