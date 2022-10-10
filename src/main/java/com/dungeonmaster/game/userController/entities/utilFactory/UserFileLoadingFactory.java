package com.dungeonmaster.game.userController.entities.utilFactory;//@author CHEN

import com.dungeonmaster.game.userController.entities.User;

public class UserFileLoadingFactory {
    public User getLoadingFile(Integer autoFileID, Integer userID, Integer fileId,String userAutoMsg,String userMsg ){
        return this.getLoadingFile(autoFileID,userID,fileId,userAutoMsg,userMsg);
    }
    public User LoadingAutoFileSuc(Integer autoFileID, Integer userID,String userAutoMsg){
        return this.getLoadingFile(autoFileID,userID,null,userAutoMsg,null);
    }
    public User LoadingFileSuc(Integer userID, Integer fileId,String userMsg){
        return this.getLoadingFile(null,userID,fileId,null,userMsg);
    }
}
