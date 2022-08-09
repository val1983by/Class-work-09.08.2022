import java.util.Scanner;

public class General {
    public static void main(String[] args) {

//        //задача 1
//        for ( int a=10;a<=20;a++) {
//            System.out.println(a*a);
//        }
//
//        //задача 2
//        System.out.println();
//        System.out.print("Введите число:");
        Scanner input = new Scanner(System.in);
//        int n = Integer.parseInt(input.nextLine());
//        int sum=0;
//        for (int i=1;i<=n;i++) {
//            sum = sum + i;
//        }
//        System.out.println("Сума чисел от 1 до " + n + " = " + sum);
//
//        //Задача 8
//        for (double u = 20;u <= 50;u++) {
//            if ((u%3)==0 && (u%5!=0)) System.out.println(u + " кратно 3  не делится на 5");
//        }

//        //Задача 16
//        System.out.println("Введите число косилок: ");
//        int n1 = Integer.parseInt(input.nextLine());
//        System.out.println("Введите время работы первой косилки, (ч): ");
//        int m1 = Integer.parseInt(input.nextLine());
//        int time1 = m1 * 60;
//        for (int i=1;i<=n1;i++) {
//            time1 = time1 + 10;
//        }
//        System.out.println("Время работы бригады: " + time1 + " мин");

//        //Задача 17
//        System.out.println("Число учащихся");
//        int n2 = Integer.parseInt(input.nextLine());
//        int sum=0;
//        for (int i=1;i<=n2;i++) {
//            System.out.println("Введите рост: ");
//            int high = Integer.parseInt(input.nextLine());
//            sum = sum + high;
//        }
//        double srRost = ()(sum/n2);
//        System.out.println("Средний рост учащихся = " + srRost);


        //String
        for (int x01 = 10;x01<=99;x01++) {
            for (int y01 = 10; y01 <=99; y01++) {
                String x1 = Integer. toString(x01);
                String x2 = Integer. toString(y01);
                String x3 = x1 + x2;
                int x4 = Integer.parseInt(x3);
                if (x4%(x01*y01)==0) System.out.println(x4);
            }
        }


//        //21
//        double sum  = 0;
//        int n = input.nextInt();
//        for (int i=2; i<=n; i+=2) {
//            sum += 1.0/(i*i);
//        }
//        System.out.println(sum);


        //28
        System.out.println();
        System.out.print("Введите ссуду ");
        int nachSumma = input.nextInt();
        int proc = 20;
        System.out.print("Введите сумму гарантии ");
        int s = input.nextInt();
        double dolg = nachSumma;
        int k = 0;

        while (dolg<=s){
            dolg = dolg*(1 + proc/100.0);
            k++;
        }
        System.out.println("Через " + k + " лет");
        System.out.println();

        double distance = 1.0;
        int kolNed = 0;
        while (distance <10.0001) {
            distance *=1.1;
            k++;
        }
        System.out.println("Через " + k + " недель дистанция превысит 10 км");

        int i = 1;
        int sum = 0;
        while (i <= 99) {
            sum +=i;
            i +=2;
        }
        System.out.println(sum);



















    }
}
