package edu.jsu.mcis;

import javax.swing.*;
import java.awt.*;

public class TicTacToeView extends JPanel {
    
    TicTacToeModel model;
    
    private final TicTacToeController controller;

    final JButton[][] board;
    public final JPanel squaresPanel;
    public final JLabel resultLabel;

    public TicTacToeView(TicTacToeController controller, int width) {

        this.controller = controller;
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        
        board = new JButton[width][width];
        squaresPanel = new JPanel(new GridLayout(width,width));
        resultLabel = new JLabel();
        resultLabel.setName("ResultLabel");

        for (int row = 0; row < width; row++) {

            for (int col = 0; col < width; col++) {

                board[row][col] = new JButton(); 
                board[row][col].addActionListener(controller);
                board[row][col].setName("Square" + row + col);
                board[row][col].setPreferredSize(new Dimension(64,64));
                squaresPanel.add(board[row][col]);
                
            }
        }

        this.add(squaresPanel);
        this.add(resultLabel);

        resultLabel.setText("Welcome to Tic-Tac-Toe!");
    }

    public void updateSquares() {

        for (int i = 0; i < model.getWidth(); i++){

            for (int z = 0; z < model.getWidth(); z++){

                String data = model.getMark(i, z).toString();
                
                board[i][z].equals(data);

            }
        }
    }

    public void disableSquares() {
        
        for(int i = 0; i < model.getWidth(); i++){

                for (int z = 0; z < model.getWidth(); z++) {

                    board[i][z].setEnabled(false);

                }
            }
    }

    public void showResult(String message) {

        resultLabel.setText(message);

    }

    public void clearResult() {

        resultLabel.setText(" ");

    }
} 