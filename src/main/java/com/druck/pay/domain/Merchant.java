package com.druck.pay.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * Merchant entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "merchant")
public class Merchant implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 5292655005527693546L;
	private String id;
	private String name;
	private String payKey;
	private String paySecret;
	private Date createTime;

	// Constructors

	/** default constructor */
	public Merchant() {
	}

	/** full constructor */
	public Merchant(String name, String payKey, String paySecret, Date createTime) {
		this.name = name;
		this.payKey = payKey;
		this.paySecret = paySecret;
		this.createTime = createTime;
	}

	// Property accessors
	@Id
	@GenericGenerator(name = "generator", strategy = "uuid")
	@GeneratedValue(generator = "generator")
	@Column(name = "id", unique = true, nullable = false, length = 100)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "name", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "pay_key", length = 100)
	public String getPayKey() {
		return this.payKey;
	}

	public void setPayKey(String payKey) {
		this.payKey = payKey;
	}

	@Column(name = "pay_secret", length = 100)
	public String getPaySecret() {
		return paySecret;
	}

	public void setPaySecret(String paySecret) {
		this.paySecret = paySecret;
	}

	@Column(name = "create_time", length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "Merchant [id=" + id + ", name=" + name + ", payKey=" + payKey
				+ ", paySecret=" + paySecret + ", createTime=" + createTime
				+ "]";
	}

}