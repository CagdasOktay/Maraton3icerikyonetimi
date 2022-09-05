
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
@Table(name = "tbllesson")
public class Lesson {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	@Temporal(TemporalType.DATE)
	private Date createdat;
	private Date updateat;
	private Boolean Enabled = true;

	public Lesson() {
	}

	public Lesson(String name, String description, Date createdat, Date updateat) {
		this.name = name;
		this.description = description;
		this.createdat = createdat;
		this.updateat = updateat;
	}

	public Lesson(Long id, String name, String description, Date createdat, Date updateat) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.createdat = createdat;
		this.updateat = updateat;
	}

	@Override
	public String toString() {
		return "Lesson{" + "id=" + id + ", name=" + name + ", description=" + description + ", createdat=" + createdat
				+ ", updateat=" + updateat + ", Enabled=" + Enabled + '}';
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
		return Enabled;
	}

	public void setEnabled(Boolean Enabled) {
		this.Enabled = Enabled;
	}

}
