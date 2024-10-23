package com.scaler.tictactoe.TTTgmae.Factory;

import com.scaler.tictactoe.TTTgmae.models.BotDifficultyLevel;
import com.scaler.tictactoe.TTTgmae.strategies.botPlayingStrategies.BotplayingStrategies;
import com.scaler.tictactoe.TTTgmae.strategies.botPlayingStrategies.GodStrategy;
import com.scaler.tictactoe.TTTgmae.strategies.botPlayingStrategies.NoobStrategy;
import com.scaler.tictactoe.TTTgmae.strategies.botPlayingStrategies.ProStrategy;

public class BotPlayingStrategyFactory {


    public static BotplayingStrategies getStratey(BotDifficultyLevel botDifficultyLevel){

        if(botDifficultyLevel == BotDifficultyLevel.EASY){
            return new NoobStrategy();
        }
        else if(botDifficultyLevel == BotDifficultyLevel.HARD){
            return new GodStrategy();
        }
        else{
            return new ProStrategy();
        }

    }

}
