/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

import java.util.Arrays;

/**
 *
 * @author Bueno
 */
public class day4 {

    public static void main(String[] args) {
        /* Condiciones
        1. Tiene que tener 2 dígitos iguales
        2. Valores de izqda a derecha no decrecen
        3. Tiene 6 dígitos
        4. Están entre 236491-713787
        ¿Cuántas passwords cumplen esas condiciones?
         */

     //   System.out.println(cuentaNumPass("236491-713787"));
        System.out.println(cuentaNumPassV2("236491-713787"));
    //    System.out.println(tieneDoubleV2("111122"));
    }
    
    public static int cuentaNumPassV2(String rango) {
        int inicio;
        int fin;
        int contador = 0;
        String valor = "";

        inicio = Integer.parseInt(rango.substring(0, rango.indexOf("-")));
        fin = Integer.parseInt(rango.substring(rango.indexOf("-") + 1));

        for (int i = inicio; i <= fin; i++) {
            valor = String.valueOf(i);
            if (tieneDoubleV2(valor) && noDecrece(valor)) {
                contador += 1;
            }

        }

        return contador;
    }

    public static int cuentaNumPass(String rango) {
        int inicio;
        int fin;
        int contador = 0;
        String valor = "";

        inicio = Integer.parseInt(rango.substring(0, rango.indexOf("-")));
        fin = Integer.parseInt(rango.substring(rango.indexOf("-") + 1));

        for (int i = inicio; i <= fin; i++) {
            valor = String.valueOf(i);
            if (tieneDouble(valor) && noDecrece(valor)) {
                contador += 1;
            }

        }

        return contador;
    }

    public static boolean tieneDouble(String valor) {
        boolean salida = false;
        for (int i = 0; i < valor.length() - 1; i++) {
            if (valor.substring(i, i + 1).equalsIgnoreCase(valor.substring(i + 1, i + 2))) {
                salida = true;
            }
        }

        return salida;
    }

    public static boolean noDecrece(String valor) {
        boolean salida = true;
        for (int i = 0; i < valor.length() - 1; i++) {
            if (Integer.parseInt(valor.substring(i, i + 1)) > Integer.parseInt(valor.substring(i + 1, i + 2))) {
                salida = false;
            }
        }
        return salida;
    }
    
    public static boolean tieneDoubleV2(String valor) {
        boolean salida = false;
        String[] valores = valor.split("");

        if ((valores[0].equalsIgnoreCase(valores[1])) && !valores[1].equalsIgnoreCase(valores[2])){
            salida = true;
        }
        
        for (int i = 1; i < valores.length - 2; i++) {
            if ((valores[i].equalsIgnoreCase(valores[i + 1])) && ((!valores[i].equalsIgnoreCase(valores[i - 1]))) && ((!valores[i + 1].equalsIgnoreCase(valores[i + 2])))) {
                salida = true;
            }
        }

        if ((valores[valores.length - 2].equalsIgnoreCase(valores[valores.length - 1])) && !valores[valores.length - 3].equalsIgnoreCase(valores[valores.length-2])) {
            salida = true;
        }
        
        return salida;
    }
}
