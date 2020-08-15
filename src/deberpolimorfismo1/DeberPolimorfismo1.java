/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deberpolimorfismo1;

/**
 *
 * @author Aguaiza Quimbita Jonathan Fabricio
 */
class Motor{
    public void TipoCombustible(){
        System.out.println("Combustible");
    }
}
class Motor_Otto extends Motor{
    public void TipoCombustible(){
        System.out.println("Gasolina");
    }
}
class Motor_Diesel extends Motor{
    public void TipoCombustible(){
        System.out.println("Diesel");
    }
}
class Motor_Electrico extends Motor{
    public void TipoCombustible(){
        System.out.println("Energía eléctrica");
    }
}
class Motor_GLP_GNC extends Motor{
    public void TipoCombustible(){
        System.out.println("Gas licuado de petróleo o gas natural");
    }
}
public class DeberPolimorfismo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("      UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE-L");
        System.out.println("MATERIA: PROGRAMACION");
        System.out.println("CARRERA: INGENIERIA AUTOMOTRIZ");
        System.out.println("NRC: 7450");
        System.out.println("ALUMNO: Aguaiza Jonathan");
        System.out.println(" ");
        System.out.println("      POLIMORFISMO");
        
        Motor Maquina1 = new Motor_Otto();
        Motor Maquina2 = new Motor_Diesel();
        Motor Maquina3 = new Motor_Electrico();
        Motor Maquina4 = new Motor_GLP_GNC();
        
        System.out.println("Tipo de combustible del Motor Otto:");
        Maquina1.TipoCombustible();
        
        
        System.out.println("Tipo de combustible del Motor Diesel:");
        Maquina2.TipoCombustible();
        
        
        System.out.println("Tipo de combustible del Motor Eléctrico:");
        Maquina3.TipoCombustible();
        
        
        System.out.println("Tipo de combustible del Motor GLP-GNC");
        Maquina4.TipoCombustible();
    }
    
}

















