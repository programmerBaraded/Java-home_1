//Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
//Ввод:5
//Треугольное число 1 + 2 + 3 + 4 + 5 = 15
//n! 1 * 2 * 3 * 4 * 5 = 120

import java.util.Scanner;
public class Ex_1 {
    public static void main(String[] args) {
        System.out.printf("Введите число: ");
        Scanner iScanner = new Scanner(System.in);
        
        int num = iScanner.nextInt();
        iScanner.close();
        int tr_num = 0;
        int fak_num = 1;
        for (int i = 1; i <= num; i++){
            tr_num += i;
            fak_num *= i;
        }
        System.out.println("tr = " + tr_num);//Треугольное число
        System.out.println("fak = " + fak_num);//Факториал числа
    }

    
}