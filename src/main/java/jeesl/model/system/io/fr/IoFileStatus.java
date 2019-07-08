package jeesl.model.system.io.fr;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.jeesl.interfaces.model.system.io.fr.JeeslFileStatus;

import jeesl.model.graphic.IoGraphic;
import jeesl.model.locales.IoDescription;
import jeesl.model.locales.IoLang;
import jeesl.model.locales.IoStatus;

public class IoFileStatus extends IoStatus implements JeeslFileStatus<IoLang,IoDescription,IoFileStatus,IoGraphic>
{
	public static final long serialVersionUID=1;
	public static enum Code{lcf};
	
	@Override public String getRestCode() {return JeeslFileStatus.class.getName();}
	
	@Override public List<String> getFixedCodes()
	{
		List<String> fixed = new ArrayList<String>();
		for(JeeslFileStatus.Code c : JeeslFileStatus.Code.values()){fixed.add(c.toString());}
		return fixed;
	}
	
	@Override public boolean equals(Object object) {return (object instanceof IoFileStatus) ? id == ((IoFileStatus) object).getId() : (object == this);}
	@Override public int hashCode(){return new HashCodeBuilder(17,37).append(id).toHashCode();}
}