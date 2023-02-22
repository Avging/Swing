package src.com.alarm.test;

import java.util.Scanner;

public class ContinueControl_1 {
    public static void main(String[] args) {
        int x = 3;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("请输入一个整数：");
            int y = sc.nextInt();
            if(y < 0)  {
                System.out.println("要求y大于0，程序结束");
                continue;
            }else {
                if(x > y)  {
                    System.out.println("x值大于y值");
                }else {
                    System.out.println("x值小于y值");
                }
            }
        }while (count++ < 5);
    }
}
