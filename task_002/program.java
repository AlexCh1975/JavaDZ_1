/*
 * Вывести все простые числа от 1 до 1000
 */

package task_002;

public class program {
    public static void main(String[] args) {
        for (int n = 1; n <= 1000; n++){
            int i = 2;
            int j = 0;
            while (i * i <= n && j != 1){
                if (n % i == 0){
                    j = 1;
                    i = i + 1;
                }
                else {
                    i = i + 1;
                }
            }
            
            if (j != 1 && n != 1){
                System.out.print(n + " ");
            }
        }
    }
}
