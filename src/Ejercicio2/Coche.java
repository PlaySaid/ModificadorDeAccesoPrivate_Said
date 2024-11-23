package Ejercicio2;

public class Coche {
    
    private String marca,modelo;
    private double velocidadMaxima;

    public Coche(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public void acelerar(int incremento){
        if (incremento > 0 ){
            velocidadMaxima =+ incremento;
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
    
    
    
}
