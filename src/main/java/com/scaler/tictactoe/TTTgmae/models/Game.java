package com.scaler.tictactoe.TTTgmae.models;
import com.scaler.tictactoe.TTTgmae.strategies.WinningStrategies;

import java.util.*;
public class Game
{

    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private GameState state;
    private Player winner;
    private int nextPlayerMoveIndex;
    List<WinningStrategies>winngStrategies;


    private Game(Builder builder){
        this.winngStrategies=builder.winngStrategies;
        this.players=builder.players;
        System.out.println("players: "+players);
        this.moves=new ArrayList<>();
        this.board=new Board(builder.dimensions);
        this.winner=null;
        this.state=GameState.INPROGRESS;
        this.nextPlayerMoveIndex=0;
    }


    public void makeMove(){
        Player currentPlayer=players.get(nextPlayerMoveIndex);
        System.out.println("Current player: "+currentPlayer.getName()+" 's turn");
        Move move=currentPlayer.makeMove(board);
        System.out.println(currentPlayer.getName()+" is making move at "+move.getCell().getRow()+" and  "+move.getCell().getColumn());

        int row=move.getCell().getRow();
        int col=move.getCell().getColumn();
        Cell cellToBechanged=board.getBoard().get(row).get(col);
        cellToBechanged.setState(CellState.FILLED);

        Move finalMove=new Move(currentPlayer,cellToBechanged);
        moves.add(finalMove);

        nextPlayerMoveIndex++;
        nextPlayerMoveIndex%=players.size();

        if(checkWinner(finalMove)){
            winner=currentPlayer;
            state=GameState.ENDED;
        }
        else if(moves.size()==(board.getDimension()*board.getDimension())){
            state=GameState.DRAW;
        }

    }

    public void printBoard(){

        board.printBoard();

    }

    public boolean checkWinner(Move move){

        for(WinningStrategies ws:winngStrategies){

            if(ws.checkWinner(board,move)){

                return true;
            }
        }

        return false;

    }

    public Board getBoard() {
        return board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public GameState getState() {
        return state;
    }

    public Player getWinner() {
        return winner;
    }

    public int getNextPlayerMoveIndex() {
        return nextPlayerMoveIndex;
    }

    public List<WinningStrategies> getWinngStrategies() {
        return winngStrategies;
    }

    public static Builder getBuilder(){
        return new Builder();
    }



    public static class Builder{

        private int dimensions;
        private List<Player> players;
        private List<WinningStrategies>winngStrategies;

        public Builder setDimensions(int dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinngStrategies(List<WinningStrategies> winngStrategies) {
            this.winngStrategies = winngStrategies;
            return this;
        }


        public Game build(){

//            validate
            int cnt=0;
            for(Player player:players){
                if(player.getState().equals(PlayerState.BOT)){
                    cnt+=1;
                    if(cnt>1){
                        throw new RuntimeException();
                    }
                }
            }

            if(players.size()!=dimensions-1){
                throw new RuntimeException();
            }

            return new Game(this);
        }
    }

}
