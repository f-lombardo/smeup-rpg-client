package com.smeup.rpgclient;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import com.smeup.rpgparser.CommandLineProgram;
import com.smeup.rpgparser.RunnerKt;
import com.smeup.rpgparser.jvminterop.JavaSystemInterface;

public class RedirectOutputExample {

	/*
	 * Program that shows how to get the output that a RPG program create through the 
	 * DSPLY op code
	 */
	public static void main(String[] args) {
		boolean echo = true;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream  myStream = new PrintStream(baos);
	    
		//Tell to the interpreter "environment" to write output on myStream
		JavaSystemInterface javaSystemInterface = new JavaSystemInterface(myStream);
	    
		//Loads the program
		CommandLineProgram program = RunnerKt.getProgram("HELLO", javaSystemInterface);
		
	    program.setTraceMode(false);
	    
	    //Runs the progam
	    program.singleCall(new ArrayList<String>());
	    
	    //Using the output
	    if (echo) {
	    	String data = new String(baos.toByteArray(), StandardCharsets.UTF_8);
	    	System.out.println(data);
	    }
	}
}
