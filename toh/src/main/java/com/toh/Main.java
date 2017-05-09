package com.toh;

import com.toh.algo.MoveStrategyKind;
import com.toh.controller.Controller;

/**
 * This is an obsolete version to make the machinery run.
 * Better, you use a test!!!
 * @author thomasbaar
 *
 */

public class Main {

	public static void main(String[] args) {
		Controller controller = new Controller();
		
		controller.setUp(6);
		controller.setAlgorithm(MoveStrategyKind.recursive);
		
		controller.start();

	}

}
