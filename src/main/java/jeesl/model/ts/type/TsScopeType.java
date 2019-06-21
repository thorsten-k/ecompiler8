package jeesl.model.ts.type;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.jeesl.interfaces.model.module.ts.core.JeeslTsScopeType;

import jeesl.model.graphic.IoGraphic;
import jeesl.model.locales.IoDescription;
import jeesl.model.locales.IoLang;
import jeesl.model.locales.IoStatus;

public class TsScopeType extends IoStatus implements JeeslTsScopeType<TsScopeType,IoLang,IoDescription,IoGraphic>
{
	public static final long serialVersionUID=1;

	@Override public String getRestCode() {return JeeslTsScopeType.class.getName();}
	
	@Override public List<String> getFixedCodes()
	{
		List<String> fixed = new ArrayList<String>();
		for(JeeslTsScopeType.Code c : JeeslTsScopeType.Code.values()){fixed.add(c.toString());}
		return fixed;
	}
	
	@Override public boolean equals(Object object) {return (object instanceof TsScopeType) ? id == ((TsScopeType) object).getId() : (object == this);}
	@Override public int hashCode() {return new HashCodeBuilder(23,7).append(id).toHashCode();}
}