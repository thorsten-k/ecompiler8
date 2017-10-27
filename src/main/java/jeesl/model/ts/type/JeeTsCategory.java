package jeesl.model.ts.type;

import java.io.Serializable;

import org.jeesl.interfaces.model.system.with.code.EjbWithCode;

import jeesl.model.locales.JeeDescription;
import jeesl.model.locales.JeeLang;
import jeesl.model.locales.JeeStatus;
import net.sf.ahtutils.interfaces.model.crud.EjbPersistable;
import net.sf.ahtutils.interfaces.model.status.UtilsStatus;

public class JeeTsCategory extends JeeStatus
								implements Serializable,EjbPersistable,EjbWithCode,
											UtilsStatus<JeeTsCategory,JeeLang,JeeDescription>
{
	public static final long serialVersionUID=1;
}