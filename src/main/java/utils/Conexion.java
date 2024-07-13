package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {
    Connection conn;

    Properties propsConn() {
        Properties prop = new Properties();
        prop.setProperty("user", "sa");
        prop.setProperty("password", "123");
        return prop;
    }

    public Conexion() {
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/TestJDBC", propsConn());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection getConn() {
        return conn;
    }

}
