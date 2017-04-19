package ru.spec.rmi;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import ru.spec.ee.ejb.IEchoService;


public class EntryPoint1 {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		Context ctx = new InitialContext();
		IEchoService echoBean = (IEchoService) ctx.lookup("echoBean");
		String result = echoBean.echo("hello");
		System.out.println(result);
		
	}

}
