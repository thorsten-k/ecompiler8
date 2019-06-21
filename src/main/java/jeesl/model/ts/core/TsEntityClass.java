package jeesl.model.ts.core;

import java.util.Map;

import org.jeesl.interfaces.model.module.ts.core.JeeslTsEntityClass;

import jeesl.model.locales.IoDescription;
import jeesl.model.locales.IoLang;
import jeesl.model.ts.type.TsCategory;

public class TsEntityClass implements JeeslTsEntityClass<IoLang,IoDescription,TsCategory>
{
	public static final long serialVersionUID=1;
	
	private long id;
	@Override public long getId() {return id;}
	@Override public void setId(long id) {this.id = id;}
	
	@Override public String resolveParentAttribute() {return "category";}
	
	private TsCategory category;
	@Override public TsCategory getCategory() {return category;}
	@Override public void setCategory(TsCategory category) {this.category = category;}
	
	private String code;
	@Override public String getCode() {return code;}
	@Override public void setCode(String code) {this.code = code;}
	
	private Integer position;
	@Override public int getPosition() {return position;}
	@Override public void setPosition(int position) {this.position = position;}
	
	private Boolean visible;
	@Override public boolean isVisible() {return visible;}
	@Override public void setVisible(boolean visible) {this.visible = visible;}

	private String xpath;
	@Override public String getXpath() {return xpath;}
	@Override public void setXpath(String xpath) {this.xpath = xpath;}
	
	private String xpathParent;
	@Override public String getXpathParent() {return xpathParent;}
	@Override public void setXpathParent(String xpathParent) {this.xpathParent = xpathParent;}
	
	private String xpathName;
	@Override public String getXpathName() {return xpathName;}
	@Override public void setXpathName(String xpathName) {this.xpathName = xpathName;}

	private String attribute;
	@Override public String getAttribute() {return attribute;}
	@Override public void setAttribute(String attribute) {this.attribute = attribute;}
	
	private Map<String, IoLang> name;
	@Override public Map<String, IoLang> getName() {return name;}
	@Override public void setName(Map<String, IoLang> name) {this.name = name;}
	
	private Map<String, IoDescription> description;
	@Override public Map<String, IoDescription> getDescription() {return description;}
	@Override public void setDescription(Map<String, IoDescription> description) {this.description = description;}
	
}