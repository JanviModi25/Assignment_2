/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Image;

/**
 *
 * @author ADMIN
 */
public class User {
    private String Name;
    private String EmpID;
    private int Age;
    private String Gender;
    private String SrtDt;
    private String Level;
    private String TeamInfo;
    private String Postitle;
    private String ContInfo;
    private int CellPhnNo;
    private String emailadd;
    private Image Photo;

    public Image getPhoto() {
        return Photo;
    }

    public void setPhoto(Image Photo) {
        this.Photo = Photo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmpID() {
        return EmpID;
    }

    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getSrtDt() {
        return SrtDt;
    }

    public void setSrtDt(String SrtDt) {
        this.SrtDt = SrtDt;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public String getTeamInfo() {
        return TeamInfo;
    }

    public void setTeamInfo(String TeamInfo) {
        this.TeamInfo = TeamInfo;
    }

    public String getPostitle() {
        return Postitle;
    }

    public void setPostitle(String Postitle) {
        this.Postitle = Postitle;
    }

    public String getContInfo() {
        return ContInfo;
    }

    public void setContInfo(String ContInfo) {
        this.ContInfo = ContInfo;
    }

    public int getCellPhnNo() {
        return CellPhnNo;
    }

    public void setCellPhnNo(int CellPhnNo) {
        this.CellPhnNo = CellPhnNo;
    }

    public String getEmailadd() {
        return emailadd;
    }

    public void setEmailadd(String emailadd) {
        this.emailadd = emailadd;
    }

    
    
    @Override
    public String toString(){
        return Name;
    }
    
    
}
