import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("Yıl Girin :");
        year=sc.nextInt();

        if (year%4==0){
            if (year%100==0){
               if (year%400==0){
                   System.out.println("Artık yıldır");
               }
               else {
                   System.out.println("Artık Yıl Değildir");
               }

            }
            else {
                System.out.println("Artık Yıldır.");
            }
        }else {
            System.out.println("Artık Yıl Değildir");
        }
    }
}
