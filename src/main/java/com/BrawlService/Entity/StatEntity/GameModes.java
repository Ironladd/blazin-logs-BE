package com.BrawlService.Entity.StatEntity;

import lombok.Data;


import java.util.List;

@Data
public class GameModes {

    public static final List<String> gameModes = List.of(
            "gemGrab", "soloShowdown","duoShowdown",
            "brawlBall", "hotZone","bounty","knockout",
            "takedown","wipeout","duels");


}
