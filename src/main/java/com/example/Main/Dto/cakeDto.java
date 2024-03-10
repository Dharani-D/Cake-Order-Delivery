package com.example.Main.Dto;

public class cakeDto {
	
	private int id;
	
    private String name;
	
    private String email;
    
    private String phone;
    
    private String address;
    
    private String type;
    
    private String qty;
    
    
    public cakeDto(int id,String name,String email,String phone,String address, String type,String qty )
	{
		this.id=id;
		this.name=name;
		this.email=email;
		this.phone=phone;
		this.address=address;
		this.type=type;
		this.qty=qty;
		
	}
    public  cakeDto() {}
	
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
	
	
	
	public String toString() {
		return "cakeEntity [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address=" + address
				+ ", type=" + type + ", qty=" + qty + "]";
	}
	
	
}


	