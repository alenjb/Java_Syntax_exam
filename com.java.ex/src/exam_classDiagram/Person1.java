package exam_classDiagram;

public class Person1 {
	Phone phone;
	int homePhones;
	int officePhones;
	Person1(){
		Phone1 phone1= new Phone1();
		homePhones=	phone1.getHomePhone();
		officePhones= phone1.getOfficePhone();
	}

}
