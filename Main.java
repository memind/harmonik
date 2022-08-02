import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int s;
        double toplam = 0, j;
        Scanner inp = new Scanner(System.in);

        System.out.print("n Sayısını Giriniz: ");
        s = inp.nextInt();

        System.out.println("İşlem Basamakları: ");
        for (j = 1; j <= s; j++){
            toplam += (1/j);
            System.out.println(toplam);
        }
        System.out.println("Sonuç: " + toplam);
    }
}