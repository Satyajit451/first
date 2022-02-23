package in.Ashokit.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name="KES_DATA")
public class KES {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Integer id;
	@Column(name="NAME")
	private String name;
	@Column(name="E_MAIL")
	private String e_mail;
	@Column(name="M_NO")
	private Integer m_no;
	@Column(name="GENDER")
	private String Gender;
	@Column(name="DOB")
	private LocalDate Dob;
	@Column(name="SSN")
	private String ssn;
	@Column(name="REGD_NO")
	private String Regd_no;
	@Column(name= "STATE")
	private String state;
	
	

}
