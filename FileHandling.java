import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        //Creating a File
        //creating a file object
        File file = new File("newFile.txt");
        
        try {
            //creating a file based on object
            boolean value = file.createNewFile();

            if (value) {
                System.out.println("New file is created");
            } else {
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }


        //Reading a File
        //first writing manually in the newFile.txt and then reading it
        try {
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error has occured!");
            e.printStackTrace();
        }

        //Writing in file
        String write = "This is writing through fileWriter";
        try {
            //creating a writer using fileWriter
            FileWriter writeOut = new FileWriter("output.txt");

            //writing string to file
            writeOut.write(write);
            System.out.println("Data is written");

            writeOut.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
