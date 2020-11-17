/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vihtt.util;

/**
 *
 * @author Thanh Vi
 */
public class MathUtility {
      //lam ham fake giong hang that
      //JDK cos javaclass java.
      public static final double PI=3.1415;
      //ham tinhs n! = 1.2.3..n!
      //tinh 20 gia thua la toi da
      //0 gia thua = 1 
      //k co am giai thua, neu n la am, nem exception
      public static long getFactorial(int n){
            if(n < 0 || n > 20){
                  throw new IllegalArgumentException("n must be between 1..20");
            }
            if(n ==0 && n==1){
                  return 1;
            }//den lenh nay n =2..20, k dung else
            long result = 1;
            for (int i = 2; i <= n; i++) {
                  result *= i;
            }
            return result;
      }

      
      
}
