package jeesl.model.ts.data;

import org.jeesl.interfaces.model.module.ts.data.JeeslTsDataPoint;

import jeesl.model.ts.core.TsMultiPoint;

public class TsDataPoint implements JeeslTsDataPoint<TsData,TsMultiPoint>
{
	public static final long serialVersionUID=1;
	
	private long id;
	@Override public long getId() {return id;}
	@Override public void setId(long id) {this.id = id;}
	
	private TsData data;
	public TsData getData() {return data;}
	public void setData(TsData data) {this.data = data;}

	private Double value;
	@Override public Double getValue() {return value;}
	@Override public void setValue(Double value) {this.value = value;}
	
	private TsMultiPoint multiPoint;
	@Override public TsMultiPoint getMultiPoint() {return multiPoint;}
	@Override public void setMultiPoint(TsMultiPoint multiPoint) {this.multiPoint = multiPoint;}
}