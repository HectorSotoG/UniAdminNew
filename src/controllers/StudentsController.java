package controllers;

import views.StudentsView;

public class StudentsController {
	public StudentsView view;
	
	public StudentsController() {
		view = new StudentsView();
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
