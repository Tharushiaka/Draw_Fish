/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fishn;

/**
 *
 * @author ittr
 */
public class FishS {
 
    public static void main(String[] args)
    { 
         for(int i=1;  i<=7;  i++)
         {
                for(int j=1;  j<=6-i+1;  j++)
                {
                     System.out.print(" ");
                } 
                for(int l=1;  l<=2*i-1;  l++)
                {
                     System.out.print("*");
                } 
                for(int j=3;  j<=2*(7-i+1);  j++)
                {
                     System.out.print(" ");
                } 
                for(int l=3;  l<=i;  l++)
                {
                     System.out.print("*");
                } 
                System.out.println();
         }
         for(int i=1;  i<=6;  i++)
         {
                for(int j=1;  j<=i;  j++)
                {
                     System.out.print(" ");
                } 
                for(int l=1;  l<=2*(6-i+1)-1;  l++)
                {
                     System.out.print("*");
                } 
                for(int j=1;  j<=2*i;  j++)
                {
                     System.out.print(" ");
                } 
                for(int l=1;  l<=4-i+1;  l++)
                {
                     System.out.print("*");
                } 
                System.out.println();
         }
    } 
}
  
     

