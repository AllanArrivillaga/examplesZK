package org.zkoss.reference.developer.mvvm.databinding;

import java.util.LinkedList;
import java.util.List;

public class ItemList {

	static List<String> list = new LinkedList<String>();
	
	static public void add(String item){
		list.add(item);
	}
	
	static public List<String> getList(){
		return list;
	}
}
