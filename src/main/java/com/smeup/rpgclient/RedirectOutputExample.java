package com.smeup.rpgclient;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import com.smeup.rpgparser.CommandLineProgram;
import com.smeup.rpgparser.RunnerKt;
import com.smeup.rpgparser.jvminterop.JavaSystemInterface;

public class RedirectOutputExample {

	public static void main(String[] args) {
		boolean echo = true;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream  myStream = new PrintStream(baos);
	    JavaSystemInterface javaSystemInterface = new JavaSystemInterface(myStream);
	    CommandLineProgram program = RunnerKt.getProgram("HELLO", javaSystemInterface);
	    program.setTraceMode(false);
	    program.singleCall(new ArrayList<String>());
	    if (echo) {
	    	String data = new String(baos.toByteArray(), StandardCharsets.UTF_8);
	    	System.out.println(data);
	    }
	}
}
