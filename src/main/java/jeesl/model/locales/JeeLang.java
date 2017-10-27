package jeesl.model.locales;

import java.io.Serializable;

import net.sf.ahtutils.interfaces.model.crud.EjbPersistable;
import net.sf.ahtutils.interfaces.model.crud.EjbRemoveable;
import net.sf.ahtutils.interfaces.model.status.UtilsLang;


public class JeeLang implements UtilsLang,EjbRemoveable,Serializable,EjbPersistable
{
	public static final long serialVersionUID=1;
	
	public static String[] defaultLocales = {"en"};
	

	private long id;
	@Override public long getId() {return id;}
	@Override public void setId(long id) {this.id = id;}
	

	private String lkey;
	@Override public String getLkey() {return lkey;}
	@Override public void setLkey(String lkey) {this.lkey = lkey;}
	

	private String lang;
	@Override public String getLang() {return lang;}
	@Override public void setLang(String name) {this.lang = name;}
	
	
	@Override public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append(id);
		sb.append(" ["+lkey+"]");
		sb.append(" "+lang);
		return sb.toString();
	}
}