package com.toh.algo;

import com.toh.ui.Printer;

abstract class AbstractMoveStrategy implements MoveStrategy {

	protected Printer printer;

	public AbstractMoveStrategy(Printer printer) {
		this.printer = printer;
	}
	

}
