import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args){
        System.out.printf("몇 개의 수를 입력할 예정인가요?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.printf("수를 입력하세요:");
        for (int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }
        int min = num[0], max = num[0];
        for (int i=1; i<n; i++){
            if (min >= num[i]) {
                min = num[i];
            }
            if (max <= num[i]) {
                max = num[i];
            }
        }

        System.out.println("최대값:" + max);
        System.out.println("최소값:" + min);
    }


    }

