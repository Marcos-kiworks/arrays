package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        String marcaCoche1 = "Renault";
        String marcaCoche1 = "BMW";

        /* ¿Que es un array? Es un identificador de variable (el nombre de una variable)
        * que hace referencia a una zona donde se pueden almacenar varios valores del mismo 
        * tipo.
        * Un array es de tamaño fijo, que no es lo mismo que inmutable. De tamaño quiere decir
        * que una vez creado no se le pueden agregar mas elementos. Inmutable quiere que no se
        * puede modificar ningun elemento.
        * Para acceder a los elementos del array hace falta un indice, que comienza por el valor
        * cero (0)
        */

        // Declaracion de un array de String, es decir, un array donde cada elemento 
        // es de tipo String
        String[] marcasDeCoche;

        // Array de numeros enteros
        int[] arrayDeEnteros;

        // Array de persona
        // Persona[] personasArray;

        // Como agregar elementos al array
        // Hay 2 formas de hacerlo manualmente
        // Una reservando memoria para la cantidad de elementos  y otra
        // asignandolos entre llaves ¨{} separados por coma.

        // Comenzando por el array de enteros seria:
        // Variante 1
        arrayDeEnteros = new int[5];

        arrayDeEnteros[0] = 10;
        arrayDeEnteros[1] = 20;
        arrayDeEnteros[2] = 25;
        arrayDeEnteros[3] = 31;
        arrayDeEnteros[4] = 46;

        // Variante 2
        int[] arrayDeEnteros2 = {1,3,5,6,7,78,100};

        String[] marcasDeCoche2 = {"Renault","Tesla","Toyota","Mercedes"};

        // Creacion del array de persona
        Persona [] personasArray = {
            Persona.builder()
                .nombre(:"Juan")
                .primerApellido(:"Guerrero")
                .segundoApellido(:"Leon")
                .genero(Genero.HOMBRE)
                .salario(salario(3500.50))
                .build(),
            Persona.builder().nombre("Rubén").genero(Genero.HOMBRE).salario(4000.45).build(),
            Persona.builder().nombre("Margarita").genero(Genero.MUJER).salario(2400.30).build(),
            Persona.builder().nombre("Susana").genero(Genero.MUJER).salario(3000.00).build(),
        };

        /* */
        



    }
}
