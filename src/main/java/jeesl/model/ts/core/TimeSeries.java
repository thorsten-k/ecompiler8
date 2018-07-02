package jeesl.model.ts.core;

import java.io.Serializable;

import org.jeesl.interfaces.model.module.ts.JeeslTimeSeries;

import jeesl.model.ts.type.TsInterval;
import net.sf.ahtutils.interfaces.model.crud.EjbPersistable;
import net.sf.ahtutils.interfaces.model.crud.EjbRemoveable;

public class TimeSeries implements Serializable,EjbRemoveable,EjbPersistable,
								JeeslTimeSeries<TsScope,TsBridge,TsInterval>
{
	public static final long serialVersionUID=1;
	
	private long id;
	@Override public long getId() {return id;}
	@Override public void setId(long id) {this.id = id;}
	
	private TsScope scope;
	@Override public TsScope getScope() {return scope;}
	@Override public void setScope(TsScope scope) {this.scope = scope;}
	
	private TsInterval interval;
	@Override public TsInterval getInterval() {return interval;}
	@Override public void setInterval(TsInterval interval) {this.interval = interval;}
	
	private TsBridge bridge;
	@Override public TsBridge getBridge() {return bridge;}
	@Override public void setBridge(TsBridge bridge) {this.bridge = bridge;}
}