package jeesl.model.ts.qa;

import java.io.Serializable;

import org.jeesl.interfaces.model.system.with.EjbWithGraphic;
import org.jeesl.interfaces.model.system.with.code.EjbWithCode;

import jeesl.model.graphic.IoGraphic;
import jeesl.model.locales.IoDescription;
import jeesl.model.locales.IoLang;
import jeesl.model.locales.IoStatus;
import net.sf.ahtutils.interfaces.model.crud.EjbPersistable;
import net.sf.ahtutils.interfaces.model.status.UtilsStatus;

public class TsQaFlag extends IoStatus
								implements Serializable,EjbPersistable,EjbWithCode,
											EjbWithGraphic<IoGraphic>,
											UtilsStatus<TsQaFlag,IoLang,IoDescription>
{
	public static final long serialVersionUID=1;
}