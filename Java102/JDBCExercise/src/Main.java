import java.sql.*;

public class Main {
    public static final String DB_URL = "jdbc:mysql://localhost/employee";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connection;
        Statement statement;
        String query = "SELECT * FROM employees";
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            statement = connection.createStatement();
            ResultSet data = statement.executeQuery(query);

            while (data.next()){
                System.out.println("id: " + data.getInt("id"));
                System.out.println("name: " + data.getString("name") );
                System.out.println("title: " + data.getString("title"));
                System.out.println("salary: " + data.getString("salary"));
                System.out.println();
            }

        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
