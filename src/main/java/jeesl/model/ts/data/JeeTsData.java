package jeesl.model.ts.data;

import java.io.Serializable;
import java.util.Date;

import org.jeesl.interfaces.model.module.ts.JeeslTsData;

import jeesl.model.locales.JeeDescription;
import jeesl.model.locales.JeeLang;
import jeesl.model.ts.core.JeeTimeSeries;
import jeesl.model.ts.type.JeeTsWorkspace;
import net.sf.ahtutils.interfaces.model.crud.EjbPersistable;
import net.sf.ahtutils.interfaces.model.crud.EjbRemoveable;

public class JeeTsData implements JeeslTsData<JeeTimeSeries,JeeTsTransaction,JeeTsSample,JeeTsWorkspace>
{
	public static final long serialVersionUID=1;
	
	private long id;
	@Override public long getId() {return id;}
	@Override public void setId(long id) {this.id = id;}
	
	private JeeTimeSeries timeSeries;
	@Override public JeeTimeSeries getTimeSeries() {return timeSeries;}
	@Override public void setTimeSeries(JeeTimeSeries timeSeries) {this.timeSeries = timeSeries;}

	private JeeTsWorkspace workspace;
	@Override public JeeTsWorkspace getWorkspace() {return workspace;}
	@Override public void setWorkspace(JeeTsWorkspace workspace) {this.workspace = workspace;}
	
	private JeeTsTransaction transaction;
	@Override public JeeTsTransaction getTransaction() {return transaction;}
	@Override public void setTransaction(JeeTsTransaction transaction) {this.transaction = transaction;}
	
	private JeeTsSample sample;
	@Override public JeeTsSample getSample() {return sample;}
	@Override public void setSample(JeeTsSample sample) {this.sample = sample;}

	private Date record;
	@Override public Date getRecord() {return record;}
	@Override public void setRecord(java.util.Date record) {this.record=record;}
	
	private Double value;
	@Override public Double getValue() {return value;}
	@Override public void setValue(Double value) {this.value = value;}
}