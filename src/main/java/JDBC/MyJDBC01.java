package main.java.JDBC;
import java.sql.*;

public class MyJDBC01 {

    public static void main(String[] args) {
        Connection conexion = null;


        try{

            conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc_estudiantes", "root", "flamenco99");

            Statement statement = conexion.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM estudiante");


            while(resultSet.next()){
                System.out.println(resultSet.getString(1) + " - " + resultSet.getString(3) + " - " + resultSet.getString(4));
            }

        }catch (SQLException sqlException){

            System.out.println(sqlException);
            if(conexion != null){
                try{
                    conexion.rollback();
                } catch (SQLException sqlException1){
                    System.out.println(sqlException1);
                }
            }

        }finally{

            try{
                if(conexion != null){
                    conexion.close();
                }
            }catch (SQLException sqlException){
                System.out.println(sqlException);
            }

        }

    }

}