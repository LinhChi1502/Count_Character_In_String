import java.util.Scanner;

public class countCharacterInString {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập chuỗi: ");
        String str = sc.nextLine();
        System.out.println("Nhập vị trí ký tự: ");
        char character = sc.next(".").charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("Số ký tự " + character + " là " + count);
    }
}
