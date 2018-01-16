package org.formation.proxibanqueSpringDJMF.service;


import java.util.List;


public interface IProxibanqueService <T, Integer> {
	public void add(T t); 
	public List<T> list();
	public void	delete(int id);
	public T edit(int id);
	public void	update(T t);
	

}
