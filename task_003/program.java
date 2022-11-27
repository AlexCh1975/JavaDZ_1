/*
 * Реализовать простой калькулятор
 */
package task_003;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        double num1 = sc.nextDouble();

        double res = 0;
        while (true){ 
            
            System.out.print("Input operator: ");
            String op = sc.next();

            if ("=".equals(op)) {
                System.out.print(res);
                break;
            }
            System.out.print("Input number: ");
            double num2 = sc.nextDouble();
   
            switch(op){
                case "+":
                    res = num1 + num2;
                    num1 = res;
                    break;
                case "-":
                    res = num1 - num2;
                    num1 = res;
                    break;
                case "*":
                    res = num1 * num2;
                    num1 = res;
                    break;
                case "/":
                    res = num1 / num2;
                    num1 = res;
                    break;
                }
            System.out.print(res);    
            System.out.print("\n");            
        }
        
        sc.close();
    }
}
