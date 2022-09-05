
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
@Table(name = "tblanswers")

public class Answers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String questions;
	private String userid;
	private String answers;
	@Temporal(TemporalType.DATE)
	private Date createdat;
	@Temporal(TemporalType.DATE)
	private Date updateat;
	private boolean enabled = true;

	public Answers() {
	}

	public Answers(String questions, String user, String answers, Date createdat, Date updateat) {
		this.questions = questions;
		this.userid = user;
		this.answers = answers;
		this.createdat = createdat;
		this.updateat = updateat;
	}

	public Answers(Long id, String questions, String user, String answers, Date createdat, Date updateat) {
		this.id = id;
		this.questions = questions;
		this.userid = user;
		this.answers = answers;
		this.createdat = createdat;
		this.updateat = updateat;
	}

	@Override
	public String toString() {
		return "Answers{" + "id=" + id + ", questions=" + questions + ", user=" + userid + ", answers=" + answers
				+ ", createdat=" + createdat + ", updateat=" + updateat + ", enabled=" + enabled + '}';
	}

	public String getAnswers() {
		return answers;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
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

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestions() {
		return questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	public String getUser() {
		return userid;
	}

	public void setUser(String user) {
		this.userid = user;
	}

}
