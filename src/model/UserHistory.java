/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class UserHistory {
    
    private ArrayList<User> history;
    
    public UserHistory() {
        this.history = new ArrayList<User>();
        
    }

    public ArrayList<User> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<User> history) {
        this.history = history;
    }
   
public User addNewUser(){    
    User newUser = new User();
    history.add(newUser);
    return newUser;
}
}
