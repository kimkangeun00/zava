import java.util.Scanner;

class Homework4{
    int gcd1(int a, int b) {
        if (a==b) {return a;}
        else {
            if (b==0){return a;}
            else return gcd1(b, a%b);}
    }
    int gcd2(int a, int b){
        if (a==b) {return a;}
        else {
            for (int i =b; i!=0; i = b){
                b = a % i;
                a = i;
            }
        }
        return a;
    }



    public static void main(String[] srg){
        Scanner scanner = new Scanner(System.in);
        Homework4 homework4 = new Homework4();
        System.out.printf("두 수를 입력하세요:");
        int x = scanner.nextInt(); int y =scanner.nextInt();
        System.out.println("두 수의 최대공약수는 " + homework4.gcd1(x, y) + "입니다.(재귀호출)");
        System.out.println("두 수의 최대공약수는 " + homework4.gcd2(x, y) + "입니다.(반복문)");
    }

}