import java.util.Scanner;

public class MP01 {
    public static void main(String[] args) {
        // 온도와 습도 입력 받기(double)
        // 계산
        // 출력
        Scanner sc = new Scanner(System.in);
        System.out.println("온도를 입력하세요");
        double temp = sc.nextDouble();
        System.out.println("습도를 입력하세요");
        double humid = sc.nextDouble();
        double a = Math.log(humid / 100) + (17.62 * temp) / (243.12 + temp);
        double dp = (243.12 * a) / (17.62 - a);
        System.out.printf("dp = %.1f\n", ((int)(dp * 10)) / 10.0);
    }
}
