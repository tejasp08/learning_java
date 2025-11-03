import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
        String write = "This is writing through fileWriter.";
        String write2 = " Hello World!!!";
        try {
            //creating a writer using fileWriter
            FileWriter writeOut = new FileWriter("output.txt");

            //writing string to file
            writeOut.write(write);
            writeOut.write(write2);
            System.out.println("Data is written");

            writeOut.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

        //Buffered Writer
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Buffered.txt"))){
            bw.write("Writing first line");
            bw.newLine();   //line break
            bw.write("Writing second line");
            System.out.println("Successfully wrote in the text file");
        } catch (Exception e) {
            System.out.println("Error in writing file!");
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Buffered.txt", true))){
            bw.newLine();
            bw.write("Appended new line");
            System.out.println("Successfully appended in the text file");
        } catch (Exception e) {
            System.out.println("Error writing file");
        }

        //Buffered reader
        try (BufferedReader br = new BufferedReader(new FileReader("Buffered.txt"))){
            System.out.println("Text in the file: ");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error in reading file");
        }
    }
}
