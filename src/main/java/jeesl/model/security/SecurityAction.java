package jeesl.model.security;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jeesl.interfaces.model.system.security.framework.JeeslSecurityAction;

import jeesl.model.locales.JeeDescription;
import jeesl.model.locales.JeeLang;
import jeesl.model.user.JeeUser;
import net.sf.ahtutils.interfaces.model.crud.EjbPersistable;
import net.sf.ahtutils.interfaces.model.crud.EjbRemoveable;

public class SecurityAction implements Serializable,EjbRemoveable,EjbPersistable,
	JeeslSecurityAction<JeeLang,JeeDescription,SecurityRole,SecurityView,SecurityUsecase,SecurityActionTemplate>
{
	public static final long serialVersionUID=1;

	public static enum Code {login}

	private long id;
	@Override public long getId() {return id;}
	@Override public void setId(long id) {this.id = id;}
	
	private SecurityView view;
	@Override public SecurityView getView() {return view;}
	@Override public void setView(SecurityView view) {this.view = view;}
	
	private SecurityActionTemplate template;
	public SecurityActionTemplate getTemplate() {return template;}
	public void setTemplate(SecurityActionTemplate template) {this.template = template;}
	
	private String code;
	@Override public String getCode() {return code;}
	@Override public void setCode(String code) {this.code = code;}
	
	@Override public String resolveParentAttribute() {return "category";}
	
	private boolean visible;
	@Override public boolean isVisible() {return visible;}
	@Override public void setVisible(boolean visible) {this.visible = visible;}
	
	private Boolean documentation;
	@Override public Boolean getDocumentation() {return documentation;}
	@Override public void setDocumentation(Boolean documentation) {this.documentation = documentation;}

	private int position;
	@Override public int getPosition() {return position;}
	@Override public void setPosition(int position) {this.position = position;}
	
	private Map<String,JeeLang> name;
	@Override public Map<String,JeeLang> getName() {return name;}
	@Override public void setName(Map<String,JeeLang> name) {this.name = name;}
	
	private Map<String,JeeDescription> description;
	@Override public Map<String,JeeDescription> getDescription() {return description;}
	@Override public void setDescription(Map<String,JeeDescription> description) {this.description = description;}
	
	private List<SecurityRole> roles;
	@Override public List<SecurityRole> getRoles() {if(roles==null){roles = new ArrayList<SecurityRole>();}return roles;}
	@Override public void setRoles(List<SecurityRole> roles) {this.roles = roles;}
	
	private List<SecurityUsecase> usecases;
	@Override public List<SecurityUsecase> getUsecases() {if(usecases==null){usecases = new ArrayList<SecurityUsecase>();}return usecases;}
	@Override public void setUsecases(List<SecurityUsecase> usecases) {this.usecases = usecases;}
	@Override
	public String toCode() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Map<String, JeeLang> toName() {
		// TODO Auto-generated method stub
		return null;
	}
	
}