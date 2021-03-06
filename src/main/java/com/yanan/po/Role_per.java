package com.yanan.po;

public class Role_per {

	private Integer roleId;
	private Integer perId;
	private Integer menuId;
	
	public Role_per() {
		super();
	}

	public Role_per(Integer roleId, Integer perId, Integer menuId) {
		super();
		this.roleId = roleId;
		this.perId = perId;
		this.menuId = menuId;
	}

	@Override
	public String toString() {
		return "Role_per [roleId=" + roleId + ", perId=" + perId + ", menuId=" + menuId + "]";
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getPerId() {
		return perId;
	}

	public void setPerId(Integer perId) {
		this.perId = perId;
	}

	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	
}
