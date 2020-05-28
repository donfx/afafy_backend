package test.tutorial.test_tutorial;


import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "users")
public class User {
 
    
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private long id;
 

 @Column(name = "datecreated")
 private String datecreated;  

 @Column(name = "datemodified")
 private String datemodified;

 @Column(name = "enabled")
 private String enabled;

 @Column(name = "password")
 private String password;

 @Column(name = "username")
 private String username;

 @Column(name = "user_timeout_id")
 private String user_timeout_id;
 


	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDatecreated() {
		return this.datecreated;
	}

	public void setDatecreated(String datecreated) {
		this.datecreated = datecreated;
	}

	public String getDatemodified() {
		return this.datemodified;
	}

	public void setDatemodified(String datemodified) {
		this.datemodified = datemodified;
	}

	public String getEnabled() {
		return this.enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUser_timeout_id() {
		return this.user_timeout_id;
	}

	public void setUser_timeout_id(String user_timeout_id) {
		this.user_timeout_id = user_timeout_id;
	}
	 

}