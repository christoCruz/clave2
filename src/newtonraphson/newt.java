
package newtonraphson;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class newt {
    Scanner tec=new Scanner(System.in);
    
    //funcion para newton rapshon 
    public void Newtooo() throws IOException
    {
        //extnesion las funcion abstrata y definir su ecuacion y su deribada
        Ifuncion f= new Ifuncion() {
                    @Override
                    //se predofina 
                    public double eval(double x) {
                    return x*x-2;   
                        }
                    };
        //derivada
                Ifuncion df= new Ifuncion() {
                    @Override
                    public double eval(double x) {
                    return 2*x;
                    }
                };
               //toma de los valores en los set de newton rapshon
                newtonraMenu lo=new newtonraMenu();
                
                System.out.println("valor de x incial");
                lo.setD(tec.nextDouble());
                
                System.out.println("numero de ciclo maximo");
                lo.setVal(tec.nextInt());
                //se crea una variable del la clase newtonRap
                NewtonRap nr = new NewtonRap();
                //se uestra en pantalla ya el resultado 
                System.out.println(nr.raiz(f, df, lo.getD(), 1e-6, lo.getVal()));
                String espacio="";
                //creacion de archivos poara newton raphson
                File fichero=new File("newton.txt");
                FileWriter fw=new FileWriter(fichero, true);
                BufferedWriter bw=new BufferedWriter(fw);
                PrintWriter escribef=new PrintWriter(bw);
                escribef.println(lo.getD());
                escribef.println(1e-6);
                escribef.println(lo.getVal());
                escribef.println(espacio);
                escribef.close();
    }
}
