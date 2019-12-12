package com.mindtree.mystayapplication.dto;

import java.util.List;

public class HotelDto {
	private int hotelId;
	private String hotelName;
	private String location;
	private List<RoomDto> rooms;

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<RoomDto> getRooms() {
		return rooms;
	}

	public void setRooms(List<RoomDto> rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "HotelDto [hotelId=" + hotelId + ", hotelName=" + hotelName + ", location=" + location + ", rooms="
				+ rooms + "]";
	}

}
