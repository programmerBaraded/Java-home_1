//Реализовать простой калькулятор (+ - / *)
//Ввод числа ->
// Ввод знака ->
// Ввод числа ->
import java.util.Scanner;;
public class Ex_3 {
    public static void main(String[] args) {
        System.out.println("x ");
        Scanner scan = new Scanner(System.in);
        int first_num = scan.nextInt();
        System.out.println("action ");
        char action = scan.next().charAt(0);
        System.out.println("y ");
        int second_num = scan.nextInt();
        scan.close();
        int result = 0;
        if (action == '+'){
            result = first_num + second_num;
            System.out.println(" " + result);
        }
        else if (action == '-'){
            result = first_num - second_num;
            System.out.println(" " + result);
        }
        else if (action == '*'){
            result = first_num * second_num;
            System.out.println(" " + result);
        }
        else if (action == '/'){
            result = first_num / second_num;
            System.out.println(" " + result);
        }

    }
    
}
