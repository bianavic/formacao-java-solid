package org.edu.fabs.DIP.problem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {

    public static Connection createConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sample";
        String usuario = "root";
        String senha = "root";

        Connection connection = null;
        connection = DriverManager.getConnection(url, usuario, senha);

        return connection;
    }

}
