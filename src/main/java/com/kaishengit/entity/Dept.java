package com.kaishengit.entity;

/**
 * Created by Administrator on 2017/10/25.
 */
public class Dept {
    private int id;
    private String descript;

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", descript='" + descript + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }
}
