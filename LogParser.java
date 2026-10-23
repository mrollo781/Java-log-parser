package thejavalogparserscript;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LogParser {
    public static void main(String[] args) {
        String logFilePath = "server_log.txt"; // Text file

        try (BufferedReader reader = new BufferedReader(new FileReader(logFilePath))) {
            String line;
            System.out.println("--- Scanning System Log File ---"); 
            
            while ((line = reader.readLine()) != null) { 
                if (line.contains("ERROR")) { 
                    System.out.println("[ALERT] Critical issue detected: " + line.trim()); 
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading log file: " + e.getMessage()); 
        }
    }
}
