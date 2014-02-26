package org.yagamipaul.timetracker;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres
 *         Correal</a> 25/02/2014
 *
 */
public class MainController implements Initializable {

	/** Class logger */
	private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);

	/*
	 * (non-Javadoc)
	 *
	 * @see javafx.fxml.Initializable#initialize(java.net.URL,
	 * java.util.ResourceBundle)
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

	/**
	 * Terminates the application
	 */
	@FXML
	public void closeApplication() {
		LOGGER.debug("Close application selected.");
		Platform.exit();
	}

}
