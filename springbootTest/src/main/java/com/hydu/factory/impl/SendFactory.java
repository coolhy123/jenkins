package com.hydu.factory.impl;

import com.hydu.factory.Sender;

public class SendFactory {
	
	public Sender product(String type) {
		
		if("Mail".equals(type)) {
			return new MailSender();
		}else if("QQ".equals(type)) {
			return new QQSender();
		}else {
			System.out.println("类型不对，请重新输入类型");
			return null;
		}
	}

}
