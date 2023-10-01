import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class noOfWords {
    public static void main(String[] args) throws IOException {
    
        Scanner b = new Scanner(System.in);
        System.out.print("Enter the word to count occurrences: ");
        String spelling="";
        try {
            spelling = b.nextLine();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        int count = 0;
        int occurrence = 0;
        String loc = "src//main//resources//noofwords.txt";
        try (BufferedReader obj= new BufferedReader(new FileReader(loc))) {
            String line;
            while ((line =obj.readLine()) != null) {
                String[] words = line.split("[\\s,+]");
                for (String word : words) {
                    if (word.equals(spelling)) {
                        occurrence++;
                    }
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        if(occurrence==0)
        {
            System.out.println("The word you typed is not there in the file.");
        }
        else {
            System.out.println("The number of times " + spelling + " has repeated is: " + occurrence);
        }
        System.out.println("The number of words in the file is: " + count);
    }
}


