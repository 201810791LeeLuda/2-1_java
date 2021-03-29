import java.util.Scanner;

public class Hash {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("문자 다섯 개를 한 줄에 한 개씩 입력하세요");
        char arr[] = new char [5];
        double sum=0;
        for(int i=0;i<5;i++){
            char ch = sc.next().charAt(0);
            arr[i]=ch;
        }
        for(int i=0;i<5;i++){
        double hash=arr[i]*Math.pow(31,4-i);
        sum+=hash;
        }
        System.out.printf("문자열 %c%c%c%c%c의 해시 값은 %f 입니다.",arr[0],arr[1],arr[2],arr[3],arr[4],sum);
    }
}
