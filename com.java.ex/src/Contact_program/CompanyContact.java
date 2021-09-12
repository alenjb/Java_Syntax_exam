package Contact_program;


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
		
		//		//강제 형변환
		
		CompanyContact companyContact= (CompanyContact)contact;
		System.out.println("회사이름: "+ companyContact.getCompanyName());
		System.out.println("부서이름: "+companyContact.getTeamName());
		System.out.println("직급: "+companyContact.getPositon());
		System.out.println("---------------------------");
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
