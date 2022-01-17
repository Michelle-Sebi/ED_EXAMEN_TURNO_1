/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**EJERCICIO PRÁCTICO EXAMEN EVAL 1 ED
 *
 * @author Michelle Sebi DNI 20840427N
 * @version 1.0
 */

 import java.util.*;

public class Michelle20840427N {
 static final double FACTOR_HORA_EXTRA = 1.2;
 private String nombreCompleto, dni;
 private double salarioBasePorHora = 10.56;
 
 /**
  * Constructor con tres parámetros
  * @param nombreCompleto nombreCompleto nombre completo en mayúsculas
  * @param dni dni documento nacional de identidad con letra y sin espacios
  */
  
 
 public Michelle20840427N(String nombreCompleto, String dni) {
 this.nombreCompleto = nombreCompleto;
 this.dni = dni;
 }
 
 /**Calcula el salario bruto mensual en función del salario base por hora y
las horas extras.
  * El precio por hora de la hora extra se determina con la
constante FACTOR_HORA_EXTRA
  * @param horasExtra horasExtra número de horas extra dedicadas redondeado a la baja (entero)
  * @return devuelve el salario bruto mensual en euros con dos decimales
  */
 public double getSalarioEsteMes(int horasExtra) {
 double cantidadExtra, salarioFinal;
 cantidadExtra = horasExtra * this.salarioBasePorHora *
FACTOR_HORA_EXTRA;
 salarioFinal=this.salarioBasePorHora * 40 * 4 + cantidadExtra;
 salarioFinal=(double)Math.round(salarioFinal * 100d) / 100d;
 return salarioFinal;
 }

 // Este método no lo comentaremos con JavaDoc
 public static void main(String[] args) {
 Michelle20840427N emp = new Michelle20840427N("MICHELLE SEBI",
"20840427N");
 int horasExtra = 2;
 
 System.out.println("El salario de " + emp.nombreCompleto + " este mes será de " + emp.getSalarioEsteMes(horasExtra)
 + " euros, al hacer " + horasExtra + " horas extra.");
 }   
}
 
