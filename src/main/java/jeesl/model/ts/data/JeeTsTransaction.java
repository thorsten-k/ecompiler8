package jeesl.model.ts.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.jeesl.interfaces.model.module.ts.JeeslTsTransaction;

import jeesl.model.locales.JeeDescription;
import jeesl.model.locales.JeeLang;
import jeesl.model.ts.core.JeeTimeSeries;
import jeesl.model.ts.core.JeeTsBridge;
import jeesl.model.ts.core.JeeTsEntityClass;
import jeesl.model.ts.core.JeeTsScope;
import jeesl.model.ts.qa.JeeTsQaFlag;
import jeesl.model.ts.type.JeeTsCategory;
import jeesl.model.ts.type.JeeTsDataSource;
import jeesl.model.ts.type.JeeTsInterval;
import jeesl.model.ts.type.JeeTsUnit;
import jeesl.model.ts.type.JeeTsWorkspace;
import jeesl.model.user.JeeUser;
import net.sf.ahtutils.interfaces.model.crud.EjbPersistable;
import net.sf.ahtutils.interfaces.model.crud.EjbRemoveable;

public class JeeTsTransaction implements Serializable,EjbRemoveable,EjbPersistable,
								JeeslTsTransaction<JeeLang,JeeDescription,JeeTsCategory,JeeTsScope,JeeTsUnit,JeeTimeSeries,JeeTsTransaction,JeeTsDataSource,JeeTsBridge,JeeTsEntityClass,JeeTsInterval,JeeTsData,JeeTsSample,JeeUser,JeeTsWorkspace,JeeTsQaFlag>
{
	public static final long serialVersionUID=1;
	
	private long id;
	@Override public long getId() {return id;}
	@Override public void setId(long id) {this.id = id;}
	
	private JeeUser user;
	@Override public JeeUser getUser() {return user;}
	@Override public void setUser(JeeUser user) {this.user = user;}
	
	private String remark;
	@Override public String getRemark() {return remark;}
	@Override public void setRemark(String remark) {this.remark = remark;}

	private Date record;
	@Override public Date getRecord() {return record;}
	@Override public void setRecord(java.util.Date record) {this.record=record;}
	
	private JeeTsDataSource source;
	@Override public JeeTsDataSource getSource() {return source;}
	@Override public void setSource(JeeTsDataSource source) {this.source = source;}
	
	private List<JeeTsData> datas;
	@Override public List<JeeTsData> getDatas() {if(datas==null){datas = new ArrayList<JeeTsData>();} return datas;}
	@Override public void setDatas(List<JeeTsData> datas) {this.datas = datas;}
}