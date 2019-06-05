package com.smeup.rpgclient;

import java.util.ArrayList;

import com.smeup.rpgparser.CommandLineProgram;
import com.smeup.rpgparser.RunnerKt;
import com.smeup.rpgparser.jvminterop.JavaSystemInterface;

public class ExampleCallJava {

	public static void main(String[] args) {
	    JavaSystemInterface javaSystemInterface = new JavaSystemInterface();
		javaSystemInterface.addJavaInteropPackage("com.smeup.rpgclient");
	    CommandLineProgram program = RunnerKt.getProgram("CALLJAVA", javaSystemInterface);
	    program.setTraceMode(true);
	    program.singleCall(new ArrayList<String>());
	}
}
