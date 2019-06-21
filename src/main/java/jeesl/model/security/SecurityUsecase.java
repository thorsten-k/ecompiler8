package jeesl.model.security;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jeesl.interfaces.model.system.security.framework.JeeslSecurityUsecase;

import jeesl.model.locales.IoDescription;
import jeesl.model.locales.IoLang;
import jeesl.model.user.JeeUser;
import net.sf.ahtutils.interfaces.model.crud.EjbPersistable;
import net.sf.ahtutils.interfaces.model.crud.EjbRemoveable;

public class SecurityUsecase implements Serializable,EjbRemoveable,EjbPersistable,
			JeeslSecurityUsecase<IoLang,IoDescription,SecurityCategory,SecurityRole,SecurityView,SecurityAction>
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
	
	private Map<String,IoLang> name;
	public Map<String,IoLang> getName() {return name;}
	public void setName(Map<String, IoLang> name) {this.name = name;}
	
	private Map<String,IoDescription> description;
	public Map<String,IoDescription> getDescription() {return description;}
	public void setDescription(Map<String,IoDescription> description) {this.description = description;}
	
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