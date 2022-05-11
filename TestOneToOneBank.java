import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

public class TestOneToOneBank {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
	EntityManager em=emf.createEntityManager();
	@Test
	public void insertDataTest() {
		System.out.println("EntityManagerFactory created:"+emf);
		EntityTransaction et=em.getTransaction();
		et.begin();
		BankApplicant ba=new BankApplicant();
		ba.setAccType("Savings Account");
		ba.setAddress("Begumpet");
		//ba.setApplicantId(205);
		ba.setApplicantName("Rudra");
		ba.setAppStatus("Registered");
		ba.setDob(LocalDate.of(1990, 11, 11));
		ba.setEmaiAddress("rudra@one.com");
		ba.setMobNo("7894561231");
		
		System.out.println("Saving Bank Applicant Data..");
		em.persist(ba);
		//et.commit();
		System.out.println("Bank Applicant data saved successfully..");
		
		//et.begin();
		PanCard pc=new PanCard();
		pc.setDob(LocalDate.of(1990, 11, 11));
		pc.setFatherName("Shiva");
		pc.setName("Rudra");
		pc.setPanNo("SUJAP0125Q");
		
		ba.setPancard(pc);
		pc.setBankApplicant(ba);
		System.out.println("Saving Pan Data..");
		em.persist(pc);
		et.commit();
		System.out.println("Pan data saved successfully..");
		
		
	}
}
