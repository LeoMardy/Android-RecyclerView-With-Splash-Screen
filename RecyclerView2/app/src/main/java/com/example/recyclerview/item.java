package com.example.recyclerview;

public class item {
    String developerName,developerCompany,developerSkill;
    int developerImage;

    public item(String developerName, String developerCompany, String developerSkill, int developerImage) {
        this.developerName = developerName;
        this.developerCompany = developerCompany;
        this.developerSkill = developerSkill;
        this.developerImage = developerImage;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public String getDeveloperCompany() {
        return developerCompany;
    }

    public void setDeveloperCompany(String developerCompany) {
        this.developerCompany = developerCompany;
    }

    public String getDeveloperSkill() {
        return developerSkill;
    }

    public void setDeveloperSkill(String developerSkill) {
        this.developerSkill = developerSkill;
    }

    public int getDeveloperImage() {
        return developerImage;
    }

    public void setDeveloperImage(int developerImage) {
        this.developerImage = developerImage;
    }
}
