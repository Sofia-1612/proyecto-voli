/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package voleibol;

/**
 *
 * @author Dell
 */
public class VOLEIBOL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       FacturaOrientadaObj factura = new FacturaOrientadaObj();
       System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("::::::::::::::::::::::::: MENU DE IMPLEMENTOS ::::::::::::::::::::::::::::::: ");
        System.out.println("- RODILLERAS VOLEIBOL: $50.000");
        System.out.println("- CAMISAS VOLEIBOL: $30.000");
        System.out.println("- ZAPATILLAS VOLEIBOL: $280.000");
        System.out.println("- PANTALON O SHORT DE LICRA: $35.000");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
       factura.generarTotal();
    }
    
}
