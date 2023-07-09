public class BoothsAlgo {
    static void add(int ac[], int x[], int qrn) {
        int i, c = 0;
        for (i = 0; i < qrn; i++) {
            ac[i] = ac[i] + x[i] + c;
            if (ac[i] > 1) {
                ac[i] = ac[i] % 2;
                c = 1;
            } else {
                c = 0;
            }
        }
    }

    static void complement(int a[]) {
        int n = a.length;
        int i;

        for (i = 0; i < n; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }
        }

        int carry = 1;
        for (i = 0; i < n; i++) {
            a[i] = (a[i] + carry) % 2;
            carry = (a[i] + carry) / 2;
        }
    }

    public static void main(String[] args) {
        int[] ac = { 0, 0, 0, 0 };
        int[] x = { 1, 0, 1, 1 };
        int qrn = 4;

        add(ac, x, qrn);
        complement(ac);

        // Printing the result
        for (int i = qrn - 1; i >= 0; i--) {
            System.out.print(ac[i] + " ");
        }
    }
}
