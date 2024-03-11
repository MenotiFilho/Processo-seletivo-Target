public class Main {
    public static void main(String[] args) {
        String original = "Hello world!";
        String invertida = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }

        System.out.println(invertida);
    }
}