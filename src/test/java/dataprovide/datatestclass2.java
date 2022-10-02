package dataprovide;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datatestclass2 {

	
	  @DataProvider(indices = {0,2})
	  public Object[] data() {
		
		  Object []	data= {"akash","khdar","ankita",7083,959,778866};
		  return data;
	  }
	  
	  @DataProvider
	  public Iterator<Object> array() {
		  
		  List l=new ArrayList();
		  l.add("akash");
		  return l.iterator();
		  
	  }
}


