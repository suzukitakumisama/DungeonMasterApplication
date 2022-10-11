package com.dungeonmaster.game;//@author CHEN
import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.settings.GameSettings;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * @author takumi
 */
public class MainGameApp extends GameApplication {

    @Override
    protected void initSettings(GameSettings gameSettings) {
        gameSettings.setTitle("DungeonMaster");
        gameSettings.setAppIcon("");
    }

}
