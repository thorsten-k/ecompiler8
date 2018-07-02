package jeesl.model.ts.data;

import java.util.Date;

import org.jeesl.interfaces.model.module.ts.JeeslTsData;

import jeesl.model.ts.core.TimeSeries;
import jeesl.model.ts.type.TsWorkspace;

public class TsData implements JeeslTsData<TimeSeries,TsTransaction,TsSample,TsWorkspace>
{
	public static final long serialVersionUID=1;
	
	private long id;
	@Override public long getId() {return id;}
	@Override public void setId(long id) {this.id = id;}
	
	private TimeSeries timeSeries;
	@Override public TimeSeries getTimeSeries() {return timeSeries;}
	@Override public void setTimeSeries(TimeSeries timeSeries) {this.timeSeries = timeSeries;}

	private TsWorkspace workspace;
	@Override public TsWorkspace getWorkspace() {return workspace;}
	@Override public void setWorkspace(TsWorkspace workspace) {this.workspace = workspace;}
	
	private TsTransaction transaction;
	@Override public TsTransaction getTransaction() {return transaction;}
	@Override public void setTransaction(TsTransaction transaction) {this.transaction = transaction;}
	
	private TsSample sample;
	@Override public TsSample getSample() {return sample;}
	@Override public void setSample(TsSample sample) {this.sample = sample;}

	private Date record;
	@Override public Date getRecord() {return record;}
	@Override public void setRecord(java.util.Date record) {this.record=record;}
	
	private Double value;
	@Override public Double getValue() {return value;}
	@Override public void setValue(Double value) {this.value = value;}
}