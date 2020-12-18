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
public class QL implements Serializable{
    private KH k;
    private P p;
    private String d;

    public QL(KH k, P p, String d) {
        this.k = k;
        this.p = p;
        this.d = d;
    }

    public KH getK() {
        return k;
    }

    public void setK(KH k) {
        this.k = k;
    }

    public P getP() {
        return p;
    }

    public void setP(P p) {
        this.p = p;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    
    public Object[] toObjects()
    {
        return new Object[]{k.getId(), k.getName(), p.getId(),p.getName(), d} ;
    }
}
