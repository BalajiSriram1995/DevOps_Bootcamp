package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.MessageService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MessageServiceTest {
	
	//Msg Service
	
	@Test
	public void checkmsg() {
		MessageService ms = new MessageService();
		Assertions.assertEquals(ms.msg(), "Hello World");
	}
	
	@Test
	public void checkmsgnotnull() {
		MessageService ms = new MessageService();
		Assertions.assertNotNull(ms.msg());
		
	}
	@Test
	public void checkmsgStartsWith() {
		MessageService ms = new MessageService();
		Assertions.assertTrue(ms.msg().startsWith("H"));
		
	}
	
	@Test
	public void checkmsgEndsWith() {
		MessageService ms = new MessageService();
		Assertions.assertTrue(ms.msg().endsWith("d"));
		
	}
	
	@Test
	public void checkmsglength() {
		MessageService ms = new MessageService();
		Assertions.assertTrue(ms.msg().length()==11);
		
	}
	
	//Sum Service

	@Test
	public void checkequal() {
		MessageService ms = new MessageService();
		Assertions.assertEquals(ms.sum(), 30);
	}
	

	@Test
	public void checknotnull() {
		MessageService ms = new MessageService();
		Assertions.assertNotNull(ms.sum());
		
	}
	/*
	@Test
	public void checknull() {
		MessageService ms = new MessageService();
		Assertions.assertNull(ms.sum());
		
	}*/
	
	@Test
	public void checkPositiveNumber() {
		MessageService ms = new MessageService();
		Assertions.assertTrue(ms.sum()>0);
	}
	
	/*
	@Test
	public void checkNegativeNumber() {
		MessageService ms = new MessageService();
		Assertions.assertFalse(ms.sum()>=0);
	}
	
	*/
	
	
	
}