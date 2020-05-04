package com.myapplicationdev.android.sgholidays;

public class PH {

    private String title;
    private String imgName;
    private String date;
    private String cat;


    public PH(String cat, String title, String imgName, String date){
        this.cat = cat;
        this.title = title;
        this.imgName = imgName;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }
}
