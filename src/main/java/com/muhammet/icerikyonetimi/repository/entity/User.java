
package com.muhammet.icerikyonetimi.repository.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbluser")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String surname;
	private String role;
	@Temporal(TemporalType.DATE)
	private Date createdat;
	@Temporal(TemporalType.DATE)
	private Date updateat;
	private Boolean enabled = true;

	public User() {
	}

	public User(String name, String surname, String role, Date createdat, Date updateat) {
		this.name = name;
		this.surname = surname;
		this.role = role;
		this.createdat = createdat;
		this.updateat = updateat;
	}

	public User(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "User{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", role=" + role + ", createdat="
				+ createdat + ", updateat=" + updateat + ", enabled=" + enabled + '}';
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getCreatedat() {
		return createdat;
	}

	public void setCreatedat(Date createdat) {
		this.createdat = createdat;
	}

	public Date getUpdateat() {
		return updateat;
	}

	public void setUpdateat(Date updateat) {
		this.updateat = updateat;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

}
