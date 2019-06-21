package jeesl.model.ts.type;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.jeesl.interfaces.model.module.ts.core.JeeslTsScopeType;

import jeesl.model.graphic.JeeGraphic;
import jeesl.model.locales.JeeDescription;
import jeesl.model.locales.JeeLang;
import jeesl.model.locales.JeeStatus;
import net.sf.ahtutils.interfaces.model.status.UtilsStatus;

public class TsScopeType extends JeeStatus implements JeeslTsScopeType<TsScopeType,JeeLang,JeeDescription,JeeGraphic>
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