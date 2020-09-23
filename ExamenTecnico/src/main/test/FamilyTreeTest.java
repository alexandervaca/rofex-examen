package main.test;

import java.util.ArrayList;
import java.util.List;

import main.familyTree.FamilyMember;
import main.familyTree.Person;

import org.junit.Test;

public class FamilyTreeTest {

	@Test
	public void test() {
		Person grandFather = new FamilyMember("Fernando", "M", 88);
		Person father = new FamilyMember("Juan", "M", 65);
		Person mother = new FamilyMember("Ana", "F", 63);
		Person me = new FamilyMember("Me", "M", 36);
		Person brother = new FamilyMember("Carlos", "M", 39);
		Person sister = new FamilyMember("Carolina", "F", 31);

		List<Person> grandParents = new ArrayList<Person>();
		grandParents.add(grandFather);
		me.setGrandParents(grandParents);

		List<Person> parents = new ArrayList<Person>();
		parents.add(father);
		parents.add(mother);
		me.setParents(parents);

		List<Person> brothersSisters = new ArrayList<Person>();
		brothersSisters.add(brother);
		brothersSisters.add(sister);
		me.setBrothersSisters(brothersSisters);

		
	}
}
