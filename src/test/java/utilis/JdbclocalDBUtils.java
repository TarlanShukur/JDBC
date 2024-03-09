package utilis;

import java.sql.*;

public class JdbclocalDBUtils {


    static Connection connection;
    static Statement statement;
    public static Connection connectToDataBase(){

        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_db","techpro","password");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public static Statement createStatement(){
        Statement statement = null;
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return statement;
    }

    public static ResultSet executuiveQuery(String sql){
        try {
            return statement.executeQuery(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }










}

