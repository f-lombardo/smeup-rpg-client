package com.smeup.rpgclient;

import java.io.File;
import java.util.Arrays;

import com.smeup.rpgparser.CommandLineParms;
import com.smeup.rpgparser.RunnerKt;
import com.smeup.rpgparser.rgpinterop.DirRpgProgramFinder;
import com.smeup.rpgparser.rgpinterop.RpgSystem;

public class Example1 {

	/**
	 * Example on passing and receiving values
	 */
	public static void main(String[] args) {
		RpgSystem.INSTANCE.addProgramFinder(new DirRpgProgramFinder(new File("examples/rpg")));
		
		CommandLineParms parms = RunnerKt.getProgram("CALCFIB").singleCall(Arrays.asList("7"));
		
		//It should output 13
		System.out.println(parms.getParmsList().get(0));
	}
}
