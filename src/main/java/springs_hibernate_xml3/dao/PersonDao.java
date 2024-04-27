package springs_hibernate_xml3.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import springs_hibernate_xml3.dto.BankAccount;
import springs_hibernate_xml3.dto.Person;

public class PersonDao {
	
	public EntityManager getManager()
	{
		return Persistence.createEntityManagerFactory("kishor").createEntityManager();
	}
	
	public void savePerson(Person p,BankAccount b1,BankAccount b2,BankAccount b3,BankAccount b4)
	{
		EntityManager manager=getManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(p);
		manager.persist(b1);
		manager.persist(b2);
		manager.persist(b3);
		manager.persist(b4);
		transaction.commit();
	}
	public void getPerson(int id)
	{
		EntityManager manager=getManager();
		EntityTransaction transaction=manager.getTransaction();
		Person person=manager.find(Person.class,id);
		if(person!=null)
		{
			System.out.println(person);
		}
		else
		{
			System.out.println("Person not found");
		}
	}
	public void deletePerson(int id)
	{
		EntityManager manager=getManager();
		EntityTransaction transaction=manager.getTransaction();
		Person person=manager.find(Person.class,id);
		if(person!=null)
		{
			transaction.begin();
			manager.remove(person);
			transaction.commit();	
		}
		else
		{
			System.out.println("College not found");
		}
	}
	public void updatePerson(int id,Person person)
	{
		EntityManager manager=getManager();
		EntityTransaction transaction=manager.getTransaction();
		Person person2=manager.find(Person.class,id);
		if(person2!=null)
		{
			person.setId(id);
			transaction.begin();
			manager.merge(person);
			transaction.commit();
		}
		else
		{
			System.out.println("College not found");
		}

	}
	
		
}

