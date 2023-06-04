import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r,a;
        double pi= 3.14;

        Scanner input= new Scanner(System.in);
        System.out.println("r yarıcapı giriniz: ");
        r= input.nextInt();
        System.out.println("a merkez acıyı giriniz");
        a= input.nextInt();
        double alan= (pi*r*r)/360;
        System.out.println("dairenin alanı:" +alan);
            }
}