/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newtonraphson;

import java.util.Scanner;

/**
 *
 * @author Curacao
 */
public class runge extends rungakutta {
    //se definen las funciones abstractas de rungekutta
    //en cual toma y devuelve los valor de ellos
    Scanner tec=new Scanner(System.in);
    @Override
                    public void setxi() {
                        System.out.println("Escriba el valor de x1");
                        this.xi=tec.nextFloat();
                    }

                    @Override
                    public void setxf() {
                        System.out.println("Escriba el valor de xf");
                        this.xf=tec.nextFloat();
                    }

                    @Override
                    public void seth() {
                        System.out.println("Escriba valor de h");
                        this.h=tec.nextFloat();
                    }

                    @Override
                    public void sety1() {
                        System.out.println("Escriba el valor de Y1");
                        this.y1=tec.nextFloat();
                    }

                    @Override
                    public float getxi(float x) {
                       return this.xi;
                    }

                    @Override
                    public float getxf(float x2) {
                       return this.xf;
                    }

                    @Override
                    public float geth(float hr) {
                      return this.h;
                    }

                    @Override
                    public float gety1(float y) {
                     return this.y1;
                    }
    
}
