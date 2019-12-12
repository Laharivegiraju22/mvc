package com.mindtree.mystayapplication.dto;

public class RoomDto {
	private int roomId;
	private String roomType;
	
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	@Override
	public String toString() {
		return "RoomDto [roomId=" + roomId + ", roomType=" + roomType + "]";
	}
	
}
