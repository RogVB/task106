package es.usj.libcalculos;

import java.util.ArrayList;
import java.util.List;

public class Calculos {


    //Métodos para Sumar
    public static String Sumar(int [] valores){
        int resultado =0;
        for (int valor: valores
                ) {
            resultado += valor;
        }
        return String.valueOf(resultado);
    }

    public static String Sumar(String [] valores){
        int resultado =0;
        for (String valor: valores
                ) {

            resultado += StringToInt(valor);
        }
        return String.valueOf(resultado);
    }
    public static String Sumar(String valor1, String valor2){

        return String.valueOf(StringToInt(valor1) + StringToInt((valor2)));
    }


    //Métodos para Restar
    public static String Restar(String valor1, String valor2){

        return String.valueOf(StringToInt(valor1) - StringToInt((valor2)));
    }
    
    public static String Restar(int [] valores){
        int resultado =valores[0];
        boolean primerValor = true;
        for (int valor: valores
                ) {
            if(!primerValor)
                resultado -= valor;
            else
                primerValor= false;
        }
        return String.valueOf(resultado);
    }

    public static String Restar(String [] valores){
        int resultado =StringToInt(valores[0]);

        boolean primerValor = true;
        for (String valor: valores
                ) {

            if(!primerValor)
                resultado -= StringToInt(valor);
            else
                primerValor= false;

        }
        return String.valueOf(resultado);
    }

    //Métodos de Multiplicación
    public static String Multiplicar(String valor1, String valor2){

        return String.valueOf(StringToInt(valor1) * StringToInt((valor2)));
    }

    //Métodos de División
    public static String Dividir(String valor1, String valor2){

        return StringToInt(valor2)!= 0? String.valueOf(StringToInt(valor1) / StringToInt((valor2))): "No es posible dividir entre 0";
    }

    //Métodos de conversión y validación
    private List<Integer> StringArrayToIntList(String[] valores){
        List<Integer> intList = new ArrayList<Integer>();
        for (String valor: valores
             ) {
            intList.add(StringToInt(valor));
        }
        return intList;
    }

    private static int StringToInt(String valor){

        return valor.matches("\\d+(?:\\.\\d+)?") ? Integer.parseInt(valor): 0;
    }
}
