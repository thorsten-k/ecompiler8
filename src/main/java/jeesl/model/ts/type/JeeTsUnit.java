package jeesl.model.ts.type;

import java.io.Serializable;

import org.jeesl.interfaces.model.system.with.code.EjbWithCode;

import jeesl.model.locales.JeeDescription;
import jeesl.model.locales.JeeLang;
import jeesl.model.locales.JeeStatus;
import net.sf.ahtutils.interfaces.model.crud.EjbPersistable;
import net.sf.ahtutils.interfaces.model.status.UtilsStatus;
import net.sf.ahtutils.interfaces.model.status.UtilsWithSymbol;

public class JeeTsUnit extends JeeStatus
								implements Serializable,EjbPersistable,EjbWithCode,UtilsWithSymbol,
											UtilsStatus<JeeTsUnit,JeeLang,JeeDescription>
{
	public static final long serialVersionUID=1;
}