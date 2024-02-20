public class tiles_1xm {
    public static int placeTile(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }

        // for vertical placements
        int vertical = placeTile(n - m, m);

        // for horizonatal placement
        int horizontal = placeTile(n - 1, m);

        return vertical + horizontal;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 2;
        System.out.println(placeTile(n, m));
    }

}
