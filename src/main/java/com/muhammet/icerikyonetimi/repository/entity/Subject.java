
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
@Table(name = "tblsubject")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String lesson;
	@Temporal(TemporalType.DATE)
	private Date creastedat;
	private Date updateat;
	private Boolean enabled = true;

	public Subject() {
	}

	public Subject(String name, String lesson, Date creastedat, Date updateat) {
		this.name = name;
		this.lesson = lesson;
		this.creastedat = creastedat;
		this.updateat = updateat;
	}

	public Subject(Long id, String name, String lesson, Date creastedat, Date updateat) {
		this.id = id;
		this.name = name;
		this.lesson = lesson;
		this.creastedat = creastedat;
		this.updateat = updateat;
	}

	@Override
	public String toString() {
		return "Subject{" + "id=" + id + ", name=" + name + ", lesson=" + lesson + ", creastedat=" + creastedat
				+ ", updateat=" + updateat + ", enabled=" + enabled + '}';
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

	public String getLesson() {
		return lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}

	public Date getCreastedat() {
		return creastedat;
	}

	public void setCreastedat(Date creastedat) {
		this.creastedat = creastedat;
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
