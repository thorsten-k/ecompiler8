package jeesl.model.ts.qa;

import java.io.Serializable;

import org.jeesl.interfaces.model.system.with.EjbWithGraphic;
import org.jeesl.interfaces.model.system.with.code.EjbWithCode;

import jeesl.model.graphic.JeeGraphic;
import jeesl.model.graphic.JeeGraphicFigure;
import jeesl.model.graphic.JeeGraphicStyle;
import jeesl.model.graphic.JeeGraphicType;
import jeesl.model.locales.JeeDescription;
import jeesl.model.locales.JeeLang;
import jeesl.model.locales.JeeStatus;
import net.sf.ahtutils.interfaces.model.crud.EjbPersistable;
import net.sf.ahtutils.interfaces.model.status.UtilsStatus;

public class JeeTsQaFlag extends JeeStatus
								implements Serializable,EjbPersistable,EjbWithCode,
											
											EjbWithGraphic<JeeLang,JeeDescription,JeeGraphic,JeeGraphicType,JeeGraphicFigure,JeeGraphicStyle>,
											UtilsStatus<JeeTsQaFlag,JeeLang,JeeDescription>
{
	public static final long serialVersionUID=1;
}