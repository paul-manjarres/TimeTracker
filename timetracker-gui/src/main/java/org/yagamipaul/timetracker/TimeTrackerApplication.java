package org.yagamipaul.timetracker;

import java.util.Locale;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres
 *         Correal</a> 25/02/2014
 *
 */
public class TimeTrackerApplication extends Application {

	/*
	 * (non-Javadoc)
	 *
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage stage) throws Exception {

		ResourceBundle resources = ResourceBundle.getBundle("org.yagamipaul.timetracker.TimeTrackerMain", new Locale("en"));

		final Parent root = FXMLLoader.load(getClass().getResource("TimeTrackerMain.fxml"), resources);
		final Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		stage.setTitle("Time Tracker");

	}

	/**
	 * Main Application starter
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
