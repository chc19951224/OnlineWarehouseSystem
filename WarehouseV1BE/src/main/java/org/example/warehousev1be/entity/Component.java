package org.example.warehousev1be.entity;

import lombok.Data;

@Data  //@自动生成Get/SET方法
public class Component {
    //与数据表的字段保持一致
    private int id;
    private String 編號; //编号
    private String 圖片; //图片
    private String 顔色; //颜色
    private String 型號; //型号
    private int 起始年份; //起始年份
    private int 終止年份; //终止年份
    private String 平均價格;

    //GET/SET方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String get編號() {
        return 編號;
    }

    public void set編號(String 編號) {
        this.編號 = 編號;
    }

    public String get圖片() {
        return 圖片;
    }

    public void set圖片(String 圖片) {
        this.圖片 = 圖片;
    }

    public String get顔色() {
        return 顔色;
    }

    public void set顔色(String 顔色) {
        this.顔色 = 顔色;
    }

    public String get型號() {
        return 型號;
    }

    public void set型號(String 型號) {
        this.型號 = 型號;
    }

    public int get起始年份() {
        return 起始年份;
    }

    public void set起始年份(int 起始年份) {
        this.起始年份 = 起始年份;
    }

    public int get終止年份() {
        return 終止年份;
    }

    public void set終止年份(int 終止年份) {
        this.終止年份 = 終止年份;
    }

    public String get平均價格() {
        return 平均價格;
    }

    public void set平均價格(String 平均價格) {
        this.平均價格 = 平均價格;
    }
}
