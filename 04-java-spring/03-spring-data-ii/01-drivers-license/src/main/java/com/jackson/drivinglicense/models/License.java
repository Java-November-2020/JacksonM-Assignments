package com.jackson.drivinglicense.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.Table;


@Entity
@Table(name="licenses")
public class License {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int number;
//	@DateTimeFormat(pattern="MM/DD/YYYY")
	private Date expiration_date;
	private String state;
	@Column(updatable=false)
	private Date createdAt;
	private Date updatedAt;
	
	//Relationships
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="person_id")
	private Person person;


	//Java Bean
	public License() {
		
	}
	
	//Autoincrement the number
	public String getNumberAsString() {
		int numOfZeros = 7- String.valueOf(this.number).length();
		//String Builder
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<numOfZeros; i++) {
			sb.append('0');
		}
		String returnValue = sb + String.valueOf(this.number);
		return returnValue;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public Date getExpiration_date() {
		return expiration_date;
	}
	
//	public String getExpirationDateFormatted() {
//		SimpleDateFormat fm = new SimpleDateFormat("MM/dd/yyyy");
//		return fm.format(this.expiration_date);
//	}


	public void setExpiration_date(Date expiration_date) {
		this.expiration_date = expiration_date;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}


	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}
	
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	@PostPersist
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
		
}
