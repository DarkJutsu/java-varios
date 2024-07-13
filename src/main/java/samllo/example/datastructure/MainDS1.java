package samllo.example.datastructure;

import dao.AlumnoDAO;
import model.Alumno;

public class MainDS1 {
    public static void main(String[] args) {
        AlumnoDAO alumnos = new AlumnoDAO();

        for (Alumno alumno : alumnos.getAlumnos()) {
            System.out.printf("ID: %d, Nombre: %s, Apellido: %s, Fecha Nacimineto: %s.\n",
                    alumno.id(), alumno.nombre(), alumno.apellido(), alumno.fecha());
        }
    }
}
