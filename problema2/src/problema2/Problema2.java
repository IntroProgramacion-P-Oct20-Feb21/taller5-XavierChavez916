/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author xavierchavez
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String descripcion_articulo;
        int cantidad_pedida;
        double precio_unitario;
        double costo_pedido_articulo;
        double descuento;
        double porcentaje = 15;
        
        
        System.out.println("Ingresar la descripcion del articulo");
        descripcion_articulo = entrada.nextLine();
        
        System.out.println("Ingresar la cantidad que se requiere");
        cantidad_pedida = entrada.nextInt();
        
        System.out.println("Ingresar el precio unitario del articulo");
        precio_unitario = entrada.nextDouble();
        
        costo_pedido_articulo = cantidad_pedida * precio_unitario;
        
        if(cantidad_pedida > 50){
            descuento = (porcentaje * costo_pedido_articulo) / 100;
            costo_pedido_articulo = costo_pedido_articulo - descuento;
        }
        System.out.printf("El nombre del articulo es: %s\nEl costo es: %.2f\n"
                ,descripcion_articulo
                ,costo_pedido_articulo);
        
        
            
        
    }
    
}
