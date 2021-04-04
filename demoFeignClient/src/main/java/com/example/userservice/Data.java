package com.example.userservice;

public class Data {

    int i;
    String s;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Data(int i, String s) {
        this.i = i;
        this.s = s;
    }

    public Data() {
    }

    @Override
    public String toString() {
        return "Data{" +
                "i=" + i +
                ", s='" + s + '\'' +
                '}';
    }
}
