/**
 * Created by victorpetrov on 01.04.17.
 */
public class pre12 {
    public static void main(String[] args) {

        /*В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.*/

        int n = 56;

        int a = n%10;
        int b = (n/10)%10;
        System.out.println(a+b);
    }
}
