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
public class NewClass {
      public static void main(String[] args) {
            System.out.println("5! = "+MathUtility.getFactorial(5));
            // tui goi ham tinh 5! hy ongj ham tra ve 120
            //thuc te la bn?
            //so sanh với cái hy vọng trước khi tính = 120
            System.out.println("0! = "+MathUtility.getFactorial(0));
            //                                   expected: 1, actual: ? chay moi biet
            //                                   chay xong mới biet dung sai
            System.out.println("-5! = "+MathUtility.getFactorial(-5));
            //                                   expected: excption, actual: ? chay moi biet
            //                                   chay xong mới biet dung sai
            //test kieu nay gọi là manual vì ta phải nhìn bằng mắt để nhìn kết quả
            //--------------------------------------------------------------------------------------------------
            //cach xin xò, ta nhìn màu sắc xanh đỏ để luận kết quả đúng sai
            //cach nay goi la test automation
            
      }
}
