package in.Ashokit.binding;

import java.time.LocalDate;

import javax.persistence.Column;

import lombok.Data;

@Data
public class KES_Res {
	private Integer id;
	private String name;
	private String e_mail;
	private Integer m_no;
	private String Gender;
	private LocalDate Dob;
	private String ssn;
	private String Regd_no;
	private String state;
}
