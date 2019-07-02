package com.example.demo;

public class PlayerInfo {
	private int pId;
	private String pName;
	private String pType;
	public PlayerInfo() {
		super();
	}
	public PlayerInfo(int pId, String pName, String pType) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pType = pType;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpType() {
		return pType;
	}
	public void setpType(String pType) {
		this.pType = pType;
	}
	@Override
	public String toString() {
		return "PlayerInfo [pId=" + pId + ", pName=" + pName + ", pType=" + pType + "]";
	}
	

}
