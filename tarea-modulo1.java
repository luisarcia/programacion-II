/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.weblarc.programacion2.homework.modulo1;

/**
 *
 * @author luisarcia
 */
public class main {
    public static void main(String args[]) {
        //Solución 1
        System.out.println(getSquareNumberAndCubeNumber(1));
        
        //Solución 2
        //System.out.println(getCompareNumbers(5,5));
        
        //Solución 3
        //getASCII();
        
        //Solución 4
        //getLettersStairs();
    }

    /**
     * 1.Haga una función en Java que reciba un número como argumento e imprima 
     * el número al cuadrado y el número al cubo, siempre y cuando el número sea mayor a 1.
     * @param number
     * @return Resultado
     */
    public static String getSquareNumberAndCubeNumber( int number ) {
        String result;
        
        if( number <= 1 ) return "🔴 El número ingresado debe ser un número mayor a 1.\n";
        
        int squareNumber = (int) Math.pow(number, 2);
        int cubeNumber   = (int) Math.pow(number, 3);
            
        result = "RESULTADOS:\n" ;
        result += String.format("🟢 %s al cuadrado es: %s\n", number, squareNumber);
        result += String.format("🟢 %s al cubo es: %s\n", number, cubeNumber);

        return result;
    }
    
     /**
     * 2. Haga una función en Java que reciba dos números como parámetro e imprima un mensaje 
     * indicando cómo se relaciona el primero con el segundo. Por ejemplo, si los números son 5 y 7, 
     * la función debe imprimir 5 es menor que 7.
     * @param numberA
     * @param numberB
     * @return Resultado
     */
    public static String getCompareNumbers(int numberA, int numberB) {
        String result;
        
        if( numberA == numberB  ) return String.format("🟢 %s es igual que %s", numberA, numberB);

        return numberA > numberB ?
                String.format("🟢 %s es mayor que %s", numberA, numberB):
                String.format("🟢 %s es menor que %s", numberA, numberB);
    }
    
    /**
     * 3. Haga un procedimiento en Java que imprima el equivalente en ASCII desde 
     * el valor 32 hasta el 255 en la pantalla. Utilice un ciclo for.
     */
    public static void getASCII() {
        String result = "";
        
        for (char i = 32; i <= 255; i++) {
             result += i + "\n";  
        }

        System.out.println(result);
    }
    
    /**
     * 4. Haga un procedimiento en Java utilizando los valores de la tabla 
     * ASCII e imprima lo siguiente en pantalla
     */
    public static void getLettersStairs() {
        String result = "";
        
        int rows = 1;
        int maxRows = 5;
        char initialLetter = 65;

        for (int row = rows; row <= maxRows; row++) {            
            for (char letter = initialLetter; letter < initialLetter + row; letter++) {
                result += letter;
            }
            
            result += "\n";
        }
        
        System.out.println(result); 
    }
};