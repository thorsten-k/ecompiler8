package jeesl.model.ts.core;

import java.io.Serializable;

import org.jeesl.interfaces.model.module.ts.JeeslTimeSeries;

import jeesl.model.locales.JeeDescription;
import jeesl.model.locales.JeeLang;
import jeesl.model.ts.type.JeeTsInterval;
import net.sf.ahtutils.interfaces.model.crud.EjbPersistable;
import net.sf.ahtutils.interfaces.model.crud.EjbRemoveable;

public class JeeTimeSeries implements Serializable,EjbRemoveable,EjbPersistable,
								JeeslTimeSeries<JeeLang,JeeDescription,JeeTsScope,JeeTsBridge,JeeTsInterval>
{
	public static final long serialVersionUID=1;
	
	private long id;
	@Override public long getId() {return id;}
	@Override public void setId(long id) {this.id = id;}
	
	private JeeTsScope scope;
	@Override public JeeTsScope getScope() {return scope;}
	@Override public void setScope(JeeTsScope scope) {this.scope = scope;}
	
	private JeeTsInterval interval;
	@Override public JeeTsInterval getInterval() {return interval;}
	@Override public void setInterval(JeeTsInterval interval) {this.interval = interval;}
	
	private JeeTsBridge bridge;
	@Override public JeeTsBridge getBridge() {return bridge;}
	@Override public void setBridge(JeeTsBridge bridge) {this.bridge = bridge;}
}