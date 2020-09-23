package main.familyTree;

import java.util.List;

public interface Person {
	public void setFullName(String fullName);
	public String getFullName();
	public void setSex(String sex);
	public String getSex();
	public void setAge(int age);
	public int getAge();
	public void setMate(Person mate);
	public Person getMate();
	public void setParents(List<Person> parents);
	public List<Person> getParents();
	public void setBrothersSisters(List<Person> brothersSisters);
	public List<Person> getBrothersSisters();
	public void setChilds(List<Person> childs);
	public List<Person> getChilds();
	public void setGrandParents(List<Person> grandParents);
	public List<Person> getGrandParents();
	public void setUnclesAunts(List<Person> unclesAunts);
	public List<Person> getUnclesAunts();
	public void setFamiliar(List<Person> familiar);
	public List<Person> getFamiliar();
	/**
	 * Calcula una clave numerica ordenada segun los familiares cercanos
	 * @param familyMember
	 * @return
	 */
	public Integer getKey(Person familyMember);
}
