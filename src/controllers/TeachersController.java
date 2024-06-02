package controllers;

import views.TeachersViews;

public class TeachersController {
	public TeachersViews view;
	
	public TeachersController() {
		view = new TeachersViews();
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
	
	public void search() {
		view.search();
	}
	
	public void download() {
		view.download();
	}
	
	public void delete() {
		view.delete();
	}

}
