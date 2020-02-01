package br.com.opet.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

@Entity
@Table(name = "q_history")
public class History implements Serializable {
	private static final long serialVersionUID = 8500348499302598321L;

	// Mapped properties
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_Q_HISTORY")
	@SequenceGenerator(name = "SEQ_Q_HISTORY", sequenceName = "SEQ_Q_HISTORY", allocationSize = 1)
	@Column(name = "id", unique = true, nullable = false, columnDefinition = "Long")
	private Long id;

	@Column(name = "title")
	private String title;

	@Column(name = "subtitle")
	private String subtitle;

	@Column(name = "resume")
	private String resume;

	// Constructors
	public History(Long id, String title, String subtitle, String resume) {
		this.id = id;
		this.title = title;
		this.subtitle = subtitle;
		this.resume = resume;
	}

	public History(String title, String subtitle, String resume) {
		this.title = title;
		this.subtitle = subtitle;
		this.resume = resume;
	}

	public History() {
	}

	// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
