package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Palindrome {
	
	@Id
	@Column
	@GeneratedValue
	private Long id;
	@Column
	private String palindrome;
	

}
