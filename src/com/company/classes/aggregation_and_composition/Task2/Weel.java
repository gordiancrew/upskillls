package com.company.classes.aggregation_and_composition.Task2;

public class Weel {

    private int diametr;
    private String season;
    private String firm;
    private boolean activ;

    public Weel() {
        diametr = 0;
        season = "unknow";
        firm = "unknow";
    }

    public Weel(int diametr, String season, String firm) {
        this.diametr = diametr;
        this.season = season;
        this.firm = firm;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public void weelSpining(Boolean activ){
        System.out.println(activ?"The weel"+toString()+" are spining.":"The weel"+toString()+" are static.");
    }



    @Override
    public String toString() {
        return "Weel{" +
                "diametr=" + diametr +
                ", season='" + season + '\'' +
                ", firm='" + firm + '\'' +
                '}';
    }
}
