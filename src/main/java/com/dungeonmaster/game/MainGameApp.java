package com.dungeonmaster.game;//@author CHEN
import com.almasb.fxgl.app.GameApplication;
import com.dungeonmaster.game.userController.entities.utilFactory.ScreenLoader;
import com.almasb.fxgl.settings.GameSettings;
import com.dungeonmaster.game.entities.PlayerEntities;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * @author takumi
 */
public class MainGameApp extends GameApplication {
    @Resource
    private PlayerEntities playerEntities;

    @Override
    protected void initSettings(GameSettings gameSettings) {
        gameSettings.setHeight(ScreenLoader.getScreenHeight(0));
        gameSettings.setWidth(ScreenLoader.getScreenWidth(0));
        gameSettings.setTitle("DungeonMaster");
        gameSettings.setAppIcon("");
    }

}
