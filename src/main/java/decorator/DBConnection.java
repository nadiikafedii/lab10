package decorator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import lombok.SneakyThrows;

public class DBConnection {

    private static DBConnection dbConnection;
    private Connection connection;

    @SneakyThrows

    private DBConnection() {
        this.connection=DriverManager.getConnection("jdbc:sqlite:/Users/sofiasenkiv/lab10 java/lab10/cache.db");

    }
    @SneakyThrows
    public String getDocument(String gcsPath) {
        PreparedStatement statement = null;
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM document WHERE path=?");
        statement.setString(1, gcsPath);
        ResultSet resultSet = statement.executeQuery();
        return resultSet.getString("parsed");
    }
    @SneakyThrows
    public void createDocument(String gcsPath, String parse) {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO document (path, parsed) VALUES (?, ?)");
        preparedStatement.setString(1, gcsPath);
        preparedStatement.setString(2, parse);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }
    public static DBConnection getInstance() {
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }
}
