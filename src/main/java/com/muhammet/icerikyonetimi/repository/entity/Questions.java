
package com.muhammet.icerikyonetimi.repository.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tblquestions")
public class Questions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String subjectdetail;
	private String userid;
	private String title;
	private String questions;
	@Temporal(TemporalType.DATE)
	private Date createdat;
	private Date updateat;
	private Boolean enabled = true;

	@OneToOne
	private Answers answers;

	public Questions() {
	}

	public Questions(String subjectdetail, String user, String title, String questions, Date createdat, Date updateat) {
		this.subjectdetail = subjectdetail;
		this.userid = user;
		this.title = title;
		this.questions = questions;
		this.createdat = createdat;
		this.updateat = updateat;
	}

	public Questions(Long string, String subjectdetail, String user, String title, String questions, Date createdat,
			Date updateat) {
		this.id = string;
		this.subjectdetail = subjectdetail;
		this.userid = user;
		this.title = title;
		this.questions = questions;
		this.createdat = createdat;
		this.updateat = updateat;
	}

	/**
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * @return the answers
	 */
	public Answers getAnswers() {
		return answers;
	}

	/**
	 * @param answers the answers to set
	 */
	public void setAnswers(Answers answers) {
		this.answers = answers;
	}

	public Questions(String subjectdetail, String userid, String title, String questions, Date createdat, Date updateat,
			Boolean enabled, Answers answers) {
		super();
		this.subjectdetail = subjectdetail;
		this.userid = userid;
		this.title = title;
		this.questions = questions;
		this.createdat = createdat;
		this.updateat = updateat;
		this.enabled = enabled;
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Questions{" + "id=" + id + ", subjectdetail=" + subjectdetail + ", user=" + userid + ", title=" + title
				+ ", questions=" + questions + ", createdat=" + createdat + ", updateat=" + updateat + ", enabled="
				+ enabled + '}';
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubjectdetail() {
		return subjectdetail;
	}

	public void setSubjectdetail(String subjectdetail) {
		this.subjectdetail = subjectdetail;
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

	public String getQuestions() {
		return questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
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
