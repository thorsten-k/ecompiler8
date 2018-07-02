package jeesl.model.ts.core;

import java.io.Serializable;

import org.jeesl.interfaces.model.module.ts.JeeslTsBridge;

import net.sf.ahtutils.interfaces.model.crud.EjbPersistable;
import net.sf.ahtutils.interfaces.model.crud.EjbRemoveable;
import net.sf.ahtutils.interfaces.model.with.parent.EjbWithParentAttributeResolver;

public class TsBridge implements Serializable,EjbRemoveable,EjbPersistable,
							EjbWithParentAttributeResolver,
							JeeslTsBridge<TsEntityClass>
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