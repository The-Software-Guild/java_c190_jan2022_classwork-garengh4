package ClassesAndObjects.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterIO {
    public static void main(String[] args) throws Exception{
        // Writing to a file
        PrintWriter out = new PrintWriter(new FileWriter("OutWriterFile.txt"));
        out.println("this is a line in my file...");
        out.println("a second line in my file");
        out.println("a third line in my file");
        out.flush();
        out.close();

        // Reading from a file
        Scanner sc = new Scanner(new BufferedReader(new FileReader("OutwriterFile.txt")));
        // going through the file line by line
        while(sc.hasNextLine()){
            String currentLine = sc.nextLine();
            System.out.println(currentLine);
        } 
    }
}