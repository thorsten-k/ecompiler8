package jeesl.model.ts.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.jeesl.interfaces.model.module.ts.JeeslTsTransaction;

import jeesl.model.ts.type.JeeTsDataSource;
import jeesl.model.user.JeeUser;

public class JeeTsTransaction implements JeeslTsTransaction<JeeTsDataSource,JeeTsData,JeeUser>
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
	
	private String reference;
	@Override public String getReference() {return reference;}
	@Override public void setReference(String reference) {this.reference = reference;}
}