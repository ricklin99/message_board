package mb.test;

import mb.entity.RoleType;

public class TestRoleType {

	public static void main(String[] args) {
		for(RoleType roletype:RoleType.values()) {
			System.out.println(roletype.ordinal()+"�G"+roletype.name());
			System.out.println(roletype);
		}
		System.out.println(123);
	}

}
