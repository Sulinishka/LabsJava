public class Reflect {

    public String reverseArray(String inputString) {
        char[] charArray = inputString.toCharArray();
        StringBuilder resultString = new StringBuilder();
        for (int i = charArray.length - 1; i>= 0; i--) {
            resultString.append(charArray[i]);
        }
        return resultString.toString();
    }
}
