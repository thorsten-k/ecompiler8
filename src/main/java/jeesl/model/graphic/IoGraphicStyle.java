package jeesl.model.graphic;

import java.io.Serializable;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.jeesl.interfaces.model.system.with.code.EjbWithCode;

import jeesl.model.locales.IoDescription;
import jeesl.model.locales.IoLang;
import jeesl.model.locales.IoStatus;
import net.sf.ahtutils.interfaces.model.crud.EjbPersistable;
import net.sf.ahtutils.interfaces.model.status.UtilsStatus;
import net.sf.ahtutils.model.qualifier.EjbErNode;


@EjbErNode(name="Style",category="symbol",subset="sld",level=3)
public class IoGraphicStyle extends IoStatus
								implements Serializable,EjbPersistable,EjbWithCode,
											UtilsStatus<IoGraphicStyle,IoLang,IoDescription>
{
	public static final long serialVersionUID=1;

	@Override public boolean equals(Object object) {return (object instanceof IoGraphicStyle) ? id == ((IoGraphicStyle) object).getId() : (object == this);}
	@Override public int hashCode() {return new HashCodeBuilder(17,3).append(id).toHashCode();}
}