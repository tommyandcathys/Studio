package com.smithware.studiolive;

public class verse {
String address;
String verse;
public verse(String address, String verse){
	setVerse(verse);
	setLocation(address);
}
public String getLocation() {
	return address;
}
public void setLocation(String location) {
	address = location;
}
public String getVerse() {
	return verse;
}
public void setVerse(String verse) {
	this.verse = verse;
}
}
