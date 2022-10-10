package com.dungeonmaster.game.userController.entities.utilFactory;//@author CHEN

import javax.swing.*;
import java.awt.*;


public class ScreenLoader extends JFrame {
    public static int getScreenWidth(int width){
        Toolkit defaultToolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = defaultToolkit.getScreenSize();
        return dimension.width;
    }

    public static int getScreenHeight(int height){
        Toolkit defaultToolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = defaultToolkit.getScreenSize();
        return dimension.height;
    }
}
