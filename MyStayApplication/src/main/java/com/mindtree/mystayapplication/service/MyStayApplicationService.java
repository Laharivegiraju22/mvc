package com.mindtree.mystayapplication.service;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.mystayapplication.dto.HotelDto;
import com.mindtree.mystayapplication.dto.RoomDto;
import com.mindtree.mystayapplication.dto.UserDto;
import com.mindtree.mystayapplication.entity.Booking;
import com.mindtree.mystayapplication.entity.Hotel;
import com.mindtree.mystayapplication.entity.Room;
import com.mindtree.mystayapplication.entity.User;

@Service
public interface MyStayApplicationService {

	List<HotelDto> getHotels(String location, String roomType);

	UserDto addToDb(String userName,String email);

	

	//List<RoomDto> getRooms(int hotelId, String roomType);

	
	void addBookings(int roomId, int hotelId, User user, Date date, String time);

}
