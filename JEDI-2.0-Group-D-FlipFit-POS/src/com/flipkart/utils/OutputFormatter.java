package com.flipkart.utils;

import java.util.List;

public interface OutputFormatter {
	
	public static void outputData(List<String>headers, List<List> data) { 
        // ANSI escape code for bold text
        String bold = "\u001B[1m";
        // ANSI escape code for resetting text to default
        String reset = "\u001B[0m";

        for (String header : headers) {
            System.out.print(bold + String.format("%-20s", header) + reset);
        }
        System.out.println();

        // Print table data
        for (List<String> row : data) {
            for (int i = 0; i<row.size(); i++) {
                System.out.printf("%-20s", row.get(i)); // Adjust the width as needed
            }
            System.out.println();
        }
	}

}
