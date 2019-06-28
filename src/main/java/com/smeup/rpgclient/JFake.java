package com.smeup.rpgclient;

import java.util.*;

import com.smeup.rpgparser.interpreter.*;

/*
 * Java class that impersonates an RPG program
 * It's called by the CALLJAVA.rpgle in the examples folder.
 * See the ExampleCallJava class
 */
public class JFake implements Program {

	public List<Value> execute(SystemInterface systemInterface, LinkedHashMap<String, Value> parms) {
		System.out.println("Hey, I'm a fake RPG progam!");
		System.out.println("You called me with these parms:");
		for (Map.Entry<String, ? extends Value> entry : parms.entrySet()) {
			System.out.println("Name: " + entry.getKey() + " - Value: " + entry.getValue());
		}
		return new ArrayList<Value>();
	}

	public List<ProgramParam> params() {
		return new ArrayList<ProgramParam>() {{
			add(new ProgramParam("Foo", new StringType(12)));
		}};
	}

}
