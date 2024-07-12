public class Operacoes {
    public static String contador(int inicio, int fim) {
        String string = "";
        for (int i = inicio; i <= fim; i++) {
            string += i + " ";
        }
        return string;
    }
}
