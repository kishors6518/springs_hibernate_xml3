package springs_hibernate_xml3.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springs_hibernate_xml3.dao.PersonDao;
import springs_hibernate_xml3.dto.BankAccount;
import springs_hibernate_xml3.dto.Person;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bankaccount.xml");
		PersonDao dao=context.getBean("dao",PersonDao.class);
		Person person=(Person) context.getBean("per");
		BankAccount b1=context.getBean("bank",BankAccount.class);
		BankAccount b2=context.getBean("bank2",BankAccount.class);
		BankAccount b3=context.getBean("bank3",BankAccount.class);
		BankAccount b4=context.getBean("bank4",BankAccount.class);
		//dao.savePerson(person, b1, b2,b3,b4);
		dao.getPerson(2);
		

	}

}
