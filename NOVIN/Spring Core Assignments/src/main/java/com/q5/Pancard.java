package com.q5;

import org.springframework.beans.factory.annotation.*;

public class Pancard {
private String panHolderName;
private int panNumber;


public String getPanHolderName() {
	return panHolderName;
}

@Required
public void setPanHolderName(String panHolderName) {
	this.panHolderName = panHolderName;
}
public int getPanNumber() {
	return panNumber;
}

@Required
public void setPanNumber(int panNumber) {
	this.panNumber = panNumber;
}
@Override
public String toString() {
	return "Pancard [panHolderName=" + panHolderName + ", panNumber=" + panNumber + "]";
}

}