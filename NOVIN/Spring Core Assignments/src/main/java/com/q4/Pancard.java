package com.q4;

public class Pancard {
private String panHolderName;
private int panNumber;


public String getPanHolderName() {
	return panHolderName;
}
public void setPanHolderName(String panHolderName) {
	this.panHolderName = panHolderName;
}
public int getPanNumber() {
	return panNumber;
}
public void setPanNumber(int panNumber) {
	this.panNumber = panNumber;
}
@Override
public String toString() {
	return "Pancard [panHolderName=" + panHolderName + ", panNumber=" + panNumber + "]";
}

}