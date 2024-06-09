package controllers;

import views.SignatureViews;

public class SignatureController {
	public SignatureViews view;
	
	public SignatureController() {
		view = new SignatureViews();
	}
	
	public void menu() {
		view.menu();
	}
	
	public void add() {
		view.add();
	}
	
	public void edit() {
		view.edit();
	}
	
	public void details() {
		view.details();
	}
	
	public void delete() {
		view.delete();
	}
}
