 /*
 Elaborar una solución que permita leer los datos de un automóvil 
 (marca, origen y costo) imprima el impuesto por pagar y el precio 
 de venta (incluido el impuesto). Si el origen es Alemania el impuesto
 es 20%, si es de Japón el impuesto es 30%, si es de Italia, 15%, y si
 es de USA, 8%
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author xavierchavez
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String marca;
        String origen;
        double costo;
        double impuestos;
        double porcentaje1 = 20;
        double porcentaje2 = 30;
        double porcentaje3 = 15;
        double porcentaje4 = 8;
        
        System.out.println("Ingresar la marca del automovil");
        marca = entrada.nextLine();
        
        System.out.println("Ingresar el origen del automovil");
        origen = entrada.nextLine();
        
        System.out.println("Ingresar el costo del automovil");
        costo = entrada.nextDouble();
        
        if(origen.equals("Alemania")){
            impuestos = (porcentaje1 * costo)/100;
            costo = costo + impuestos;            
        }else{
            if(origen.equals("Japón")){
                impuestos = (porcentaje2 * costo)/100;
                costo = costo + impuestos;    
            }else{
                if(origen.equals("Italia")){
                    impuestos = (porcentaje3 * costo)/100;
                    costo = costo + impuestos;    
                }else{
                    if(origen.equals("USA")){
                        impuestos = (porcentaje4 * costo)/100;
                        costo = costo + impuestos;
                    }else{
                        impuestos = 0;
                        costo = costo + impuestos;
                    }
                }
            }
        }
        System.out.printf("El impuesto por pagar es: %.2f\nEl precio de venta "
                + "es: %.2f\n", impuestos, costo );
               
    }
    
}
