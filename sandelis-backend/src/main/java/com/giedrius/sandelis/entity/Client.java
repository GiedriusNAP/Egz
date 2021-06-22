package com.giedrius.sandelis.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import org.springframework.data.annotation.Id;
//Table - Client

@Entity
public class Client {
	@Id
	@GeneratedValue
	private long id;
	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;
	@NotBlank
	private Date birthDate;
	@NotBlank
	private String phoneNum;
	@NotBlank
	private boolean clientType;

	protected Client() {

	}

	public Client(@NotBlank String firstName, @NotBlank String lastName, @NotBlank Date birthDate,
			@NotBlank String phoneNum, @NotBlank boolean clientType) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.phoneNum = phoneNum;
		this.clientType = clientType;
	}

	public long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public boolean isClientType() {
		return clientType;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate
				+ ", phoneNum=" + phoneNum + ", clientType=" + clientType + "]";
	}

}
