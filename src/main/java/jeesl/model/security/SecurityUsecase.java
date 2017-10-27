package jeesl.model.security;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jeesl.interfaces.model.system.security.framework.JeeslSecurityUsecase;

import jeesl.model.locales.JeeDescription;
import jeesl.model.locales.JeeLang;
import jeesl.model.user.JeeUser;
import net.sf.ahtutils.interfaces.model.crud.EjbPersistable;
import net.sf.ahtutils.interfaces.model.crud.EjbRemoveable;

public class SecurityUsecase implements Serializable,EjbRemoveable,EjbPersistable,
			JeeslSecurityUsecase<JeeLang,JeeDescription,SecurityCategory,SecurityRole,SecurityView,SecurityUsecase,SecurityAction,SecurityActionTemplate,JeeUser>
{
	public static final long serialVersionUID=1;
	
	public static enum Code {test}

	private long id;
	public long getId() {return id;}
	public void setId(long id) {this.id = id;}
	
	private SecurityCategory category;
	public SecurityCategory getCategory() {return category;}
	public void setCategory(SecurityCategory category) {this.category = category;}
	
	private String code;
	public String getCode() {return code;}
	public void setCode(String code) {this.code = code;}
	
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
	public Map<String,JeeLang> getName() {return name;}
	public void setName(Map<String, JeeLang> name) {this.name = name;}
	
	private Map<String,JeeDescription> description;
	public Map<String,JeeDescription> getDescription() {return description;}
	public void setDescription(Map<String,JeeDescription> description) {this.description = description;}
	
	private List<SecurityAction> actions;
	public List<SecurityAction> getActions() {if(actions==null){actions = new ArrayList<SecurityAction>();}return actions;}
	public void setActions(List<SecurityAction> actions) {this.actions = actions;}
	
	private List<SecurityView> views;
	public List<SecurityView> getViews() {if(views==null){views = new ArrayList<SecurityView>();}return views;}
	public void setViews(List<SecurityView> views) {this.views = views;}
	
	private List<SecurityRole> roles;
	@Override public List<SecurityRole> getRoles() {if(roles==null){roles = new ArrayList<SecurityRole>();}return roles;}
	@Override public void setRoles(List<SecurityRole> roles) {this.roles = roles;}

}