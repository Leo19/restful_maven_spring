package com.pajinke.server;

import java.util.UUID;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i ++) {
			UUID uuid = UUID.randomUUID();
			System.out.println(uuid);
			System.out.println(uuid.toString().length());
		}
	}

}
