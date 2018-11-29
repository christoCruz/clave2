/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newtonraphson;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Christopher lysander cruz martinez
 */
public class NewtonRaphson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int op;
        int uni;
        runge en=new runge();
        Scanner tec= new Scanner(System.in);
        
        do{
        System.out.println("Ingrese opcion que desea");
        System.out.println("Opcion 1 ecuacion runge kutta");
        System.out.println("Opcion 2 newtoon raphson");
        System.out.println("Opcion 3 mostrar");
        System.out.println("Opcion 4 salir");
        op=tec.nextInt();
        
        switch(op){
            case 1:
                   en.seth();
                   en.setxi();
                   en.setxf();
                   en.sety1();
                   en.calcular(en.h, en.xi, en.xf, en.y1);
                  en.mostrar();
                break;
            case 2:
                newt ecu=new newt();
                ecu.Newtooo();
                break;
            case 3:
                System.out.println("Que archivo desea abrir");
                System.out.println("Opcion 1 = runge kutta");
                System.out.println("Opcion 2 = newton Raphson");
                uni=tec.nextInt();
                if(uni==1){
                    en.abrir("ecuacion.txt");
                }
                else{
                    en.abrir("newton.txt");
                }
                
                break;
            } 
        }while(op!=4);
    }
    
}
