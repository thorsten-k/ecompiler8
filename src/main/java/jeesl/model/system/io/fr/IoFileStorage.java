package jeesl.model.system.io.fr;

import java.util.Map;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.jeesl.interfaces.model.system.io.fr.JeeslFileStorage;

import jeesl.model.locales.JeeDescription;
import jeesl.model.locales.JeeLang;

public class IoFileStorage implements JeeslFileStorage<JeeLang,JeeDescription,IoFileStorageEngine>
{
	public static final long serialVersionUID=1;
	
	public enum Code{tmp,cms,hb}
	
	private long id;
	@Override public long getId() {return id;}
	@Override public void setId(long id) {this.id = id;}
	
	private String code;
	@Override public String getCode() {return code;}
	@Override public void setCode(String code) {this.code = code;}
	
	private int position;
	@Override public int getPosition() {return position;}
	@Override public void setPosition(int position) {this.position = position;}

	private IoFileStorageEngine engine;
	@Override public IoFileStorageEngine getEngine() {return engine;}
	@Override public void setEngine(IoFileStorageEngine engine) {this.engine = engine;}

	private Map<String,JeeLang> name;
	@Override public Map<String,JeeLang> getName() {return name;}
	@Override public void setName(Map<String,JeeLang> name) {this.name = name;}
	
	private Map<String,JeeDescription> description;
	@Override public Map<String,JeeDescription> getDescription() {return description;}
	@Override public void setDescription(Map<String,JeeDescription> description) {this.description = description;}
	
	private String json;
	@Override public String getJson() {return json;}
	@Override public void setJson(String json) {this.json = json;}
	
	private Long fileSizeLimit;
	@Override public Long getFileSizeLimit() {return fileSizeLimit;}
	@Override public void setFileSizeLimit(Long fileSizeLimit) {this.fileSizeLimit = fileSizeLimit;}
	
	private Boolean keepRemoved;
	@Override public Boolean getKeepRemoved() {return keepRemoved;}
	@Override public void setKeepRemoved(Boolean keepRemoved) {this.keepRemoved = keepRemoved;}
	
	@Override public boolean equals(Object object){return (object instanceof IoFileStorage) ? id == ((IoFileStorage) object).getId() : (object == this);}
	@Override public int hashCode() {return new HashCodeBuilder(17,53).append(id).toHashCode();}
}