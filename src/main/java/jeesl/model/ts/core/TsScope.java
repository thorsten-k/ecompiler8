package jeesl.model.ts.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jeesl.interfaces.model.module.ts.core.JeeslTsScope;

import jeesl.model.locales.JeeDescription;
import jeesl.model.locales.JeeLang;
import jeesl.model.ts.type.TsCategory;
import jeesl.model.ts.type.TsInterval;
import jeesl.model.ts.type.TsScopeType;
import jeesl.model.ts.type.TsUnit;

public class TsScope implements JeeslTsScope<JeeLang,JeeDescription,TsCategory,TsScopeType,TsUnit,TsEntityClass,TsInterval>
{
	public static final long serialVersionUID=1;
	public static enum Code{rf,airTemp,
		waterLevel,waterDischarge}
	
	private long id;
	@Override public long getId() {return id;}
	@Override public void setId(long id) {this.id = id;}
	
	@Override public String resolveParentAttribute() {return "category";}
	
	private TsCategory category;
	public TsCategory getCategory() {return category;}
	public void setCategory(TsCategory category) {this.category = category;}
	
	private String code;
	@Override public String getCode() {return code;}
	@Override public void setCode(String code) {this.code = code;}
	
	private TsUnit unit;
	@Override public TsUnit getUnit() {return unit;}
	@Override public void setUnit(TsUnit unit) {this.unit = unit;}
	
	private TsScopeType type;
	@Override public TsScopeType getType() {return type;}
	@Override public void setType(TsScopeType type) {this.type = type;}
	
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
	
	private List<TsInterval> intervals;
	public List<TsInterval> getIntervals() {if(intervals==null){intervals = new ArrayList<TsInterval>();}return intervals;}
	public void setIntervals(List<TsInterval> intervals) {this.intervals = intervals;}
	
	private List<TsEntityClass> classes;
	public List<TsEntityClass> getClasses() {if(classes==null){classes = new ArrayList<TsEntityClass>();}return classes;}
	public void setClasses(List<TsEntityClass> classes) {this.classes = classes;}
}