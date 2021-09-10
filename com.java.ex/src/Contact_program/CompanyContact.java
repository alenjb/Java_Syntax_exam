package Contact_program;

import java.util.Scanner;

public class CompanyContact extends Contact{
	//회사이름, 부서이름, 직급
	//정보출력 오버라이딩
	
	private String companyName;
	private String teamName;
	private String positon;
	
	
	public CompanyContact() {}
	
	public CompanyContact(String name, String phone, String email, String address
			, String birthday, String group, String companyName, String teamName, String positon) {
		super();
		this.companyName = companyName;
		this.teamName = teamName;
		this.positon = positon;
	}
	//재정의된 출력 메소드
	@Override
	public void PrintContact(Contact contact) {
		super.PrintContact(contact);
		//강제 형변환
		CompanyContact companyContact= (CompanyContact)contact;
		System.out.println("회사이름: "+ companyContact.getCompanyName());
		System.out.println("부서이름: "+companyContact.getTeamName());
		System.out.println("직급: "+companyContact.getPositon());
		System.out.println("---------------------------");
	}
	//입력메소드
	@Override
	public Contact ScanFunc(Contact contact) {
		Scanner scanner= new Scanner(System.in);
		super.ScanFunc(contact);
//		Contact contact1=super.ScanFunc(contact);
		//강제 형변환
		CompanyContact companyContact= (CompanyContact)contact;
		System.out.print("회사이름: "); String companyName=scanner.next();
		System.out.print("부서이름: "); String teamName =scanner.next();
		System.out.println("직급: "); String position =scanner.next();
		companyContact.companyName=companyName;
		companyContact.teamName= teamName;
		companyContact.positon=position;
		//		CompanyContact companyContact=
//				new CompanyContact(contact1.getName(), contact1.getPhone(), contact1.getEmail(), contact1.getAddress(),
//				contact1.getBirthday(), contact1.getGroup(), companyName, teamName, position);
		return companyContact;
		
	}
	
	//getter & setter
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getPositon() {
		return positon;
	}
	public void setPositon(String positon) {
		this.positon = positon;
	}
	
}
