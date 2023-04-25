package ar.edu.unq.po2.tp5;

import java.util.*;

public class ColeccionadorDeObjetos {
	
	//List<Collection> collection = new ArrayList<Collection>();
	List<Collection> collection = new ArrayList<Collection>();
	
	
	
	public Object getFirstFrom(List collection) {
		System.out.print(collection.get(0));
		return collection.get(0);
	}
	
	public void addLast(Object element, List collection) {
		collection.add(element);
	}
	/*
	public Collection getSubCollection(List collection, int from, int to) {
		return collection.subList(x,y);
	}
	*/
	public Boolean containsElement(List collection, Object element) {
		return collection.contains(element);
	}
	
	
}
