package generic;

import java.util.ArrayList;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

public class DataProviders {
	
	@Test
	@DataProvider(name="Excel")
	public ArrayList<Object[]> passData(){

		Excel e = new Excel("D:\\project\\Project-master\\excel\\excel.xlsx");
		int row = e.getRowCount("Sheet1");
		ArrayList<Object[]> data = new ArrayList<Object[]>();
		for(int i=0; i < row ; i++){
			String username = e.getData("Sheet1", i, 0);
			String Password= e.getData("Sheet1",i,1); 
		data.add(new Object[]{username, Password});	
		}
             return data;	
	}
	

}
