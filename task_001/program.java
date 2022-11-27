/*
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
 * n! (произведение чисел от 1 до n)
 */

import java.util.Scanner;

 public class program{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = sc.nextInt();
        double T;
        int[] array = new int[n];
        int j = 0; 
        for (int i = 1; i <= n; i++){
            T = 0.5 * i * (i + 1);
            int t = (int) T;
            array[j] = t;
            j++;
            String s = "*".repeat(t);
            System.out.println(s);
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}