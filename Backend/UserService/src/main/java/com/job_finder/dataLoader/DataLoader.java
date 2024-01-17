 package com.job_finder.dataLoader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.job_finder.entity.UserDtls;
import com.job_finder.repository.UserRepository;
@Component
public class DataLoader implements ApplicationRunner{

	@Autowired
	private UserRepository ur;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		UserDtls  u1 = new UserDtls();  //1st user object
		u1.setFullName("ChotaBheem");
		u1.setEmailId("chotabheem123@gmail.com");
		u1.setMobileNumber("91+9876543210");
		u1.setPassword("chota@123");
		u1.setDescription("Java Developer");
		u1.setWorkStatus("FRESHER");
		u1.setAccStatus("UNLOCK");
		u1.setEmployed(false);
		u1.setExperienceYears("NULL");
		u1.setExperienceMonths("NULL");
		u1.setPrevCompany("-");
		u1.setPrevJob("-");
		u1.setCity("Dholakpur");
		u1.setAnnualSalary("2-2.5LPA");
		  List l1=new ArrayList<>();
		    l1.add("");
		    l1.add("");
		u1.setQualification(l1);
		u1.setCourse("MCA");
		u1.setSpecialize("computers");
		u1.setUni("Osmania university");
		  List l2=new ArrayList<>();
		   l2.add("");
		   l2.add("");
		u1.setCourseType(l2);
		u1.setPassYear("2023");
		
		UserDtls  u2 = new UserDtls();  //2nd user object
		u2.setFullName("Chutki");
		u2.setEmailId("chutki123@gmail.com");
		u2.setMobileNumber("91+9867452113");
		u2.setPassword("chutki123");
		u2.setDescription("HTML,CSS,JS");
		u2.setWorkStatus("UI developer");
		u2.setAccStatus("UNLOCK");
		u2.setEmployed(false);
		u2.setExperienceYears("NULL");
		u2.setExperienceMonths("NULL");
		u2.setPrevCompany("-");
		u2.setPrevJob("-");
		u2.setCity("Hastinapur");
		u2.setAnnualSalary("1-1.5LPA");
		  List l3=new ArrayList<>();
		    l3.add("");
		    l3.add("");
		u2.setQualification(l1);
		u2.setCourse("B.tech");
		u2.setSpecialize("CSE");
		u2.setUni("Delhi university");
		  List l4=new ArrayList<>();
		   l4.add("");
		   l4.add("");
		u2.setCourseType(l2);
		u2.setPassYear("2023");
		
		UserDtls  u3 = new UserDtls();  //3rd user object
		u3.setFullName("Raju");
		u3.setEmailId("rajumighty123@gmail.com");
		u3.setMobileNumber("91+9867455123");
		u3.setPassword("raju123");
		u3.setDescription("SQL");
		u3.setWorkStatus("Backend developer");
		u3.setAccStatus("UNLOCK");
		u3.setEmployed(false);
		u3.setExperienceYears("");
		u3.setExperienceMonths("");
		u3.setPrevCompany("");
		u3.setPrevJob("");
		u3.setCity("Aryanagar");
		u3.setAnnualSalary("");
		  List l5=new ArrayList<>();
		    l5.add("");
		    l5.add("");
		u3.setQualification(l1);
		u3.setCourse("B.tech");
		u3.setSpecialize("Mechanical");
		u3.setUni("Aryanagar university");
		  List l6=new ArrayList<>();
		   l6.add("");
		   l6.add("");
		u3.setCourseType(l2);
		u3.setPassYear("2023");
		
		
		UserDtls  u4 = new UserDtls();  //4th user object
		u4.setFullName("Jaggu");
		u4.setEmailId("jaggumunna123@gmail.com");
		u4.setMobileNumber("91+8967452310");
		u4.setPassword("jaggu123");
		u4.setDescription("React JS");
		u4.setWorkStatus("UI developer");
		u4.setAccStatus("UNLOCK");
		u4.setEmployed(false);
		u4.setExperienceYears("-");
		u4.setExperienceMonths("-");
		u4.setPrevCompany("-");
		u4.setPrevJob("-");
		u4.setCity("Dholakpur");
		u4.setAnnualSalary("3.5-4LPA");
		  List l7=new ArrayList<>();
		    l7.add("");
		    l7.add("");
		u4.setQualification(l1);
		u4.setCourse("BCA");
		u4.setSpecialize("computers");
		u4.setUni("Kakatiya university");
		  List l8=new ArrayList<>();
		   l8.add("");
		   l8.add("");
		u4.setCourseType(l2);
		u4.setPassYear("2023");
		
		UserDtls  u5 = new UserDtls();  //5th user object
		u5.setFullName("kalia");
		u5.setEmailId("kalia123@gmail.com");
		u5.setMobileNumber("91+7894561230");
		u5.setPassword("kalia123");
		u5.setDescription("Oracle");
		u5.setWorkStatus("Backend");
		u5.setAccStatus("ULOCK");
		u5.setEmployed(false);
		u5.setExperienceYears("-");
		u5.setExperienceMonths("-");
		u5.setPrevCompany("-");
		u5.setPrevJob("-");
		u5.setCity("Dholakpur");
		u5.setAnnualSalary("1.5-2LPA");
		  List l9=new ArrayList<>();
		    l9.add("");
		    l9.add("");
		u5.setQualification(l1);
		u5.setCourse("BCA");
		u5.setSpecialize("computers");
		u5.setUni("Amrit university");
		  List l10=new ArrayList<>();
		   l10.add("");
		   l10.add("");
		u5.setCourseType(l2);
		u5.setPassYear("2023");
		
		UserDtls  u6 = new UserDtls();  //6th user object
		u6.setFullName("Dholu");
		u6.setEmailId("dholusingh123@gmail.com");
		u6.setMobileNumber("91+9874561230");
		u6.setPassword("dholu123");
		u6.setDescription("HTML,CSS");
		u6.setWorkStatus("UI");
		u6.setAccStatus("UNLOCK");
		u6.setEmployed(false);
		u6.setExperienceYears("-");
		u6.setExperienceMonths("-");
		u6.setPrevCompany("-");
		u6.setPrevJob("-");
		u6.setCity("Dholakpur");
		u6.setAnnualSalary("Dholakpur");
		  List l11=new ArrayList<>();
		    l11.add("");
		    l11.add("");
		u6.setQualification(l1);
		u6.setCourse("BCA");
		u6.setSpecialize("computers");
		u6.setUni("Amrit university");
		  List l12=new ArrayList<>();
		   l12.add("");
		   l12.add("");
		u6.setCourseType(l2);
		u6.setPassYear("2023");
		
		
		UserDtls  u7 = new UserDtls();  //7th user object
		u7.setFullName("Indumati");
		u7.setEmailId("indumati123@gmail.com");
		u7.setMobileNumber("91+9845671230");
		u7.setPassword("indumati123");
		u7.setDescription("SQL,Mysql");
		u7.setWorkStatus("beckend");
		u7.setAccStatus("UNLOCK");
		u7.setEmployed(false);
		u7.setExperienceYears("-");
		u7.setExperienceMonths("-");
		u7.setPrevCompany("-");
		u7.setPrevJob("-");
		u7.setCity("Jagatsinghpur");
		u7.setAnnualSalary("3.5-5LPA");
		  List l13=new ArrayList<>();
		    l13.add("");
		    l13.add("");
		u7.setQualification(l1);
		u7.setCourse("B.tech");
		u7.setSpecialize("CSE");
		u7.setUni("Biju pattnaik university");
		  List l14=new ArrayList<>();
		   l14.add("");
		   l14.add("");
		u7.setCourseType(l2);
		u7.setPassYear("2022");
		
		UserDtls  u8 = new UserDtls();  //8th user object
		u8.setFullName("Indraverma");
		u8.setEmailId("indraverma123@gmail.com");
		u8.setMobileNumber("91+7890123456");
		u8.setPassword("indraverma");
		u8.setDescription("Java Developer");
		u8.setWorkStatus("UI,Sql,Spring");
		u8.setAccStatus("UNLOCK");
		u8.setEmployed(false);
		u8.setExperienceYears("-");
		u8.setExperienceMonths("-");
		u8.setPrevCompany("-");
		u8.setPrevJob("-");
		u8.setCity("Jagatsinghpur");
		u8.setAnnualSalary("7.3-8LPA");
		  List l15=new ArrayList<>();
		    l15.add("");
		    l15.add("");
		u8.setQualification(l1);
		u8.setCourse("M.tech");
		u8.setSpecialize("computers");
		u8.setUni("Bijupattnaik university");
		  List l16=new ArrayList<>();
		   l16.add("");
		   l16.add("");
		u8.setCourseType(l2);
		u8.setPassYear("2021");
		
		UserDtls  u9 = new UserDtls();  //9th user object
		u9.setFullName("Tuntun Mausi");
		u9.setEmailId("tuntunmausi123@gmail.com");
		u9.setMobileNumber("91+9087065011");
		u9.setPassword("tuntun123");
		u9.setDescription("Sql,HTML,CSS,JAVA");
		u9.setWorkStatus("Java Developer");
		u9.setAccStatus("UNLOCK");
		u9.setEmployed(false);
		u9.setExperienceYears("-");
		u9.setExperienceMonths("-");
		u9.setPrevCompany("-");
		u9.setPrevJob("-");
		u9.setCity("Hastinapur");
		u9.setAnnualSalary("4.5-5LPA");
		  List l17=new ArrayList<>();
		    l17.add("");
		    l17.add("");
		u9.setQualification(l1);
		u9.setCourse("BBA");
		u9.setSpecialize("computers");
		u9.setUni("Delhi university");
		  List l18=new ArrayList<>();
		   l18.add("");
		   l18.add("");
		u9.setCourseType(l2);
		u9.setPassYear("2014");
		
		UserDtls  u10 = new UserDtls();  //10th user object
		u10.setFullName("Daku Mangal Singh");
		u10.setEmailId("dakumangalsingh123@gmail.com");
		u10.setMobileNumber("91+8974560312");
		u10.setPassword("dakusingh123");
		u10.setDescription("UI,Sql,Java");
		u10.setWorkStatus("java developer");
		u10.setAccStatus("UNLOCK");
		u10.setEmployed(false);
		u10.setExperienceYears("-");
		u10.setExperienceMonths("-");
		u10.setPrevCompany("-");
		u10.setPrevJob("-");
		u10.setCity("Cambal");
		u10.setAnnualSalary("91+9876123450");
		  List l19=new ArrayList<>();
		    l19.add("");
		    l19.add("");
		u10.setQualification(l1);
		u10.setCourse("M.tech");
		u10.setSpecialize("computers");
		u10.setUni("Cmbal university");
		  List l20=new ArrayList<>();
		   l20.add("");
		   l20.add("");
		u10.setCourseType(l2);
		u10.setPassYear("2020");
		   List<UserDtls>list=Arrays.asList(u1,u2,u3,u4,u5,u6,u7,u8,u9,u10);
		   
		ur.saveAll(list);		
	}

}
