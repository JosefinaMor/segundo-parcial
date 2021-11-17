package main.java.JDBC;

import java.sql.*;

public class MyJDBC02 {

    Connection connexion1 = null;


        try {

        connexion1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc_estudiantes", "root", "flamenco99");
        connexion1.setAutoCommit(false);

        PreparedStatement consultaPreparada = connexion1.prepareStatement("INSERT INTO estudiante (dni, nombre, apellido) VALUES (?, ?, ?);");

        Statement statement = connexion1.createStatement();

        String consultaSql = "SELECT * FROM estudiante";

        consultaPreparada.setInt(1,42148467);
        consultaPreparada.setString(2,"josefina");
        consultaPreparada.setString(3,"morales");
        consultaPreparada.executeUpdate();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM estudiante");

        connexion1.commit();

        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + " - " + resultSet.getString(3) + " - " + resultSet.getString(4));
        }

    } catch (SQLException sqlException) {

        System.out.println(sqlException);
        if (connexion1 != null) {
            try {
                connexion1.rollback();
            } catch (SQLException sqlException1) {
                System.out.println(sqlException1);
            }
        }

    } finally {

        try {
            if (connexion1 != null) {
                connexion1.close();
            }
        } catch (SQLException sqlException) {
            System.out.println(sqlException);
        }

    }
}
