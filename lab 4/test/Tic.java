public class Tic {

private String[][] ticBoard;

public String[][] createBoard(int h, int w) {
    ticBoard = new String[h][(w * 2) + 1];

    for(int i = 0;i < h; i++ ) {
        for(int j = 0; j < w; j++){
            if (j%2 == 0)
            ticBoard[i][j] = "|";

            else
            ticBoard[i][j] = " ";
        }
    }

return ticBoard;
}
}