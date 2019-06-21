package jeesl;

import org.jeesl.factory.builder.module.TsFactoryBuilder;

import jeesl.model.locales.IoDescription;
import jeesl.model.locales.IoLang;
import jeesl.model.ts.core.TsBridge;
import jeesl.model.ts.core.TsEntityClass;
import jeesl.model.ts.core.TsMultiPoint;
import jeesl.model.ts.core.TsScope;
import jeesl.model.ts.core.TsSeries;
import jeesl.model.ts.data.TsData;
import jeesl.model.ts.data.TsDataPoint;
import jeesl.model.ts.data.TsSample;
import jeesl.model.ts.data.TsTransaction;
import jeesl.model.ts.qa.TsQaFlag;
import jeesl.model.ts.type.TsCategory;
import jeesl.model.ts.type.TsDataSource;
import jeesl.model.ts.type.TsInterval;
import jeesl.model.ts.type.TsScopeType;
import jeesl.model.ts.type.TsUnit;
import jeesl.model.ts.type.TsWorkspace;
import jeesl.model.user.JeeUser;

public class Factory
{	
	public static TsFactoryBuilder<IoLang,IoDescription,TsCategory,TsScope,TsScopeType,TsUnit,TsMultiPoint,TsSeries,TsTransaction,TsDataSource,TsBridge,TsEntityClass,TsInterval,TsData,TsDataPoint,TsSample,JeeUser,TsWorkspace,TsQaFlag> fbTimeSeries()
	{
//		return null;
	return new TsFactoryBuilder<>(IoLang.class,IoDescription.class,
									TsCategory.class,TsScope.class,
									TsScopeType.class,TsUnit.class,TsMultiPoint.class,
									TsSeries.class,TsTransaction.class,TsDataSource.class,TsBridge.class,TsEntityClass.class,TsInterval.class,
									TsData.class,TsDataPoint.class,TsWorkspace.class);
	}

}