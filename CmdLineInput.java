/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmdlineinput;
import java.util.ArrayList;

/**
 *
 * @author fawzisaleh
 */
public class CmdLineInput {
     public static void main(String [ ] args) {
       int r ,  s,a,ro,ro2,dis=0;
       for(r=1;r<=9;r++) { ro  =   (r<=5)?  5-r :r-5; 
       for  (s=1  ;s  <=ro;s++)
           System.out.print(" ");
       if  (r>5)   dis  +=4;
       ro2  =(r<=5)?  r*2-1 :r*2-1-dis ;
       for  (a=1  ;a<=ro2;a++)
             System.out.print("*");
             System.out.println();

           }
     }
}

