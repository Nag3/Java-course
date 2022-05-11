import java.sql.Date;
import java.time.LocalDate;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="bank_applicant1")
public class BankApplicant{
	@Id
	@GeneratedValue
	@Column(name="applicant_id")
	private int applicantId;
	@Column(name="applicant_name",length = 35)
	private String applicantName;
	@Column(name="email_address",length = 35)
	private String emaiAddress;
	@Column(name="address",length = 35)
	private String address;
	private String mobNo;
	private LocalDate dob;
	private String accType;
	private String appStatus; 
	
	@OneToOne(mappedBy = "bankApplicant")
	private PanCard pancard;

	public int getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getEmaiAddress() {
		return emaiAddress;
	}

	public void setEmaiAddress(String emaiAddress) {
		this.emaiAddress = emaiAddress;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate localDate) {
		this.dob = localDate;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public String getAppStatus() {
		return appStatus;
	}

	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}

	public PanCard getPancard() {
		return pancard;
	}

	public void setPancard(PanCard pancard) {
		this.pancard = pancard;
	}
	
	
}
