package jeesl.model.ts.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jeesl.interfaces.model.module.ts.JeeslTsScope;

import jeesl.model.locales.JeeDescription;
import jeesl.model.locales.JeeLang;
import jeesl.model.ts.type.JeeTsCategory;
import jeesl.model.ts.type.JeeTsInterval;
import jeesl.model.ts.type.JeeTsUnit;

public class JeeTsScope implements JeeslTsScope<JeeLang,JeeDescription,JeeTsCategory,JeeTsUnit,JeeTsEntityClass,JeeTsInterval>
{
	public static final long serialVersionUID=1;
	public static enum Code{rf,airTemp,
		waterLevel,waterDischarge}
	
	private long id;
	@Override public long getId() {return id;}
	@Override public void setId(long id) {this.id = id;}
	
	@Override public String resolveParentAttribute() {return "category";}
	
	private JeeTsCategory category;
	public JeeTsCategory getCategory() {return category;}
	public void setCategory(JeeTsCategory category) {this.category = category;}
	
	private String code;
	@Override public String getCode() {return code;}
	@Override public void setCode(String code) {this.code = code;}
	
	private JeeTsUnit unit;
	@Override public JeeTsUnit getUnit() {return unit;}
	@Override public void setUnit(JeeTsUnit unit) {this.unit = unit;}
	
	private int position;
	@Override public int getPosition() {return position;}
	@Override public void setPosition(int position) {this.position = position;}
	
	private boolean visible;
	@Override public boolean isVisible() {return visible;}
	@Override public void setVisible(boolean visible) {this.visible = visible;}
	
	private Map<String, JeeLang> name;
	public Map<String, JeeLang> getName() {return name;}
	public void setName(Map<String, JeeLang> name) {this.name = name;}
	
	private Map<String, JeeDescription> description;
	public Map<String, JeeDescription> getDescription() {return description;}
	public void setDescription(Map<String, JeeDescription> description) {this.description = description;}
	
	private List<JeeTsInterval> intervals;
	public List<JeeTsInterval> getIntervals() {if(intervals==null){intervals = new ArrayList<JeeTsInterval>();}return intervals;}
	public void setIntervals(List<JeeTsInterval> intervals) {this.intervals = intervals;}
	
	private List<JeeTsEntityClass> classes;
	public List<JeeTsEntityClass> getClasses() {if(classes==null){classes = new ArrayList<JeeTsEntityClass>();}return classes;}
	public void setClasses(List<JeeTsEntityClass> classes) {this.classes = classes;}
}