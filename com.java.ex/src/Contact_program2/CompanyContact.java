package Contact_program2;

public class CompanyContact extends Contact{
	//필드
	String companyName;
	String teamName;
	String position;
	
	//셍성자
	public CompanyContact() {
	}
	public CompanyContact(String name, String phoneNumber, String emailAddress,
			String group, String address, String birthday,
			String companyName, String teamName, String position) {
		super(name, phoneNumber, emailAddress, group, address, birthday);
		this.companyName= companyName;
		this.teamName= teamName;
		this.position= position;
	}
	
	
	//메소드
	@Override
	public void printCotact(Contact contact) {
		super.printCotact(contact);
		System.out.println("회사이름: "+this.companyName);
		System.out.println("부서이름: "+this.teamName);
		System.out.println("직급: "+this.position);

	}
	public String getCompnayName() {
		return companyName;
	}
	public void setCompnayName(String compnayName) {
		this.companyName = compnayName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}


}
