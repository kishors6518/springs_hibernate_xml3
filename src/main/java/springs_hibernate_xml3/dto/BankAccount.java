package springs_hibernate_xml3.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class BankAccount {
	@Id
	private int id;
	private String name;
	private String ifsc;
	private double balance;
	@ManyToOne
	private Person person;
	

}
