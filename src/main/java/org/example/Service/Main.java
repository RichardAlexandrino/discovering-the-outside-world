package org.example.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String filePath = "C:\\CursoJAVA\\Workspace\\discovering-the-outside-world\\superHeroList.txt";

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            PrintService.printLines(scanner);

            PrintService.printReport(file);

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());

        }

    }

}
