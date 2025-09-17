public class StringImmutabilityDemo {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = str1; // str2 points to same object as str1

        str1 = str1.concat(" Programming"); // New object created
        System.out.println("str1: " + str1); // "Java Programming"
        System.out.println("str2: " + str2); // "Java" — unchanged
    }
}
