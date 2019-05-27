package com.smeup.rpgclient;

import com.smeup.rpgparser.RunnerKt;
import com.smeup.rpgparser.jvminterop.JavaSystemInterface;

public class ExampleCallJava {

	public static void main(String[] args) {
	    JavaSystemInterface.INSTANCE.addJavaInteropPackage("com.smeup.rpgclient");
	    RunnerKt.main(new String[] {"CALLJAVA"});
	}
}
