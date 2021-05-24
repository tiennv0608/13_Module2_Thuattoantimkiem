import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = input.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        list.add(string.charAt(0));
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) > list.getLast()) {
                list.add(string.charAt(i));
            } else {
                if (list.size() > max.size()) {
                    max.clear();
                    max.addAll(list);
                }
                list.clear();
                list.add(string.charAt(i));
            }
        }
        if (list.size() > max.size()) {
            max.clear();
            max.addAll(list);
        }
        for (Character character : max) {
            System.out.print(character);
        }
        System.out.println();
    }
}