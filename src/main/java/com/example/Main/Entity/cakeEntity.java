package com.example.Main.Entity;

import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	@Table(name = "my_Order")
	public class cakeEntity {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="id",length=45)
		private int id;
		@Column(name="name",length=255)
		private String  name;
		@Column(name="email",length =255)
		private String email;
		
		@Column(name="phone",length=255)
		
		private String phone;
		@Column(name="address",length=255)
		private String address;
		
		@Column (name="type",length=255)
		private String type ;
		@Column(name="qty",length=255)
		private String qty;
		
		
		public cakeEntity(int id,String name,String email,String phone,String address, String type,String qty )
		{
			this.id=id;
			this.name=name;
			this.email=email;
			this.phone=phone;
			this.address=address;
			this.type=type;
			this.qty=qty;
			
		}
		
		
		public cakeEntity() {}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getQty() {
			return qty;
		}
		public void setQty(String qty) {
			this.qty = qty;
		}
		
		
		@Override
		public String toString() {
			return "cakeEntity [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address="
					+ address + ", type=" + type + ", qty=" + qty + "]";
		}
	}
		
		
	
		