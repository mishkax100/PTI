package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
    private String user = "hr";
    private String password = "oracle";
    private Connection connection = null;
//    private Statement statement;

    /**
     * Creates a new instance of UserConnection
     */
    public DatabaseConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(jdbcURL, user, password);

            System.out.println("koneksi berhasil");
        } catch (Exception ex) {
            System.out.println("message: " + ex.getMessage());
        }
    }

    public boolean isConnected() {
        return connection != null;
    }

    public boolean getClosed() {
        if (isConnected()) {
            try {
                connection.close();
                connection = null;
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            return true;
        } else {
            return false;
        }
    }

    public String getJdbcURL() {
        return jdbcURL;
    }

    public void setJdbcURL(String jdbcURL) {
        this.jdbcURL = jdbcURL;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConn(Connection connection) {
        this.connection = connection;
    }

    public void executeUpdate(String query) throws SQLException {
        try {

            java.sql.Statement statement = getConnection().createStatement();
            java.sql.ResultSet result = statement.executeQuery(query);
            statement.close();
        } catch (Exception ex) {
        }
    }
}
