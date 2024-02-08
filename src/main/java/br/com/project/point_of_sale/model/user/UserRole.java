package br.com.project.point_of_sale.model.user;

public enum UserRole {
    
    ADMIN("admin"),
	USER("user");
	
	private String role;

	UserRole(String role) {
		this.role = role;
	}

	public String getRole() {
		return role;
	}
    
}
