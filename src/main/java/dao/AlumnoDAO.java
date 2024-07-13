package dao;

import model.Alumno;
import utils.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlumnoDAO {
    Conexion cnn = new Conexion();
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public List<Alumno> getAlumnos() {
        List<Alumno> listAlumn = new ArrayList<>();
        String query = "SELECT * FROM alumno";
        try {
            conn = cnn.getConn();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alu = new Alumno(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido"), rs.getDate("fecha").toLocalDate());
                listAlumn.add(alu);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listAlumn;
    }
}
