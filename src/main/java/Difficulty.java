public enum Difficulty {
   EASY(10,10,5),
   MEDIUM(20,20,10),
   HARD(30,30,15);

   private int col;
   private int row;
   private int numOfBombs;

    Difficulty(int col, int row, int numOfBombs) {
        this.col = col;
        this.row = row;
        this.numOfBombs = numOfBombs;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public int getNumOfBombs() {
        return numOfBombs;
    }

}
