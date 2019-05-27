package com.smeup.rpgclient;

import java.util.*;

import com.smeup.rpgparser.interpreter.*;

public class JFake implements Program {

	public List<Value> execute(SystemInterface systemInterface, Map<String, ? extends Value> parms) {
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
