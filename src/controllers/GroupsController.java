package controllers;

import views.GroupsView;

public class GroupsController {
	private GroupsView view;
	
	public GroupsController(){
		view = new GroupsView();
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
