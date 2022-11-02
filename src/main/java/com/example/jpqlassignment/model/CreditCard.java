package com.example.jpqlassignment.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="card")
@PrimaryKeyJoinColumn(name = "id")
//@DiscriminatorValue("cc")
public class CreditCard extends Payment {
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    private String cardNumber;
}
