package jeesl.model.system.io.fr;

import java.util.Date;
import java.util.Map;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.jeesl.interfaces.model.system.io.fr.JeeslFileMeta;

import jeesl.model.locales.JeeDescription;

public class IoFileMeta implements JeeslFileMeta<JeeDescription,IoFileContainer,IoFileType>
{
	public static final long serialVersionUID=1;
	
	private long id;
	@Override public long getId() {return id;}
	@Override public void setId(long id) {this.id = id;}
	
	private String code;
	@Override public String getCode() {return code;}
	@Override public void setCode(String code) {this.code = code;}

	private int position;
	@Override public int getPosition() {return position;}
	@Override public void setPosition(int position) {this.position = position;}
	
	@Override public String resolveParentAttribute() {return JeeslFileMeta.Attributes.container.toString();}
	private IoFileContainer container;
	@Override public IoFileContainer getContainer() {return container;}
	@Override public void setContainer(IoFileContainer container) {this.container = container;}

	private String fileName;
	@Override public String getFileName() {return fileName;}
	@Override public void setFileName(String fileName) {this.fileName = fileName;}
	
	private Map<String,JeeDescription> description;
	@Override public Map<String,JeeDescription> getDescription() {return description;}
	@Override public void setDescription(Map<String,JeeDescription> description) {this.description = description;}
	
	private Date record;
	@Override public Date getRecord() {return record;}
	@Override public void setRecord(Date record) {this.record = record;}
	
	private long size;
	@Override public long getSize() {return size;}
	@Override public void setSize(long size) {this.size = size;}
	
	private String md5Hash;
	@Override public String getMd5Hash() {return md5Hash;}
	@Override public void setMd5Hash(String md5Hash) {this.md5Hash = md5Hash;}

	private IoFileType type;
	@Override public IoFileType getType() {return type;}
	@Override public void setType(IoFileType type) {this.type = type;}

	private String category;
	@Override public String getCategory() {return category;}
	@Override public void setCategory(String category) {this.category = category;}
	

	@Override public boolean equals(Object object){return (object instanceof IoFileMeta) ? id == ((IoFileMeta) object).getId() : (object == this);}
	@Override public int hashCode() {return new HashCodeBuilder(17,53).append(id).toHashCode();}
}