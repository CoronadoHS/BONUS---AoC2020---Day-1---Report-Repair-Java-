import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class TestStudentCode {

    private int[] sampleLines = readIntsFromFile("src/main/java/sample.txt");
    private int[] actualLines = readIntsFromFile("src/main/java/inputs-day1.txt");

    @BeforeEach                                         
    public void setUp() throws Exception {
    }

    @Test                                               
    @DisplayName("partASample()")   
    public void testPartASample() {
        System.out.println("***Testing to see if partA(lines) returns 514579");
        assertEquals(514579, StudentCode.partA(sampleLines),      
        "Should be 514579");          
    }
    
    @Test                                               
    @DisplayName("partAActual()")   
    public void testPartAActual() {
        System.out.println("***Testing to see if partA(lines) returns 211899");
        assertEquals(211899, StudentCode.partA(actualLines),      
        "Should be 211899");          
    }

    @Test                                               
    @DisplayName("partBSample()")   
    public void testPartBSample() {
        System.out.println("***Testing to see if partB(lines) returns 241861950");
        assertEquals(241861950, StudentCode.partB(sampleLines),      
        "Should be 241861950");          
    }
    
    @Test                                               
    @DisplayName("partBActual()")   
    public void testPartBActual() {
        System.out.println("***Testing to see if partB(lines) returns 275765682");
        assertEquals(275765682, StudentCode.partB(actualLines),      
        "Should be 275765682");          
    }

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
    
}
