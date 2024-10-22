package com.scaler.tictactoe.TTTgmae.models;
import com.scaler.tictactoe.TTTgmae.strategies.winningStrategies;

import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.util.*;

public class Game
{

    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private GameState state;
    private Player winner;
    private int nextPlayerMoveIndex;
    List<winningStrategies>winngStrategies;

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

    public List<winningStrategies> getWinngStrategies() {
        return winngStrategies;
    }

    public static Builder getBuilder(){
        return new Builder();
    }
    private Game(Builder builder){
        this.winngStrategies=builder.winngStrategies;
        this.players=builder.players;
        this.moves=moves;
        this.board=new Board(builder.dimensions);
        this.winner=null;
        this.state=GameState.INPROGRESS;
        this.nextPlayerMoveIndex=0;
    }



    public static class Builder{

        private int dimensions;
        private List<Player> players;
        private List<winningStrategies>winngStrategies;

        public Builder setDimensions(int dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinngStrategies(List<winningStrategies> winngStrategies) {
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

            return new Game(new Builder());
        }
    }

}
