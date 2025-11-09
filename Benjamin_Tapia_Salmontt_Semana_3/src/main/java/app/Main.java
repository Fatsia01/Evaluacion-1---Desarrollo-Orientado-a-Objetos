package app;

import model.*;
import java.util.Random;
import static model.Sueldo.*;

/**
 * Clase principal donde se ejecutará la impresión de los datos de los empleados.
 * Funciona tomando la clase Empleado que tiene la clase Sueldo y Direccion anidada en ella.
 * Ya con esto, se permitirá al usuario agregar empleados en el futuro.
 */
public class Main {
    public static void main (String[] args) {
        Random aleatorio = new Random();  //Para calcular valores aleatorios para los sueldos y ver si el cálculo de sueldo base funciona

        int sueldoBase1 = aleatorio.nextInt(550000, 1200000); // Valores máximos y mínimos
        int sueldoBase2 = aleatorio.nextInt(550000, 1200000); // Valores máximos y mínimos
        int sueldoBase3 = aleatorio.nextInt(550000, 1200000); // Valores máximos y mínimos

        Sueldo sueldo1 = new Sueldo (sueldoBase1, "Fonasa", 0.07, (int) (sueldoBase1 * (1 - descuentoFonasa)));
        Sueldo sueldo2 = new Sueldo (sueldoBase2, "Isapre", 0.1, (int) (sueldoBase2 * (1 - descuentoIsapre))); //Calculo del sueldo neto para todos los empleados
        Sueldo sueldo3 = new Sueldo (sueldoBase3, "Isapre", 0.1, (int) (sueldoBase3 * (1 - descuentoIsapre)));

        Direccion direccion1 = new Direccion("Fitz Roy", 2135, "Puerto Montt", "Los Lagos", "Chile");
        Direccion direccion2 = new Direccion("Rauco", 8881, "Puerto Montt", "Los Lagos", "Chile"); //Ingreso de datos a la clase Direccion
        Direccion direccion3 = new Direccion("Libertad", 12314, "Puerto Montt", "Los Lagos", "Chile");

        Empleado empleado1 = new Empleado("Isabel", "Alarcon", "F", 186728163, 967876212, direccion1, "Soltero/a", sueldo1);
        Empleado empleado2 = new Empleado("Franco", "Carrasco", "M", 197820192, 976819201, direccion2, "Casado/a", sueldo2); //Ingreso de datos a la clase Empleado
        Empleado empleado3 = new Empleado("Thiago", "Guillen", "M", 167280192, 980127623, direccion3, "Soltero/a", sueldo3);


        System.out.print(empleado1); //Print de la información de los empleados
        System.out.print(empleado2);
        System.out.print(empleado3);
    }

}

