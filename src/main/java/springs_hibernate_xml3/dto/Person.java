package springs_hibernate_xml3.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Person {
	@Id
	private int id;
	private String name;
	private long phone;
	private String address;
	

}
