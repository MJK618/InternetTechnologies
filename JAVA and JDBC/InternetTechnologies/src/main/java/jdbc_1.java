import java.sql.*;
import java.util.Scanner;

public class jdbc_1 {
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
                            showTables(stmt);
                            break;
                        case 2:
                            showStudentTableRows(stmt);
                            break;
                        case 3:
                            insertRowInStudentTable(stmt);
                            break;
                        case 4:
                            deleteRowThreeStudent(stmt);
                            break;
                        case 5:
                            showRowsAyushFname(stmt);
                            break;
                        case 6:
                            showTeacherTableRows(stmt);
                            break;
                        case 7:
                            insertRowTeacherTable(stmt);
                            break;
                        case 8:
                            addDrToRitaInTeacher(stmt);
                            break;
                        case 9:
                            addDrToAllInTeacher(connection);
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

    private static void showRowsAyushFname(
            Statement stmt) throws SQLException {
        ResultSet rs;
        stmt.execute("Select * from student " +
                "where first_name = 'Ayush'");
        rs = stmt.getResultSet();
        net.efabrika.util.DBTablePrinter.printResultSet(rs);
    }

    private static void mainMenu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Show All Table Names");
        System.out.println("2. Show all Rows in " +
                "Table: student");
        System.out.println("3. Insert Row in " +
                "Table: student");
        System.out.println("4. Delete Row with " +
                "ID = 3 in Table: student");
        System.out.println("5. Select all Rows " +
                "with first_name = 'Ayush' in " +
                "Table: student");
        System.out.println("6. Show all Rows in " +
                "Table: teacher");
        System.out.println("7. Insert Row in " +
                "Table: teacher");
        System.out.println("8. Update Row with " +
                "suffix Dr. for first_name 'Rita' " +
                "in Table: teacher");
        System.out.println("9. Update all Rows with " +
                "suffix Dr. for first_name in " +
                "Table: teacher");
        System.out.println("-1. Exit");
        System.out.println("Enter Your Choice: ");
    }

    private static void addDrToAllInTeacher(
            Connection connection) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement(
                "UPDATE teacher set first_name " +
                        "= CONCAT('Dr. ',first_name)");
        stmt.execute();
        System.out.println("Successfully Updated" +
                " all teacher's first_name to " +
                "Dr. first_name");
    }

    private static void addDrToRitaInTeacher(
            Statement stmt) throws SQLException {
        stmt.execute("UPDATE teacher set " +
                "first_name = CONCAT('Dr. '," +
                "first_name) where first_name = 'Rita'");
        System.out.println("Successfully " +
                "Updated Rita to Dr. Rita");
    }

    private static void insertRowTeacherTable(
            Statement stmt) throws SQLException {
        ResultSet rs;
        String query = String.format("SELECT " +
                "COLUMN_NAME FROM " +
                "INFORMATION_SCHEMA.COLUMNS " +
                "where TABLE_NAME = N'teacher'");
        stmt.execute(query);
        rs = stmt.getResultSet();
        net.efabrika.util.DBTablePrinter.printResultSet(rs);
        System.out.println("The teacher table " +
                "has columns as listed above\n" +
                "To insert into teacher " +
                "(first_name, last_name, course)\n" +
                "Enter the following inputs: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String fname = scanner.nextLine();
        System.out.println("Enter last name: ");
        String lname = scanner.nextLine();
        System.out.println("Enter course of teacher: ");
        String coursename = scanner.nextLine();
        String query_1 = "insert into teacher(" +
                "first_name, last_name, course) " +
                "values ('" + fname + "','"
                + lname + "','" + coursename + "')";
        stmt.execute(query_1);
        System.out.println("Inserted row values(" +
                fname + ", " + lname + ", " +
                coursename + ") in table teacher\n1 " +
                "row affected");
    }

    private static void showTeacherTableRows(
            Statement stmt) throws SQLException {
        ResultSet rs;
        stmt.executeQuery("SELECT * from teacher");
        rs = stmt.getResultSet();
        net.efabrika.util.DBTablePrinter.printResultSet(rs);
    }

    private static void deleteRowThreeStudent(
            Statement stmt) throws SQLException {
        stmt.execute("DELETE from student where " +
                "S_id = 3");
        System.out.println("Successfully Deleted " +
                "student with S_id = 3");
    }

    private static void showStudentTableRows(
            Statement stmt) throws SQLException {
        ResultSet rs;
        stmt.executeQuery("SELECT * from student");
        rs = stmt.getResultSet();
        net.efabrika.util.DBTablePrinter.printResultSet(rs);
    }

    private static void showTables(
            Statement stmt) throws SQLException {
        ResultSet rs;
        stmt.executeQuery("SHOW tables ");
        rs = stmt.getResultSet();
        net.efabrika.util.DBTablePrinter.printResultSet(rs);
    }

    private static void insertRowInStudentTable(
            Statement stmt) throws SQLException {
        ResultSet rs;
        String query = String.format("SELECT COLUMN_NAME" +
                " FROM INFORMATION_SCHEMA.COLUMNS " +
                "where TABLE_NAME = N'student'");
        stmt.execute(query);
        rs = stmt.getResultSet();
        net.efabrika.util.DBTablePrinter.printResultSet(rs);
        System.out.println("The student table has " +
                "columns as listed above\n" +
                "To insert into student(roll_no, " +
                "first_name, last_name, course, " +
                "address)\n" +
                "Enter the following inputs: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter roll number: ");
        int roll = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter first name: ");
        String fname = scanner.nextLine();
        System.out.println("Enter last name: ");
        String lname = scanner.nextLine();
        System.out.println("Enter course of " +
                "student: ");
        String coursename = scanner.nextLine();
        System.out.println("Enter address of " +
                "student: ");
        String addr = scanner.nextLine();

        String query_1 = "insert into student(" +
                "roll_no, first_name, last_name, " +
                "course, address) values ('"
                + roll + "','" + fname + "','"
                + lname + "','" + coursename +
                "','" + addr + "')";
        stmt.execute(query_1);
        System.out.println("Inserted row values(" + roll +
                ", " + fname + ", " + lname + ", "
                + coursename + ", "
                + addr + ") in table student\n1 row affected");
    }


}







