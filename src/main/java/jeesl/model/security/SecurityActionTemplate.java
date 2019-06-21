package jeesl.model.security;


import java.io.Serializable;
import java.util.Map;

import org.jeesl.interfaces.model.system.security.framework.JeeslSecurityTemplate;

import jeesl.model.locales.IoDescription;
import jeesl.model.locales.IoLang;
import net.sf.ahtutils.interfaces.model.crud.EjbPersistable;
import net.sf.ahtutils.interfaces.model.crud.EjbRemoveable;

public class SecurityActionTemplate implements Serializable,EjbRemoveable,EjbPersistable,
	JeeslSecurityTemplate<IoLang,IoDescription,SecurityCategory>
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
	
	private Map<String,IoLang> name;
	@Override public Map<String,IoLang> getName() {return name;}
	@Override public void setName(Map<String,IoLang> name) {this.name = name;}
	
	private Map<String,IoDescription> description;
	@Override public Map<String,IoDescription> getDescription() {return description;}
	@Override public void setDescription(Map<String,IoDescription> description) {this.description = description;}
	
}