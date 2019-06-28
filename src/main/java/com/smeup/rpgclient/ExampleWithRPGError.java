package com.smeup.rpgclient;

import java.io.File;
import java.util.Arrays;

import com.smeup.rpgparser.RunnerKt;
import com.smeup.rpgparser.rgpinterop.DirRpgProgramFinder;
import com.smeup.rpgparser.rgpinterop.RpgSystem;

public class ExampleWithRPGError {

	/**
	 * Example calling an RPG program that raises an error
	 */
	public static void main(String[] args) {
		RpgSystem.INSTANCE.addProgramFinder(new DirRpgProgramFinder(new File("examples/rpg")));
		
		try {
			RunnerKt.getProgram("ERROR01").singleCall(Arrays.asList("7"));
		} catch (Throwable t) {
			System.out.println("Got exception " + t);
		}
		
	}
}
