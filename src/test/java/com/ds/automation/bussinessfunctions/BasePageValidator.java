package com.ds.automation.bussinessfunctions;

import com.ds.automation.bussinessfunctions.BasePageElementMap;

public class BasePageValidator <M extends BasePageElementMap>
{    
	private M Map;

	BasePageValidator(M Map)
	{		
		this.Map =  Map;
	}
	
	public M getMap()
	{		
		return  Map;
	}	
}
