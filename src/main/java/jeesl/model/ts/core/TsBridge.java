package jeesl.model.ts.core;

import org.jeesl.interfaces.model.module.ts.data.JeeslTsBridge;

public class TsBridge implements JeeslTsBridge<TsEntityClass>
{
	public static final long serialVersionUID=1;
	public enum Attributes {entityClass}
	
	private long id;
	@Override public long getId() {return id;}
	@Override public void setId(long id) {this.id = id;}
	
	private long refId;
	public long getRefId() {return refId;}
	public void setRefId(long refId) {this.refId = refId;}

	@Override public String resolveParentAttribute() {return Attributes.entityClass.toString();}
	private TsEntityClass entityClass;
	@Override public TsEntityClass getEntityClass() {return entityClass;}
	@Override public void setEntityClass(TsEntityClass entityClass) {this.entityClass = entityClass;}
}