import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentManager {

    static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    static final String USER = "root";
    static final String PASSWORD = "password";

    public static void addStudent(int id, String name, String course) {

        String sql = "INSERT INTO students VALUES (?, ?, ?)";

        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, course);

            ps.executeUpdate();

            System.out.println("Student added successfully!");

            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        addStudent(101, "Naveenkumar", "B.Sc Computer Science");
    }
}
