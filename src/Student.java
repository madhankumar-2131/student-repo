import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Project Title: ");
        String project = sc.nextLine();

        try {
            FileWriter writer = new FileWriter("web/index.html");
            writer.write("<html><head><title>Student Project</title></head><body>");
            writer.write("<h1>Latest Project Submission</h1>");
            writer.write("<p><strong>Name:</strong> " + name + "</p>");
            writer.write("<p><strong>Project:</strong> " + project + "</p>");
            writer.write("</body></html>");
            writer.close();
            System.out.println("Project info saved to web/index.html");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        sc.close();
    }
}
