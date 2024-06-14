import java.util.Scanner;

public class se_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the main string:");
        String mainString = scanner.nextLine();

        System.out.println("Enter the substring:");
        String subString = scanner.nextLine();

        // Convert both the main string and substring to lowercase for case-insensitive comparison
        mainString = mainString.toLowerCase();
        subString = subString.toLowerCase();

        // Initialize a variable to store the count of occurrences
        int count = 0;

        // Find the index of the first occurrence of the substring in the main string
        int index = mainString.indexOf(subString);

        // Iterate through the main string until no further occurrences are found
        while (index != -1) {
            // Increment the count of occurrences
            count++;

            index = mainString.indexOf(subString, index + 1);
        }

        // Output the number of occurrences of the substring in the main string
        System.out.println("The substring \"" + subString + "\" occurs " + count + " times in the main string.");
    }
}
