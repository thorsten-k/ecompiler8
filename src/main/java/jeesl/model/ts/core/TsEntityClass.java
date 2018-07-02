package jeesl.model.ts.core;

import java.io.Serializable;
import java.util.Map;

import org.jeesl.interfaces.model.module.ts.JeeslTsEntityClass;

import jeesl.model.locales.JeeDescription;
import jeesl.model.locales.JeeLang;
import jeesl.model.ts.type.TsCategory;
import net.sf.ahtutils.interfaces.model.crud.EjbPersistable;

public class TsEntityClass implements Serializable,EjbPersistable,
								JeeslTsEntityClass<JeeLang,JeeDescription,TsCategory>
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
	
	private String attribute;
	@Override public String getAttribute() {return attribute;}
	@Override public void setAttribute(String attribute) {this.attribute = attribute;}
	
	private Map<String, JeeLang> name;
	@Override public Map<String, JeeLang> getName() {return name;}
	@Override public void setName(Map<String, JeeLang> name) {this.name = name;}
	
	private Map<String, JeeDescription> description;
	@Override public Map<String, JeeDescription> getDescription() {return description;}
	@Override public void setDescription(Map<String, JeeDescription> description) {this.description = description;}
}