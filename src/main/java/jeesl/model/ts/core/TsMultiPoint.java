package jeesl.model.ts.core;

import java.util.Map;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.jeesl.interfaces.model.module.ts.core.JeeslTsMultiPoint;

import jeesl.model.locales.JeeDescription;
import jeesl.model.locales.JeeLang;
import jeesl.model.ts.type.TsUnit;

public class TsMultiPoint implements JeeslTsMultiPoint<JeeLang,JeeDescription,TsScope,TsUnit>
{
	public static final long serialVersionUID=1;
	public static enum Code{pageImpressions}
	
	private long id;
	@Override public long getId() {return id;}
	@Override public void setId(long id) {this.id = id;}
	
	@Override public String resolveParentAttribute() {return "category";}
		
	private String code;
	@Override public String getCode() {return code;}
	@Override public void setCode(String code) {this.code = code;}
	
	private int position;
	@Override public int getPosition() {return position;}
	@Override public void setPosition(int position) {this.position = position;}
	
	private TsScope scope;
	@Override public TsScope getScope() {return scope;}
	@Override public void setScope(TsScope scope) {this.scope = scope;}
	
	private Boolean visible;
	@Override public Boolean getVisible() {return visible;}
	@Override public void setVisible(Boolean visible) {this.visible = visible;}
	
	private Map<String, JeeLang> name;
	@Override public Map<String, JeeLang> getName() {return name;}
	@Override public void setName(Map<String,JeeLang> name) {this.name = name;}
	
	private Map<String,JeeDescription> description;
	@Override public Map<String,JeeDescription> getDescription() {return description;}
	@Override public void setDescription(Map<String,JeeDescription> description) {this.description = description;}
	
	private TsUnit unit;
	@Override public TsUnit getUnit() {return unit;}
	@Override public void setUnit(TsUnit unit) {this.unit = unit;}
	
	@Override public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("[").append(id).append("]");
		return sb.toString();
	}
	
	@Override public boolean equals(Object object) {return (object instanceof TsMultiPoint) ? id == ((TsMultiPoint) object).getId() : (object == this);}
	@Override public int hashCode() {return new HashCodeBuilder(23,13).append(id).toHashCode();}
	

	
}