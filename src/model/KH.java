/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Quang Vinh
 */
public class KH implements Serializable{
    private int id;
    private String name, add,sdt, loai;
    public static int currentId=9999;

    public KH(String name, String add, String sdt, String loai) {
        this.id=++currentId;
        this.name = name;
        this.add = add;
        this.sdt = sdt;
        this.loai = loai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        KH.currentId = currentId;
    }
    public Object[] toObjects()
    {
        return new Object[]{id, name, add, sdt, loai};
    }
}
