package day04;

public class Sultan {
    public static void main(String[] args) {
        Prison prison = new Prison();

        prison.openFreeCells();

        for (int i = 0; i < prison.prisonCells.length; i++) {
            if (prison.prisonCells[i]) {
                System.out.println(i + 1);
            }
        }
    }
}