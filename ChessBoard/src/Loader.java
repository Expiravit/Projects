public class Loader {
    public static void main(String[] args) {

        String[][] chess = new String[8][8];
        Character c = 'a';
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                chess[i][j] = c.toString() + (i + 1);
                c++;
            }
            c = 'a';
        }

        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
    }
}
