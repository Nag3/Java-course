import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="pancard")
public class PanCard {
	@Id
	@Column(name="pan_no")
	private String panNo;
	@Column(name="name",length = 30)
	private String name;
	@Column(name="father_name",length = 30)
	private String fatherName;
	private LocalDate dob;
	@OneToOne
	@JoinColumn(name="applicant_no")
	private BankApplicant bankApplicant;
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate localDate) {
		this.dob = localDate;
	}
	public BankApplicant getBankApplicant() {
		return bankApplicant;
	}
	public void setBankApplicant(BankApplicant bankApplicant) {
		this.bankApplicant = bankApplicant;
	}
	
}
