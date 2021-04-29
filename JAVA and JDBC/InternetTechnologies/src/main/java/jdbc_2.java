import java.sql.*;
import java.util.Scanner;

public class jdbc_2 {
    public static void main(String[] args) throws
            SQLException, ClassNotFoundException {

        // JDBC  URL
        final String jdbc_url = "jdbc:mysql://localhost:3306" +
                "/College";

        //  Database credentials
        final String user_id = "root";
        final String password = "MJK618";
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    jdbc_url, user_id, password);
            Statement stmt = connection.createStatement();
            System.out.println("Connection to the " +
                    "Database Established." +
                    "\n\n\tWelcome to the JDBC CRUD " +
                    "Operations Program");
            int ch = 1;
            Scanner sc = new Scanner(System.in);
            if (ch == 1) {
                do {
                    mainMenu();
                    ch = sc.nextInt();
                    switch (ch) {
                        case 1:
                            showStudentTableRows(stmt);
                            break;
                        case 2:
                            //showTables(stmt);
                            ResultSet rs;
                            stmt.executeQuery("SELECT COUNT(1) FROM student");
                            rs = stmt.getResultSet();
                            net.efabrika.util.DBTablePrinter.printResultSet(rs);

                            break;
                        case -1:
                            ch = -1;
                            break;
                        default:
                            System.out.println("\n\t XXXXX--" +
                                    " INVALID INPUT --XXXXX \n");
                    }
                } while (ch != -1);

            } else {
                System.out.println("End");
            }

        } catch (SQLException e) {
            System.out.println("Connection Failed" + e);
        } finally {

            System.out.println("Connection Closed");
            assert connection != null;
            connection.close();
        }


    }
    private static void showStudentTableRows(
            Statement stmt) throws SQLException {
        ResultSet rs;
        stmt.executeQuery("SELECT * from student");
        rs = stmt.getResultSet();
        net.efabrika.util.DBTablePrinter.printResultSet(rs);
    }
    private static void mainMenu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Show all Rows in Table: student");
        System.out.println("2. Count number of rows in Table: student " +
                "Table: student");
        System.out.println("-1. Exit");
        System.out.println("Enter Your Choice: ");
    }
}







