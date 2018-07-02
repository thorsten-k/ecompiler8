package jeesl;

import org.jeesl.factory.builder.module.TsFactoryBuilder;

import jeesl.model.locales.JeeDescription;
import jeesl.model.locales.JeeLang;
import jeesl.model.ts.core.TimeSeries;
import jeesl.model.ts.core.TsBridge;
import jeesl.model.ts.core.TsEntityClass;
import jeesl.model.ts.core.TsScope;
import jeesl.model.ts.core.TsMultiPoint;
import jeesl.model.ts.data.TsData;
import jeesl.model.ts.data.TsSample;
import jeesl.model.ts.data.TsTransaction;
import jeesl.model.ts.data.TsDataPoint;
import jeesl.model.ts.qa.TsQaFlag;
import jeesl.model.ts.type.TsCategory;
import jeesl.model.ts.type.TsDataSource;
import jeesl.model.ts.type.TsInterval;
import jeesl.model.ts.type.TsUnit;
import jeesl.model.ts.type.TsWorkspace;
import jeesl.model.ts.type.TsScopeType;
import jeesl.model.user.JeeUser;

public class Factory
{	
	public static TsFactoryBuilder<JeeLang,JeeDescription,TsCategory,TsScope,TsScopeType,TsUnit,TsMultiPoint,TimeSeries,TsTransaction,TsDataSource,TsBridge,TsEntityClass,TsInterval,TsData,TsDataPoint,TsSample,JeeUser,TsWorkspace,TsQaFlag> fbTimeSeries()
	{
		return null;
//		return new TsFactoryBuilder<>(JeeLang.class,JeeDescription.class,JeeTsCategory.class,JeeTsScope.class,JeeTsUnit.class,JeeTimeSeries.class,JeeTsTransaction.class,JeeTsDataSource.class,JeeTsBridge.class,JeeTsEntityClass.class,JeeTsInterval.class,JeeTsData.class,JeeTsWorkspace.class);
	}

}