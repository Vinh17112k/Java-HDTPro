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
public class TT implements Serializable{
    private QL q;

    public TT(QL q) {
        this.q = q;
    }

    public QL getQ() {
        return q;
    }

    public void setQ(QL q) {
        this.q = q;
    }
    public Object[] toObjects()
    {
        return new Object[]{q.getK().getId(), q.getK().getName(), q.getP().getId(), q.getP().getName(), q.getD()};
    }
}
