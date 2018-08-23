package entity;

import java.util.HashMap;
import java.util.Map;

public class service_class {
	
	private Map<Integer, account_class> accountlist;
	int counter;
	
	public service_class() {
		accountlist = new HashMap<Integer, account_class>();
		counter = 1;
	}
	
	public void addtolist(account_class account) {
		accountlist.put(counter, account);
		counter ++;
	}
	
	public String retrieving(int a) {
		return (accountlist.get(a)).toString();
	}

	@Override
	public String toString() {
		return "service_class [accountlist=" + accountlist + ", counter=" + counter + "]";
	}
	
}
