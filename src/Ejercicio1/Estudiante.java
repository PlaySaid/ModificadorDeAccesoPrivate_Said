package Ejercicio1;

public class Estudiante {
    
    private String nombre;
    private Integer edad;
    private double notaPromedio;
    
    public Estudiante(String nombre, Integer edad, Double notaPromedio){
        setNombre(nombre);
        setEdad(edad);
        setNotaPromedio(notaPromedio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("Por favor ingrese el nombre para continuar.");
        }
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        if (edad == null){
            throw new IllegalArgumentException("Por favor ingrese la edad para continuar.");
        }
        else if (edad < 0){
            throw new IllegalArgumentException("La edad no puede ser un numero negativo.");
        }
        this.edad = edad;
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(Double notaPromedio) {
        if (notaPromedio == null){
            throw new IllegalArgumentException("Por favor ingrese la nota promedio para continuar.");
        }
        else if(notaPromedio < 0 || notaPromedio > 10){
            throw new IllegalArgumentException("Por favor ingrese una nota promedio entre 0 y 10");
        }
        this.notaPromedio = notaPromedio;
        
        
    }
        @Override
    public String toString(){
        return "----Estudiante----"+"\nNombre: "+nombre+"\nEdad: "+edad+"\nNota Promedio: "+notaPromedio;
    }
    
}
