public class Palindrom {
    static void findPalindrom(String test) {
        String test2 = "";
        String[] testArray = test.split("");
        for (int i = testArray.length - 1; i >= 0; i--) {
            test2 += testArray[i];
        }
        if(test.equals(test2)) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
    }
}
