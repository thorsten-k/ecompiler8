package jeesl.model.security;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jeesl.interfaces.model.system.security.framework.JeeslSecurityView;

import jeesl.model.locales.IoDescription;
import jeesl.model.locales.IoLang;
import jeesl.model.user.JeeUser;
import net.sf.ahtutils.interfaces.model.crud.EjbPersistable;
import net.sf.ahtutils.interfaces.model.crud.EjbRemoveable;

public class SecurityView implements Serializable,EjbRemoveable,EjbPersistable,
						JeeslSecurityView<IoLang,IoDescription,SecurityCategory,SecurityRole,SecurityUsecase,SecurityAction>
{
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

	private Boolean redirect;
	@Override public Boolean getRedirect() {return redirect;}
	@Override public void setRedirect(Boolean redirect) {this.redirect = redirect;}

	private int position;
	@Override public int getPosition() {return position;}
	@Override public void setPosition(int position) {this.position = position;}
	
	private Map<String, IoLang> name;
	@Override public Map<String, IoLang> getName() {return name;}
	@Override public void setName(Map<String, IoLang> name) {this.name = name;}
	
	private Map<String,IoDescription> description;
	@Override public Map<String,IoDescription> getDescription() {return description;}
	@Override public void setDescription(Map<String,IoDescription> description) {this.description = description;}
	
	private List<SecurityAction> actions;
	@Override public List<SecurityAction> getActions() {if(actions==null){actions=new ArrayList<SecurityAction>();}return actions;}
	@Override public void setActions(List<SecurityAction> actions) {this.actions = actions;}
	
	private List<SecurityRole> roles;
	@Override public List<SecurityRole> getRoles() {if(roles==null){roles = new ArrayList<SecurityRole>();}return roles;}
	@Override public void setRoles(List<SecurityRole> roles) {this.roles = roles;}
	
	private List<SecurityUsecase> usecases;
	@Override public List<SecurityUsecase> getUsecases() {if(usecases==null){usecases = new ArrayList<SecurityUsecase>();}return usecases;}
	@Override public void setUsecases(List<SecurityUsecase> usecases) {this.usecases = usecases;}
		
	private Boolean accessPublic;
	@Override public Boolean getAccessPublic() {return accessPublic;}
	@Override public void setAccessPublic(Boolean accessPublic) {this.accessPublic = accessPublic;}
	
	private Boolean accessLogin;
	@Override public Boolean getAccessLogin() {return accessLogin;}
	@Override public void setAccessLogin(Boolean accessLogin) {this.accessLogin = accessLogin;}
	
	private String packageName;
	@Override public String getPackageName() {return packageName;}
	@Override public void setPackageName(String packageName) {this.packageName = packageName;}
	
	private String viewPattern;
	@Override public String getViewPattern() {return viewPattern;}
	@Override public void setViewPattern(String viewPattern) {this.viewPattern = viewPattern;}
	
	private String urlMapping;
	@Override public String getUrlMapping() {return urlMapping;}
	@Override public void setUrlMapping(String urlMapping) {this.urlMapping = urlMapping;}
	
	private String urlBase;
	@Override public String getUrlBase() {return urlBase;}
	@Override public void setUrlBase(String urlBase) {this.urlBase = urlBase;}
}