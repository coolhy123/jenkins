package com.hydu.factory.impl;

import com.hydu.factory.Sender;

public class FactoryTest {

	public static void main(String[] args) {
		SendFactory factory=new SendFactory();
		 Sender sender = factory.product("Wechat");  
	        sender.send();  
	}
}
