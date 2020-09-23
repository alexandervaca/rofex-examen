package main.familyTree;

import java.util.List;
import java.util.TreeMap;

public class FamilyMember implements Person {
	private String fullName;
	private String sex;
	private int age;
	private Person mate;
	private TreeMap<Integer, Person> familiar = new TreeMap<>();;

	public FamilyMember() {}

	public FamilyMember(String fullName, String sex, int age) {
		this.fullName = fullName;
		this.sex = sex;
		this.age = age;
	}

	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public void setMate(Person mate) {
		this.mate = mate;
	}
	@Override
	public Person getMate() {
		return this.mate;
	}
	@Override
	public void setParents(List<Person> parents) {
		for (Person person : parents) {
			this.familiar.put(person.getKey(this), person);
		}
	}
	@Override
	public List<Person> getParents() {
		return null;
	}
	@Override
	public void setChilds(List<Person> childs) {
		
	}
	@Override
	public List<Person> getChilds() {
		return null;
	}
	@Override
	public void setGrandParents(List<Person> grandParents) {
		
	}
	@Override
	public List<Person> getGrandParents() {
		return null;
	}
	@Override
	public void setUnclesAunts(List<Person> unclesAunts) {
	}
	@Override
	public List<Person> getUnclesAunts() {
		return null;
	}
	@Override
	public void setBrothersSisters(List<Person> brothersSisters) {
	}
	@Override
	public List<Person> getBrothersSisters() {
		return null;
	}
	@Override
	public void setFamiliar(List<Person> familiar) {
		
	}
	@Override
	public List<Person> getFamiliar() {
		return null;
	}
	@Override
	public Integer getKey(Person familyMember) {
		return null;
	}
}
