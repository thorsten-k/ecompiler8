package jeesl.model.graphic;

import java.io.Serializable;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.jeesl.interfaces.model.system.with.code.EjbWithCode;

import jeesl.model.locales.JeeDescription;
import jeesl.model.locales.JeeLang;
import jeesl.model.locales.JeeStatus;
import net.sf.ahtutils.interfaces.model.crud.EjbPersistable;
import net.sf.ahtutils.interfaces.model.status.UtilsStatus;
import net.sf.ahtutils.model.qualifier.EjbErNode;


@EjbErNode(name="Style",category="symbol",subset="sld",level=3)
public class JeeGraphicStyle extends JeeStatus
								implements Serializable,EjbPersistable,EjbWithCode,
											UtilsStatus<JeeGraphicStyle,JeeLang,JeeDescription>
{
	public static final long serialVersionUID=1;

	@Override public boolean equals(Object object) {return (object instanceof JeeGraphicStyle) ? id == ((JeeGraphicStyle) object).getId() : (object == this);}
	@Override public int hashCode() {return new HashCodeBuilder(17,3).append(id).toHashCode();}
}