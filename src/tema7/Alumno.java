package tema7;

import java.time.LocalDate;


class Alumno {
    
    private String nombre;
    private LocalDate fechaNacimiento;

    public Alumno(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    } 
    
}
