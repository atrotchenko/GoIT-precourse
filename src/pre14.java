/**
 * Created by victorpetrov on 01.04.17.
 */
public class pre14 {
    public static void main(String[] args) {

        /*В переменной n хранится натуральное трёхзначное число.
                Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.*/

        int n = 180;

        int x = n%10;
        int y = (n/10)%10;
        int z = (n/100)%10;

        /*System.out.println(x);
        System.out.println(y);
        System.out.println(z);*/

        System.out.println(x+y+z);
    }
}
