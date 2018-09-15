public class CellBoardGenerator {



    public Cell[][] generateCells(Difficulty difficulty){
        int[] bombPlaces = new int[difficulty.getNumOfBombs()];
        for (int bomb :
                bombPlaces) {
            bomb = (int) Math.floor(Math.random() * difficulty.getCol());
            System.out.println(bomb);
        }
        Cell[][] cell = new Cell[difficulty.getCol()][difficulty.getRow()];
        for (int i = 0; i < difficulty.getRow(); i++) {
            for (int j = 0; j < difficulty.getCol(); j++) {
                cell[i][j] = new Cell();
            }
        }
        return cell;
    }

    public String[][] generateCellsDisplay(){
        String[][] string = new String[5][5];
        return string;
    }
}
