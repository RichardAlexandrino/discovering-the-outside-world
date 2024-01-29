package org.example.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintService {
    public static void printLines(Scanner scanner) {
        System.out.println("Superheroes List: \n");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        System.out.println();
    }

    public static void printReport(File file) {
        try (Scanner scanner = new Scanner(file)) {
            int lineCount = 0;
            int charCount = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineCount++;
                charCount += line.length();
            }

            System.out.println("Report: \n");
            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of characters: " + charCount);

        } catch (FileNotFoundException e) {
            System.err.println("Error reading the file for the report: " + e.getMessage());
        }
    }
}
