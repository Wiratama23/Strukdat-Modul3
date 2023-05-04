import java.util.Scanner;

public class Kegiatan1 {
    public static String reverseString(String inputStr) {
        char[] chars = inputStr.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan string: ");
        String inputStr = input.nextLine();

        String outputStr = reverseString(inputStr);
        System.out.println("Hasil pembalikan string: " + outputStr);
    }
}