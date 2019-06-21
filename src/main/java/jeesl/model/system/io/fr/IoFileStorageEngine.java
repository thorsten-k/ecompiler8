package jeesl.model.system.io.fr;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.jeesl.interfaces.model.system.io.fr.JeeslFileStorageEngine;

import jeesl.model.graphic.JeeGraphic;
import jeesl.model.locales.JeeDescription;
import jeesl.model.locales.JeeLang;
import jeesl.model.locales.JeeStatus;

public class IoFileStorageEngine extends JeeStatus implements JeeslFileStorageEngine<IoFileStorageEngine,JeeLang,JeeDescription,JeeGraphic>
{
	public static final long serialVersionUID=1;
	public static enum Code{lcf};
	
	@Override public String getRestCode() {return JeeslFileStorageEngine.class.getName();}
	
	@Override public List<String> getFixedCodes()
	{
		List<String> fixed = new ArrayList<>();
		for(IoFileStorageEngine.Code c : IoFileStorageEngine.Code.values()){fixed.add(c.toString());}
		return fixed;
	}
	
	@Override public boolean equals(Object object) {return (object instanceof IoFileStorageEngine) ? id == ((IoFileStorageEngine) object).getId() : (object == this);}
	@Override public int hashCode(){return new HashCodeBuilder(17,37).append(id).toHashCode();}
}