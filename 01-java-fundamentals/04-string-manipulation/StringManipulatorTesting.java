public class StringManipulatorTesting {
    public static void main(String[] args) {
        //Test the Trim And Concat Method
        StringManipulator manipulator = new StringManipulator();
        String str= manipulator.trimAndConcat("     Hello      ", "     World      ");
        System.out.println(str);

        //Test the IndexOf Method
        StringManipulator manipulator1 = new StringManipulator();
        char letter = 'o';
        String a = manipulator1.getIndexOrNull("Coding", letter);
        String b = manipulator1.getIndexOrNull("Hello World", letter);
        String c = manipulator1.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null 

        //Get the index of the start of substring, and return either index or null.
        StringManipulator manipulator2 = new StringManipulator();
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        String a1 = manipulator2.getIndexOrNull(word, subString);
        String b1 = manipulator2.getIndexOrNull(word, notSubString);
        System.out.println(a1); // 2
        System.out.println(b1); // null

        //Get a substring using starting and ending index and concatenate that with the second string.
        StringManipulator manipulator3 = new StringManipulator();
        String word1 = manipulator3.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word1); // eworld

    }
}
