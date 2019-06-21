package jeesl.model.ts.type;

import java.io.Serializable;

import org.jeesl.interfaces.model.system.with.code.EjbWithCode;

import jeesl.model.locales.IoDescription;
import jeesl.model.locales.IoLang;
import jeesl.model.locales.IoStatus;
import net.sf.ahtutils.interfaces.model.crud.EjbPersistable;
import net.sf.ahtutils.interfaces.model.status.UtilsStatus;

public class TsCategory extends IoStatus
								implements Serializable,EjbPersistable,EjbWithCode,
											UtilsStatus<TsCategory,IoLang,IoDescription>
{
	public static final long serialVersionUID=1;
}