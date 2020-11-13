/*
 Solución que permita calcular y mostrar el valor a cancelar de una planilla 
 de luz. Se debe ingresar el valor de costo por kilovatio/hora y el número de 
 kilovatios consumidos en el mes. Si el usuario tiene edad mayor a 65 años, 
 se debe descontrar el 10%.
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author xavierchavez
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double valor_kilovatio_hora;
        double numero_kilovatios_mes;
        double valor_total;
        int edad;
        double descuento;
        double porcentaje = 10 ;
        
        System.out.println("Ingresar su edad");
        edad = entrada.nextInt();
        
        System.out.println("Ingresar el valor de costo por kilovatio/hora");
        valor_kilovatio_hora = entrada.nextDouble();
        
        System.out.println("Ingresar el numero de kilovatios consumidos en el"
                + " mes");
        numero_kilovatios_mes = entrada.nextDouble();
        
        valor_total = valor_kilovatio_hora * numero_kilovatios_mes;
        
        if(edad > 65){
            descuento = porcentaje * valor_total / 100 ; 
            valor_total = valor_total - descuento;
        }
        System.out.printf("El valor de cancelar de una planilla de luz es:"
                + " %.2f\n",valor_total);
        
                
        
        
    }
    
}
