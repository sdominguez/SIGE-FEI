package com.lis.connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySQLConnection {

    private final String bd;
    private final String host;
    private final String port;
    private final String driver;
    private final String user;
    private final String pass;

    public MySQLConnection() {
        //Properties prop = readPropertiesFile("C:\\Users\\sauld\\Documents\\NetbeansProjects\\FEI_QUIZ\\src\\main\\webapp\\META-INF\\config_data.properties");
        Properties prop = readPropertiesFile("config_data.properties");

        bd = prop.getProperty("dbname");
        host = prop.getProperty("host");
        port = prop.getProperty("port");
        driver = prop.getProperty("driver");
        user = prop.getProperty("userName");
        pass = prop.getProperty("password");
    }

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName(driver);
        String URL = "jdbc:mysql://" + host + ":" + port + "/" + bd + "?useSSL=false&serverTimezone=UTC";
        return DriverManager.getConnection(URL, user, pass);
    }

    public static Properties readPropertiesFile(String fileName) {
        FileInputStream fis = null;
        Properties prop = null;
        try {
            File directory = new File("./");
            String path = directory.getCanonicalPath()+"\\src\\main\\webapp\\META-INF\\";
            fis = new FileInputStream(path+fileName);
            prop = new Properties();
            prop.load(fis);
        } catch (FileNotFoundException fnfe) {
        } catch (IOException ioe) {
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {}
        }
        return prop;
    }
}
