package it.cb.spring.pojo;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {

	private PrintStream stream;

	public SlayDragonQuest(PrintStream stream) {
		this.stream = stream;
	}

	public void embark() {
		stream.println("Embarking on quest to slay the dragon!");
	}

}
