import java.time.LocalDate;

public class Empleado {

        private String nombre;
        private String apellido;
        private Double sueldo;
        private LocalDate fechaNacimiento;

        public Empleado( String nombre, String apellido, LocalDate fechaNacimiento, Double sueldo ){
            this.nombre = nombre;
            this.apellido = apellido;
            this.fechaNacimiento = fechaNacimiento;
            this.sueldo = sueldo;
        }

        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }
        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public LocalDate getFechaNacimiento() {
            return fechaNacimiento;
        }
        public void setFechaNacimiento(LocalDate fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }

        public double getSueldo() {
            return sueldo;
        }
        public void setSueldo(double sueldo) {
            this.sueldo = sueldo;
        }
}


