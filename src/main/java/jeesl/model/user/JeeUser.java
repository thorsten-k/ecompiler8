package jeesl.model.user;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.jeesl.interfaces.model.system.security.user.JeeslUser;

import jeesl.model.security.SecurityRole;
import net.sf.ahtutils.interfaces.model.crud.EjbPersistable;
import net.sf.ahtutils.interfaces.model.with.EjbWithEmail;
import net.sf.ahtutils.model.interfaces.with.EjbWithId;

public class JeeUser implements Serializable,EjbWithId,EjbPersistable,
								EjbWithEmail,
								JeeslUser<SecurityRole>
{
	public static final long serialVersionUID=1;

	private long id;
	@Override public long getId() {return id;}
	@Override public void setId(long id) {this.id = id;}

	protected String email;
	@Override public String getEmail() {return email;}
	@Override public void setEmail(String email) {this.email = email;}
	
	protected String password;
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	
	protected String firstName;
	public String getFirstName() {return firstName;}
	public void setFirstName(String firstName) {this.firstName = firstName;}
	
	protected String lastName;
	public String getLastName() {return lastName;}
	public void setLastName(String lastName) {this.lastName = lastName;}
	
	private Boolean permitLogin;
	public Boolean getPermitLogin() {return permitLogin;}
	public void setPermitLogin(Boolean permitLogin) {this.permitLogin = permitLogin;}
	
	private List<SecurityRole> roles;
	public List<SecurityRole> getRoles() {if(roles==null){roles = new ArrayList<SecurityRole>();};return roles;}
	public void setRoles(List<SecurityRole> roles) {this.roles = roles;}
}