package ui.automation.pages;

import ui.automation.pages.BasePageElementMap;

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
