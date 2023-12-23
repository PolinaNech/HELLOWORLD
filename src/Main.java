import java.util.Arrays;

public class Main {
    private static void changeValue(Integer[] value) {
    value = new Integer [] {99};


}
    public static void main(String[] args) {
        Integer [] value = {3,4};
        changeValue(value);
        System.out.println(Arrays.toString(value));

    }


}