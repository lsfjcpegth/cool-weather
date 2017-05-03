package com.example.administrator.coolweatherapplication.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/5/2 0002.
 */

public class Provice extends DataSupport {
    private int id;
    private String provinceName;
    private int proviceCode;
    public int getId(){
        return id;
    }

  public void setId(int id){
      this.id=id;
  }
    public void setProvinceName(String provinceName){
        this.provinceName=provinceName;

    }
    public String getProvinceName(){
        return provinceName;
    }
    public int getProviceCode(){
        return proviceCode;
    }
    public void setProviceCode(int proviceCode){
        this.proviceCode=proviceCode;
    }
}
