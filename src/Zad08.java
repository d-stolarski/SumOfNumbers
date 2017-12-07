import java.util.Arrays;
import java.util.Scanner;

public class Zad08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] tab = new int[3][3];
        int i = 0;
        int j = 0;

        while (i != 3) {
            while (j != 3) {
                System.out.printf("Podaj element [%d][%d] tablicy:", i, j);
                tab[i][j] = scan.nextInt();
                j++;
            }
            j = 0;
            i++;
        }

        System.out.println("Twoja tablica wygląda następująco:");
        System.out.println(Arrays.toString(tab[0]));
        System.out.println(Arrays.toString(tab[1]));
        System.out.println(Arrays.toString(tab[2]));

        int sumTab0 = tab[0][0] + tab[0][1] + tab[0][2];
        int sumTab1 = tab[1][0] + tab[1][1] + tab[1][2];
        int sumTab2 = tab[2][0] + tab[2][1] + tab[2][2];

        if (sumTab0 > sumTab1 && sumTab0 > sumTab2) {
            System.out.println("Największa suma liczb jest w wierszu 1 i wynosi " + sumTab0);
        } else if (sumTab1 > sumTab0 && sumTab1 > sumTab2) {
            System.out.println("Największa suma liczb jest w wierszu 2 i wynosi " + sumTab1);
        } else {
            System.out.println("Największa suma liczb jest w wierszu 3 i wynosi " + sumTab2);
        }
        scan.close();
    }
}
