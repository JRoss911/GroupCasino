package com.github.zipcodewilmington.casino.games.HeadsOrTails;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.GamblingPlayerInterface;

public class HeadsOrTailsPlayer implements GamblingPlayerInterface {

    public CasinoAccount account;
    public HeadsOrTailsPlayer(CasinoAccount account){
        this.account = account;
    }




}
