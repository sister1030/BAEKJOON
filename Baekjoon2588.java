import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   System.out.println("첫번째줄을 입력하세요");
    int n1 = sc.nextInt();
   System.out.println("두번째줄을 입력하세요");
    int n2 = sc.nextInt();
    System.out.println(n1*(n2%10));
    System.out.println(n1*(n2%100/10));     System.out.println(n1*(n2/100));
  System.out.println(n1*n2);
  }
}