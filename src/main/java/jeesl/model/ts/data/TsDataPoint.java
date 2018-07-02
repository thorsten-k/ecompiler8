package jeesl.model.ts.data;

import org.jeesl.interfaces.model.module.ts.JeeslTsDataPoint;

public class TsDataPoint implements JeeslTsDataPoint<TsData>
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
}