package com.dungeonmaster.game.userController.entities;//@author CHEN


public class User {
    private Integer autoFileID;
    private Integer fileID;
    private Integer UserID;
    private String UserMsg;
    private String UserAutoMsg;

    public User(Integer fileID, Integer userID, String userMsg) {
        this.fileID = fileID;
        UserID = userID;
        UserMsg = userMsg;
    }
    public User(Integer autoFileID, Integer userID, String userMsg,String UserAutoMsg) {
        this.autoFileID = fileID;
        this.UserAutoMsg = UserAutoMsg;
        UserID = userID;
        UserMsg = userMsg;
    }

    public Integer getAutoFileID() {
        return autoFileID;
    }

    public void setAutoFileID(Integer autoFileID) {
        this.autoFileID = autoFileID;
    }

    public Integer getFileID() {
        return fileID;
    }

    public void setFileID(Integer fileID) {
        this.fileID = fileID;
    }

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer userID) {
        UserID = userID;
    }

    public String getUserMsg() {
        return UserMsg;
    }

    public void setUserMsg(String userMsg) {
        UserMsg = userMsg;
    }

    public String getUserAutoMsg() {
        return UserAutoMsg;
    }

    public void setUserAutoMsg(String userAutoMsg) {
        UserAutoMsg = userAutoMsg;
    }
}
