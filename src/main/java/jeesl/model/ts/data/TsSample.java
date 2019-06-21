package jeesl.model.ts.data;

import java.io.Serializable;
import java.util.Date;

import org.jeesl.interfaces.model.module.ts.data.JeeslTsSample;

import net.sf.ahtutils.interfaces.model.crud.EjbPersistable;
import net.sf.ahtutils.interfaces.model.crud.EjbRemoveable;

public class TsSample implements Serializable,EjbRemoveable,EjbPersistable,
								JeeslTsSample
{
	public static final long serialVersionUID=1;
	
	private long id;
	@Override public long getId() {return id;}
	@Override public void setId(long id) {this.id = id;}
	
	private Date record;
	@Override public Date getRecord() {return record;}
	@Override public void setRecord(java.util.Date record) {this.record=record;}
}