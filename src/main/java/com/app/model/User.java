package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	@Column(name="name")
	private String name;
	@Column(name="gender")
	private String gender;
	@Column(name="bloodgroup")
	private String blood_group;
	@Column(name="address")
	private String address;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="mobileno")
	private long mobile;
	@Column(name="email")
	private String email;
	@Column(name="age")
	private int age;
	@Column(name="subscribe")
	private Boolean subscribe;
	@Enumerated(EnumType.STRING)
	@Column(name="role")
	private Role role;
	
	
	public User() {
	}


	public User(long id, String name, String gender, String blood_group, String address, String username,
			String password, long mobile, String email, int age, Boolean subscribe, Role role) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.blood_group = blood_group;
		this.address = address;
		this.username = username;
		this.password = password;
		this.mobile = mobile;
		this.email = email;
		this.age = age;
		this.subscribe = subscribe;
		this.role = role;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getBlood_group() {
		return blood_group;
	}


	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public long getMobile() {
		return mobile;
	}


	public void setMobile(long mobile) {
		this.mobile = mobile;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Boolean getSubscribe() {
		return subscribe;
	}


	public void setSubscribe(Boolean subscribe) {
		this.subscribe = subscribe;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", gender=" + gender + ", blood_group=" + blood_group
				+ ", address=" + address + ", username=" + username + ", password=" + password + ", mobile=" + mobile
				+ ", email=" + email + ", age=" + age + ", subscribe=" + subscribe + ", role=" + role + "]";
	}
	
}
