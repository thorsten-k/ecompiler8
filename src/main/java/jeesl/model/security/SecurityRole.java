package jeesl.model.security;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jeesl.interfaces.model.system.security.framework.JeeslSecurityRole;
import org.jeesl.interfaces.model.system.with.code.EjbWithCode;

import jeesl.model.locales.JeeDescription;
import jeesl.model.locales.JeeLang;
import jeesl.model.user.JeeUser;
import net.sf.ahtutils.interfaces.model.crud.EjbPersistable;
import net.sf.ahtutils.interfaces.model.crud.EjbRemoveable;

public class SecurityRole implements EjbWithCode,Serializable,EjbRemoveable,EjbPersistable,
	JeeslSecurityRole<JeeLang,JeeDescription,SecurityCategory,SecurityView,SecurityUsecase,SecurityAction,JeeUser>
{
	public static enum Code {systemAht}
	
	public static final long serialVersionUID=1;
	
	private long id;
	@Override public long getId() {return id;}
	@Override public void setId(long id) {this.id = id;}
	
	private SecurityCategory category;
	@Override public SecurityCategory getCategory() {return category;}
	@Override public void setCategory(SecurityCategory category) {this.category = category;}

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
	
	private List<SecurityView> views;
	@Override public List<SecurityView> getViews() {if(views==null){views = new ArrayList<SecurityView>();}return views;}
	@Override public void setViews(List<SecurityView> views) {this.views = views;}
	
	private List<SecurityAction> actions;
	@Override public List<SecurityAction> getActions() {if(actions==null){actions = new ArrayList<SecurityAction>();}return actions;}
	@Override public void setActions(List<SecurityAction> actions) {this.actions = actions;}
	
	private List<SecurityUsecase> usecases;
	@Override public List<SecurityUsecase> getUsecases() {if(usecases==null){usecases = new ArrayList<SecurityUsecase>();}return usecases;}
	@Override public void setUsecases(List<SecurityUsecase> usecases) {this.usecases = usecases;}
	
	private List<JeeUser> users;
	@Override public List<JeeUser> getUsers() {return users;}
	@Override public void setUsers(List<JeeUser> users) {this.users = users;}
}