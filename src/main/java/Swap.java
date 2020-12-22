public class Swap {
    public static void main(String[] args) {
        System.out.println("helloworld");
    }

    boolean swap(int i, int j, int[] anArray) {
        if (i < 0 || j < 0 || i >= anArray.length || j >= anArray.length) {
            return false;
        }

        int t = anArray[i];
        anArray[i] = anArray[j];
        anArray[j] = t;
        return true;

    }

}
