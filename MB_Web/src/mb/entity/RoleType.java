package mb.entity;

public enum RoleType {
	
	ADM("Administrator","系統管理員"),NEP("Normal_Employee","一般員工");
	private final String role;
	private final String description;
	
	private RoleType(String role,String description) {
		this.role = role;
		this.description = description;
	}

	public String getRole() {
		return role;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "RoleType{"+"身分"+role+"敘述"+description+"}";
	};
	
	
	
}
