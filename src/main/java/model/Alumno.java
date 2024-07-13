package model;

import java.time.LocalDate;

public record Alumno(int id, String nombre, String apellido, LocalDate fecha) {
}
