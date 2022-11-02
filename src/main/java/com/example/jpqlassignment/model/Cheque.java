package com.example.jpqlassignment.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="cheque")
@PrimaryKeyJoinColumn(name = "id")
//@DiscriminatorValue("ch")
public class Cheque extends Payment{
    private String chequeNumber;

    public String getChequeNumber() {
        return chequeNumber;
    }

    public void setChequeNumber(String chequeNumber) {
        this.chequeNumber = chequeNumber;
    }


}
