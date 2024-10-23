package com.scaler.machineCoding.TTTgmae.Factory;

import com.scaler.machineCoding.TTTgmae.models.BotDifficultyLevel;
import com.scaler.machineCoding.TTTgmae.strategies.botPlayingStrategies.BotplayingStrategies;
import com.scaler.machineCoding.TTTgmae.strategies.botPlayingStrategies.GodStrategy;
import com.scaler.machineCoding.TTTgmae.strategies.botPlayingStrategies.NoobStrategy;
import com.scaler.machineCoding.TTTgmae.strategies.botPlayingStrategies.ProStrategy;

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
