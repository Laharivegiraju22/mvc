package com.mindtree.mystayapplication.dto;

import java.sql.Date;

import com.mindtree.mystayapplication.entity.Hotel;
import com.mindtree.mystayapplication.entity.Room;
import com.mindtree.mystayapplication.entity.User;

public class BookingDto {
	private int bookingId;
	private Date date;
	private String time;
	private Hotel hotel;
	private User user;
	private Room room;

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "BookingDto [bookingId=" + bookingId + ", date=" + date + ", time=" + time + ", hotel=" + hotel
				+ ", user=" + user + ", room=" + room + "]";
	}

}
