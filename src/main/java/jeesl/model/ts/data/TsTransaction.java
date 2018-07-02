package jeesl.model.ts.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.jeesl.interfaces.model.module.ts.JeeslTsTransaction;

import jeesl.model.ts.type.TsDataSource;
import jeesl.model.user.JeeUser;

public class TsTransaction implements JeeslTsTransaction<TsDataSource,TsData,JeeUser>
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
	
	private TsDataSource source;
	@Override public TsDataSource getSource() {return source;}
	@Override public void setSource(TsDataSource source) {this.source = source;}
	
	private List<TsData> datas;
	@Override public List<TsData> getDatas() {if(datas==null){datas = new ArrayList<TsData>();} return datas;}
	@Override public void setDatas(List<TsData> datas) {this.datas = datas;}
	
	private String reference;
	@Override public String getReference() {return reference;}
	@Override public void setReference(String reference) {this.reference = reference;}
}