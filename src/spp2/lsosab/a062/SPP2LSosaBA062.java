/*
 * Luisa Fernanda Sosa Brambila
 * A01411485
 * IIS
 */
package spp2.lsosab.a062;
import java.util.Scanner;
/**
 *
 * @author Fernanda
 */
public class SPP2LSosaBA062 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calcular el factorial de un número");
       
        int num;
        int i;
        int acu=1;
        boolean test=true;
        
        while(test==true)
        {
        num =solicitarDatos();
        if ((num<=10)&(num>=1))
        {
        for (i=1;i<=num;i++){
        acu=acu*i;}
        System.out.println("Número factorial: "+ acu);
        test=false;
        }
        else{
                System.out.println("Teclea un valor entre 1 y 10");
                test=true;
                }
        }
                
    }
    static int solicitarDatos(){
        Scanner tec = new Scanner (System.in);
        int num=0;
        boolean test=true;
        while (test==true){
        try{
        System.out.println("Ingresa un número: ");
        num=tec.nextInt();
        test=false;}
        catch(Exception ex){
            System.out.println("Este programa solo admite valores enteros, por favor vuelve a ingresar un numero");
            num=tec.nextInt();
            test=true;
        }
        }
        return num;

}
}
