package edu.jsu.mcis;
import javax.swing.*;
import java.awt.event.*;

public class TicTacToeController implements ActionListener{

    private final TicTacToeModel model;
    private final TicTacToeView view;

    /* CONSTRUCTOR */

    public TicTacToeController(int width) {

        /* Initialize model, view, and width */

        model = new TicTacToeModel(width);
        view = new TicTacToeView(TicTacToeController.this, width);

    }
    
     public String getMarkAsString(int row, int col) {        
        return (model.getMark(row, col).toString());        
    }

    public TicTacToeView getView() {        
        return view;        
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        String s = ((JButton) event.getSource()).getName();

        int row;
        int col;
        char a;
        char b;
        char[] charArray = s.toCharArray();
        int width = model.getWidth();

        a = charArray[6];
        b = charArray[7];

        row = Character.getNumericValue(a);
        col = Character.getNumericValue(b);

        model.makeMark(row, col);
        String mark = model.getMark(row, col).toString();
        view.board[row][col].setText(mark);

        if (model.getResult() != TicTacToeModel.Result.NONE) {

            view.resultLabel.setText(model.getResult().toString().toUpperCase());

            for(int i = 0; i < width; i++){

                for (int z = 0; z < width; z++) {

                    view.board[i][z].setEnabled(false);

                }
            }
        }
    }

    public void start() {

        /* MAIN LOOP (repeats until game is over) */

        /* Display the board using the View's "showBoard()", then use
           "getNextMove()" to get the next move from the player.  Enter
           the move (using the Model's "makeMark()", or display an error
           using the View's "showInputError()" if the move is invalid. */

        /*while( !model.isGameover() ) {

            view.showBoard(model.toString());
            TicTacToeMove nextMove = view.getNextMove(model.isXTurn());
            if ( !model.makeMark(nextMove.getRow(), nextMove.getCol()) ){
                view.showInputError();
            }

        }*\

        /* After the game is over, show the final board and the winner */

        //view.showBoard(model.toString());
        view.showResult(model.getResult().toString());

    }

}