package com.smeup.rpgclient;

import java.io.File;

import com.smeup.rpgparser.RunnerKt;
import com.smeup.rpgparser.rgpinterop.DirRpgProgramFinder;
import com.smeup.rpgparser.rgpinterop.RpgSystem;

public class Example1 {

	public static void main(String[] args) {
		RpgSystem.INSTANCE.addProgramFinder(new DirRpgProgramFinder(new File("C:/Sviluppo/Java/WSCSPI-JD001/src/test/resources/rpg/")));
		RunnerKt.main(new String[] {"JD_001B", "ESE", "", "http://www.smeup.com", ""});
	}
}
