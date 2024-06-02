package controllers;

import views.HomeView;

public class HomeController {
	
	public HomeView view;

	public HomeController() {
		
		view = new HomeView();
	}
	
	public void dashboard() {
		
		view.dashboard();
		
	}

}
