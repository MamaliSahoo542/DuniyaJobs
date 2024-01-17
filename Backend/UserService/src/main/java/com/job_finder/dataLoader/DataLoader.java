package com.job_finder.dataLoader;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import com.job_finder.entity.Company;
import com.job_finder.repository.CompanyRepository;

public class DataLoader implements ApplicationRunner{

	@Autowired
	private CompanyRepository cr;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		cr.deleteAll();
		Company c1=new Company();//1st company
		c1.setCompanyName("Microden Software Solutions");
		c1.setPassword("microden@123");
		c1.setLocation("Hyderabad");
		c1.setContactEmail("microden123@gmail.com");
		c1.setContactPhone("040-667788");
		c1.setDescription("Enhace your skills here");
		c1.setIndustry("IT-Industry");
		c1.setStatus("active");
		c1.setAccStatus("unlocked");
//		   List l1=new ArrayList();
//		      l1.add("");
//		      l1.add("");
//		c1.setJobs(l1);
//		
		
		Company c2=new Company();//2nd company
		c2.setCompanyName("Wipro");
		c2.setPassword("wipro@123");
		c2.setLocation("Hyderabad,bangeluru");
		c2.setContactEmail("wipro123@gmail.com");
		c2.setContactPhone("080-76545556");
		c2.setDescription("upgrade your self");
		c2.setIndustry("IT-industry");
		c2.setStatus("active");
		c2.setAccStatus("unlocked");
//		   List l2=new ArrayList();
//		      l2.add("");
//		      l2.add("");
//		c2.setJobs(l2);
//		 
		Company c3=new Company();//3rd company
		c3.setCompanyName("Deloitte");
		c3.setPassword("deloitte@123");
		c3.setLocation("Hyderabad,indoor");
		c3.setContactEmail("deloitte123@gmail.com");
		c3.setContactPhone("070-674865556");
		c3.setDescription("grab every oppurtinity");
		c3.setIndustry("IT-industry");
		c3.setStatus("active");
		c3.setAccStatus("unlocked");
//		   List l3=new ArrayList();
//		      l3.add("");
//		      l3.add("");
//		c3.setJobs(l3);
//		
		
		Company c4=new Company();//4th company
		c4.setCompanyName("IBM");
		c4.setPassword("ibm@123");
		c4.setLocation("Hyderabad,Delhi");
		c4.setContactEmail("ibm123gmail.com");
		c4.setContactPhone("090-67761238");
		c4.setDescription("every steps matters");
		c4.setIndustry("IT-industry");
		c4.setStatus("active");
		c4.setAccStatus("unlocked");
//		   List l4=new ArrayList();
//		      l4.add("");
//		      l4.add("");
//		c4.setJobs(l4);
//		 
		Company c5=new Company();//5th company
		c5.setCompanyName("Microsoft");
		c5.setPassword("micro@123");
		c5.setLocation("Hyderabad,Indoor");
		c5.setContactEmail("microsoft123@gmail.com");
		c5.setContactPhone("040-8641278");
		c5.setDescription("success is at your door step");
		c5.setIndustry("IT-industry");
		c5.setStatus("active");
		c5.setAccStatus("unlocked");
//		   List l5=new ArrayList();
//		      l5.add("");
//		      l5.add("");
//		c5.setJobs(l5);
//		 
		
		Company c6=new Company();//6th company
		c6.setCompanyName("Cognigant");
		c6.setPassword("cognigant@123");
		c6.setLocation("Hyderabd,gurgaon");
		c6.setContactEmail("cognigant123@gmail.com");
		c6.setContactPhone("070-68859789");
		c6.setDescription("code every snippent");
		c6.setIndustry("IT-industry");
		c6.setStatus("active");
		c6.setAccStatus("unlocked");
//		   List l6=new ArrayList();
//		      l6.add("");
//		      l6.add("");
//		c6.setJobs(l6);
//		 
		
		Company c7=new Company();//7th company
		c7.setCompanyName("Amazon");
		c7.setPassword("amazon@123");
		c7.setLocation("Hyderabad,Chennai");
		c7.setContactEmail("amazon123@gmail.com");
		c7.setContactPhone("060-56438243");
		c7.setDescription("choose every droplets with us");
		c7.setIndustry("Product based");
		c7.setStatus("active");
		c7.setAccStatus("unlocked");
//		   List l7=new ArrayList();
//		      l7.add("");
//		      l7.add("");
//		c7.setJobs(l7);
//		
		Company c8=new Company();//8th company
		c8.setCompanyName("Google");
		c8.setPassword("google@123");
		c8.setLocation("hyderabad,chennai");
		c8.setContactEmail("google123@gmail.com");
		c8.setContactPhone("090-0989876");
		c8.setDescription("biuld up future here");
		c8.setIndustry("IT-industry");
		c8.setStatus("");
		c8.setAccStatus("");
//		   List l8=new ArrayList();
//		      l8.add("active");
//		      l8.add("unlocked");
//		c8.setJobs(l8);
//		 
		Company c9=new Company();//9th company
		c9.setCompanyName("Accenture");
		c9.setPassword("accenture@123");
		c9.setLocation("Hyderabad");
		c9.setContactEmail("accenture123@gmail.com");
		c9.setContactPhone("070-487432");
		c9.setDescription("make every code as life");
		c9.setIndustry("IT-industry");
		c9.setStatus("active");
		c9.setAccStatus("unlocked");
//		   List l9=new ArrayList();
//		      l9.add("");
//		      l9.add("");
//		c9.setJobs(l9);
//		
		Company c10=new Company();//10th company
		c10.setCompanyName("Icici");
		c10.setPassword("icici@123");
		c10.setLocation("Hyderabd,Odisha");
		c10.setContactEmail("icici123@gmail.com");
		c10.setContactPhone("050-7643896");
		c10.setDescription("grow up by investing more");
		c10.setIndustry("bank");
		c10.setStatus("active");
		c10.setAccStatus("unlocked");
//		   List l10=new ArrayList();
//		      l10.add("");
//		      l10.add("");
//		c10.setJobs(l10);
//		 
		cr.saveAll(Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10));
	}

}
