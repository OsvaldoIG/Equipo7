package com.equipo7.nomina;

public class EmpleadoPorHoras extends Empleado{
    private double sueldo;
    private int horas;

    public EmpleadoPorHoras(String nombre, String apellido, String numeroSS, double sueldo, int horas){
        super(nombre,apellido,numeroSS);
        this.sueldo = sueldo;
        this.horas = horas;
    }

    public String ingresos(){
        return ""+getSueldo()*getHoras();
    }
    public void setSueldo( double sueldo ){
        this.sueldo = sueldo;
    }

    public void setHoras( int horas ){
         this.horas = horas;
    }

    public double getSueldo(){
         return sueldo;
    }

    public int getHoras(){
         return horas;
    }
}


