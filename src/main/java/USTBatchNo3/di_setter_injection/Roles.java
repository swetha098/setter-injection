package USTBatchNo3.di_setter_injection;

public class Roles {
	public String char_name;
	public String responsibility;
	
	public void setChar_name(String char_name) {
		this.char_name = char_name;
	}
	
	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}
	@Override
	public String toString() {
		return "roles [char_name=" + char_name + ", responsibility=" + responsibility + "]";
	}
	public void display() {
		System.out.println("my name is :"+ char_name +" "+"My role is : "+responsibility);
	}
}
