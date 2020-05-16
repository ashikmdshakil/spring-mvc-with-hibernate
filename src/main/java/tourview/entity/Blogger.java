package tourview.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Blogger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String fullName;
	private String nickName;
	private String emailAdress;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getEmailAdress() {
		return emailAdress;
	}
	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}
	@Override
	public String toString() {
		return "Blogger [Id=" + Id + ", fullName=" + fullName + ", nickName=" + nickName + ", emailAdress="
				+ emailAdress + "]";
	}
	
	
}
