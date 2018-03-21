package jeesl;

import org.jeesl.factory.builder.module.TsFactoryBuilder;

import jeesl.model.locales.JeeDescription;
import jeesl.model.locales.JeeLang;
import jeesl.model.ts.core.JeeTimeSeries;
import jeesl.model.ts.core.JeeTsBridge;
import jeesl.model.ts.core.JeeTsEntityClass;
import jeesl.model.ts.core.JeeTsScope;
import jeesl.model.ts.data.JeeTsData;
import jeesl.model.ts.data.JeeTsSample;
import jeesl.model.ts.data.JeeTsTransaction;
import jeesl.model.ts.qa.JeeTsQaFlag;
import jeesl.model.ts.type.JeeTsCategory;
import jeesl.model.ts.type.JeeTsDataSource;
import jeesl.model.ts.type.JeeTsInterval;
import jeesl.model.ts.type.JeeTsUnit;
import jeesl.model.ts.type.JeeTsWorkspace;
import jeesl.model.ts.type.TsScopeType;
import jeesl.model.user.JeeUser;

public class Factory
{	
	public static TsFactoryBuilder<JeeLang,JeeDescription,JeeTsCategory,JeeTsScope,TsScopeType,JeeTsUnit,JeeTimeSeries,JeeTsTransaction,JeeTsDataSource,JeeTsBridge,JeeTsEntityClass,JeeTsInterval,JeeTsData,JeeTsSample,JeeUser,JeeTsWorkspace,JeeTsQaFlag> fbTimeSeries()
	{
		return null;
//		return new TsFactoryBuilder<>(JeeLang.class,JeeDescription.class,JeeTsCategory.class,JeeTsScope.class,JeeTsUnit.class,JeeTimeSeries.class,JeeTsTransaction.class,JeeTsDataSource.class,JeeTsBridge.class,JeeTsEntityClass.class,JeeTsInterval.class,JeeTsData.class,JeeTsWorkspace.class);
	}

}