import java.sql.*;
import java.util.Scanner;

public class CRUD_jdbc {
    //
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        // JDBC  URL
        final String jdbc_url = "jdbc:mysql://localhost:3306/College";

        //  Database credentials
        final String user_id = "root";
        final String password = "MJK618";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(jdbc_url, user_id, password);
            Statement stmt = conn.createStatement();

            System.out.println("\n\tConnection  to the Database Established.\n" +
                    "Welcome to the JDBC CRUD Operations Program");

            int ch;

            Scanner sc = new Scanner(System.in);
            //mainMenu();
            System.out.println("Enter 1 to continue");
            ch = sc.nextInt();

            if (ch == 1) {
                //menu();
                do {
                    //jdbc_operations_menu();
                    System.out.println("\n--- Menu ---");
                    System.out.println("1. Show All Tables");
                    System.out.println("2. Create New Table");
                    System.out.println("3. Operate on Tables");
                    System.out.println("4. Drop a table");
                    System.out.println("8. Exit");
                    System.out.println("Enter Your Choice: ");
                    ch = sc.nextInt();
                    switch (ch) {
                        case 1:
                            showTables(stmt);
                            break;
                        case 2:
                            createTable(stmt);
                            System.out.println("** Showing all tables in database ** ");
                            showTables(stmt);
                            break;
                        case 3:
                            operateOnTablesMenu(sc, stmt);
                            break;
                        case 4:
                            //dropATable();
                            System.out.println("dropATable");
                            break;
                        //System.exit(-1);
                        default:
                            System.out.println("\n\t XXXXX--" +
                                    " INVALID INPUT --XXXXX \n");
                    }
                } while (ch != 9);

            } else {
                System.out.println("End");
            }

            //String query_2 = "insert into student(roll_no, first_name, last_name, course, address) values (8649,'Divyanshu','Rawat','Hindi','Mars')";
//            ResultSet rs = stmt.executeQuery("select * from student");
//            net.efabrika.util.DBTablePrinter.printResultSet(rs);


        } catch (SQLException e) {
            System.out.println("Connection Failed" + e);
        } finally {

            System.out.println("Connection Closed");
            assert conn != null;
            conn.close();
        }


    }

    private static void operateOnTablesMenu(Scanner sc, Statement stmt) throws SQLException {
        System.out.println("operateOnTables");
        int ch1;
        do {
            //tableOperationsMenu();
            System.out.println("1. Insert row in a Table");
            System.out.println("2. Update row in a Table");
            System.out.println("3. Delete row in a Table");
            System.out.println("4. To go to previous menu");
            ch1 = sc.nextInt();
            switch (ch1) {
                case 1:
                    //insertRowInTable();
                    System.out.println("insertRowInTable");
                    ResultSet rs;
                    //String current_table_name = "student";
                    String query = String.format("SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS where TABLE_NAME = N'student'");
                    //String query = String.format("desc `%s`", current_table_name.replace("`", "``"));
                    stmt.execute(query);
                    rs = stmt.getResultSet();
                    net.efabrika.util.DBTablePrinter.printResultSet(rs);
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter roll");
                    int roll = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter fname");
                    String fname = scanner.nextLine();
                    System.out.println("Enter lname");
                    String lname = scanner.nextLine();
                    System.out.println("Enter coursename");
                    String coursename = scanner.nextLine();
                    System.out.println("Enter addr");
                    String addr = scanner.nextLine();
                    String query_1 = "insert into student(roll_no, first_name, last_name, course, address) values ('" + roll + "','" + fname + "','" + lname + "','" + coursename + "','" + addr + "')";
                    //String query_1 = "insert into student(roll_no, first_name, last_name, course, address) values (8649,'fname','lname','coursename','addr')";
                    stmt.execute(query_1);
                    break;
                case 2:
                    //updateRowInTable();
                    System.out.println("updateRowInTable");
                    break;
                case 3:
                    //deleteRowInTable();
                    System.out.println("deleteRowInTable");
                    break;
                //System.exit(0);
                case 4:
                    ch1 = 9;

                default:
                    System.out.println("\n\t XXXXX--" +
                            " INVALID INPUT --XXXXX \n");
            }
        } while (ch1 != 9);
    }

    private static void createTable(Statement stmt) {
        System.out.println("Enter new table name:\n => ");
        Scanner scanner = new Scanner(System.in);
        String table_name = scanner.nextLine();
        String query = String.format("create table `%s` (id int auto_increment primary key)", table_name.replace("`", "``"));

        try {
            stmt.execute(query);
            System.out.println("Table " + table_name + " successfully created");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    private static void showTables(Statement stmt) throws SQLException {
        ResultSet rs;
        stmt.executeQuery("show tables ");
        rs = stmt.getResultSet();
        net.efabrika.util.DBTablePrinter.printResultSet(rs);
    }
//    public static void menu() throws SQLException {
//        int ch;
//        do {
//            jdbc_operations_menu();
//
//            Scanner sc = new Scanner(System.in);
//            ch = sc.nextInt();
//            switch (ch) {
//
//                case 1:
//                    showTables();
//                    break;
//                case 2:
//                    createTable();
//                    break;
//                case 3:
//                    operateOnTables();
//                    break;
//                case 4:
//                    dropATable();
//                    break;
//                    //System.exit(0);
//                default:
//                    System.out.println("\n\t XXXXX--" +
//                            " INVALID INPUT --XXXXX \n");
//            }
//        } while (ch != 9);
//
//    }

//    public static void operateOnTables() throws SQLException {
//        System.out.println("operateOnTables");
//
//        int ch1;
//        do {
//            tableOperationsMenu();
//
//            Scanner sc = new Scanner(System.in);
//            ch1 = sc.nextInt();
//            switch (ch1) {
//
//                case 1:
//                    insertRowInTable();
//                    break;
//                case 2:
//                    updateRowInTable();
//                    break;
//                case 3:
//                    deleteRowInTable();
//                    break;
//                //System.exit(0);
//                case 4:
//                    menu();
//                default:
//                    System.out.println("\n\t XXXXX--" +
//                            " INVALID INPUT --XXXXX \n");
//            }
//        } while (ch1 != 9);
//
//    }
//
//    public static void tableOperationsMenu() {
//        System.out.println("1. Insert row in a Table");
//        System.out.println("2. Update row in a Table");
//        System.out.println("3. Delete row in a Table");
//        System.out.println("4. To go to previous menu");
//
//    }
//
//     public static void dropATable() throws SQLException {
//        chooseTable();
//        System.out.println("dropATable");
//    }
//
//    public static void deleteRowInTable() throws SQLException {
//        chooseTable();
//        System.out.println("deleteRowInTable");
//    }
//
//    public static void updateRowInTable() throws SQLException {
//        chooseTable();
//        System.out.println("updateRowInTable");
//    }
//
//    public static void insertRowInTable() throws SQLException {
//        chooseTable();
//        System.out.println("insertRowInTable");
//    }
//
//    public static void chooseTable() throws SQLException {
//        System.out.println("chooseTable");
//        showTables();
//        System.out.println("Enter table name:\n => ");
//        Scanner sc = new Scanner(System.in);
//        current_table_name = sc.nextLine();
//
//    }
//
//    public static void createTable() throws SQLException {
//        System.out.println("createTable");
//        Statement stmt = null;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter new table name:\n => ");
//        String table_name = sc.nextLine();
//        try {
//            stmt.executeQuery("create table " + table_name);
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//    }
//
//    public static void showTables() throws SQLException {
//        System.out.println("showTables");
//        try {
//            stmt.executeQuery("show tables ");
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//    }
//    public static void jdbc_operations_menu() {
//        System.out.println("\n--- Menu ---");
//        System.out.println("1. Show All Tables");
//        System.out.println("2. Create New Table");
//        System.out.println("3. Operate on Tables");
//        System.out.println("4. Drop a table");
//        System.out.println("8. Exit");
//        System.out.println("Enter Your Choice: ");
//    }
}





