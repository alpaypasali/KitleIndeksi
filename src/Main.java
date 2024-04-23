import  java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        double boy = scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        int kilo = scanner.nextInt();

        double indeks = kilo / (boy* boy);
        System.out.println("Vücut Kitle İndeksiniz : " + indeks);

    }
}