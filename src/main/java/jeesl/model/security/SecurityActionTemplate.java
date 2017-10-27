package jeesl.model.security;


import java.io.Serializable;
import java.util.Map;

import org.jeesl.interfaces.model.system.security.framework.JeeslSecurityTemplate;

import jeesl.model.locales.JeeDescription;
import jeesl.model.locales.JeeLang;
import jeesl.model.user.JeeUser;
import net.sf.ahtutils.interfaces.model.crud.EjbPersistable;
import net.sf.ahtutils.interfaces.model.crud.EjbRemoveable;

public class SecurityActionTemplate implements Serializable,EjbRemoveable,EjbPersistable,
	JeeslSecurityTemplate<JeeLang,JeeDescription,SecurityCategory,SecurityRole,SecurityView,SecurityUsecase,SecurityAction,SecurityActionTemplate,JeeUser>
{
	public static final long serialVersionUID=1;
	
	private long id;
	public long getId() {return id;}
	public void setId(long id) {this.id = id;}
	
	@Override public String resolveParentAttribute() {return "category";}
	private SecurityCategory category;
	public SecurityCategory getCategory() {return category;}
	public void setCategory(SecurityCategory category) {this.category = category;}
	
	private String code;
	public String getCode() {return code;}
	public void setCode(String code) {this.code = code;}
	
	private boolean visible;
	@Override public boolean isVisible() {return visible;}
	@Override public void setVisible(boolean visible) {this.visible = visible;}
	
	private int position;
	@Override public int getPosition() {return position;}
	@Override public void setPosition(int position) {this.position = position;}
	
	private boolean documentation;
	@Override public boolean getDocumentation() {return documentation;}
	@Override public void setDocumentation(boolean documentation) {this.documentation = documentation;}
	
	private Map<String,JeeLang> name;
	@Override public Map<String,JeeLang> getName() {return name;}
	@Override public void setName(Map<String,JeeLang> name) {this.name = name;}
	
	private Map<String,JeeDescription> description;
	@Override public Map<String,JeeDescription> getDescription() {return description;}
	@Override public void setDescription(Map<String,JeeDescription> description) {this.description = description;}
	
}