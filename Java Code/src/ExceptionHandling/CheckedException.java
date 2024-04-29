package ExceptionHandling;

import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class CheckedException {
    public static void main(String[] args) {
        File f = new File("text.txt");
        Scanner sc;
        // sc = new Scanner(f); // this is FileNotFoundException
        // we show an error before compiling or running the code, because this is checked exception
        //sc.close();
        
        // for each checked exception we must have to handle this, otherwise we cannot run the code
    	try {
            FileInputStream file = new FileInputStream("somefile.txt"); // FileNotFoundException
            int b;
            while ((b = file.read()) != -1) { //file.read() is IOException
                System.out.print((char) b);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    	
    	try {
            Class<?> cls = Class.forName("com.example.MyClass"); // ClassNotFoundException
            // Use the class
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
        
    	// SQLException
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "username", "password");
                Statement stmt = conn.createStatement()) {
               ResultSet rs = stmt.executeQuery("SELECT * FROM users");
               while (rs.next()) {
                   System.out.println(rs.getString("name"));
               }
         } catch (SQLException e) {
               System.out.println("SQL Error: " + e.getMessage());
         }
           
    }
	
}
