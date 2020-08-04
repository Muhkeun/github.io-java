package classtest;

public class StringEx01 {
    public static void main(String[] args) {
        String s1 = "Wonnder Girls";

        //Returns:
        //the index of the first occurrence of the character
        //in the character sequence represented by this object,
        // or -1 if the character does not occur.
        int index = s1.indexOf('n'); //2

        //Returns:
        //the index of the first occurrence of the specified substring,
        //or -1 if there is no such occurrence.
        index = s1.indexOf("der"); //4

        //Returns:
        //the index of the last occurrence of the character
        //in the character sequence represented by this object,
        //or -1 if the character does not occur.
        index = s1.lastIndexOf('n'); //3

        //Returns:
        //the char value at the specified index of this string.
        //The first char value is at index 0.
        char c = s1.charAt(index); //'n'
        index = s1.indexOf('G'); //8

        //Returns:
        //the specified substring.
        String str = s1.substring(index); //"Girls"

        //Parameters (beginIndex, endIndex):
        //beginIndex - the beginning index, inclusive.
        //endIndex - the ending index, exclusive.
        str = s1.substring(index, index+3);//"Gir"

        //Returns:
        //the length of the sequence of characters represented by this object.
        int length = s1.length(); //13

        //Returns:
        //the array of strings computed by splitting
        //this string around matches of the given regular expression
        String[] arr = s1.split(" "); //arr[0] = "Wonnder", arr[1] = "Girls"
    }
}
