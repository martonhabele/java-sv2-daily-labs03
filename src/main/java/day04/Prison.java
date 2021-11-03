package day04;

public class Prison {
    protected boolean[] prisonCells = new boolean[100];

    public void openFreeCells() {
        for (int i = 0; i < prisonCells.length; i++) {
            for (int j = i; j < prisonCells.length; j++) {
                if((j + 1) % (i + 1) == 0) {
                    prisonCells[j] = !prisonCells[j];
                }
            }
        }
    }
}