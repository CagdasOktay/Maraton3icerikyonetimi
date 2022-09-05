
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
@Table(name = "tblsubjectdetail")
public class Subjectdetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String subject;
	private String userid;
	private String title;
	private String descripton;
	private String article;
	@Temporal(TemporalType.DATE)
	private Date createdat;
	private Date updateat;
	private Boolean enabled = true;

	public Subjectdetail() {
	}

	public Subjectdetail(String subject, String user, String title, String descripton, String article, Date createdat,
			Date updateat) {
		this.subject = subject;
		this.userid = user;
		this.title = title;
		this.descripton = descripton;
		this.article = article;
		this.createdat = createdat;
		this.updateat = updateat;
	}

	public Subjectdetail(Long id, String subject, String user, String title, String descripton, String article,
			Date createdat, Date updateat) {
		this.id = id;
		this.subject = subject;
		this.userid = user;
		this.title = title;
		this.descripton = descripton;
		this.article = article;
		this.createdat = createdat;
		this.updateat = updateat;
	}

	@Override
	public String toString() {
		return "Subjectdetail{" + "id=" + id + ", subject=" + subject + ", user=" + userid + ", title=" + title
				+ ", descripton=" + descripton + ", article=" + article + ", createdat=" + createdat + ", updateat="
				+ updateat + ", enabled=" + enabled + '}';
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getUser() {
		return userid;
	}

	public void setUser(String user) {
		this.userid = user;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescripton() {
		return descripton;
	}

	public void setDescripton(String descripton) {
		this.descripton = descripton;
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
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
