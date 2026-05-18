package com.management;
//package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.io.FileInputStream;

public class DBConnectionManager {

    public static Connection getConnection() {

        Connection con = null;

        try {

            Properties props = new Properties();

            FileInputStream fis =
                    new FileInputStream("database.properties");

            props.load(fis);

            String driver = props.getProperty("driver");
            String url = props.getProperty("url");
            String username = props.getProperty("username");
            String password = props.getProperty("password");

            Class.forName(driver);

            con = DriverManager.getConnection(
                    url, username, password);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}




//echo "# sample" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/Gopinath0306/sample.git
//git push -u origin main
