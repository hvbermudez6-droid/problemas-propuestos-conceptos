import java.util.Scanner;

Public class ParImpar {
   public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = sc.nextInt();

         String[] labels = ["even", "odd"];
         System.out.println(labels[n & 1]);
   }
