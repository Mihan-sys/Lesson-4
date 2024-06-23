import java.util.Scanner;


public class Mein {
    public static void main(String[] args) {
       /*
        System.out.println(20+20);
        System.out.println(10*5);
        System.out.println(10/3);
        System.out.println(10.0/3);
        System.out.println(3+5*2);
        System.out.println((3+5)*2);

        System.out.println("\n10"+ 50);
        System.out.println(10+ 50);
        */

//        System.out.println("\t\t\t Добро пожаловать в конвертор ГБ");
//        System.out.println("В " + 7 + " gb: " + (7 * 1024) + " mb");

        // масса (кг)/ рост2(м2)
//        System.out.println("\t\t\t***tДобропо пожаловать в калькулятор BMI***");
//        System.out.println("BMI " + 75.0 / (180*180));

        System.out.println("Введите температуру воздуха по цельсия");
        Scanner data = new Scanner(System.in);
        float C = data.nextFloat();
        //System.out.println(" F " + C + 1.8 + 32);
        System.out.println(" USD " + C/94);
        System.out.println(" EUR " + C/105);




    }

}
