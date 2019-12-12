package com.mindtree.mystayapplication.service.serviceimplementation;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.mystayapplication.dto.BookingDto;
import com.mindtree.mystayapplication.dto.HotelDto;
import com.mindtree.mystayapplication.dto.RoomDto;
import com.mindtree.mystayapplication.dto.UserDto;
import com.mindtree.mystayapplication.entity.Booking;
import com.mindtree.mystayapplication.entity.Hotel;
import com.mindtree.mystayapplication.entity.Room;
import com.mindtree.mystayapplication.entity.User;
import com.mindtree.mystayapplication.repository.BookingRepository;
import com.mindtree.mystayapplication.repository.HotelRepository;
import com.mindtree.mystayapplication.repository.RoomRepository;

import com.mindtree.mystayapplication.repository.UserRepository;
import com.mindtree.mystayapplication.service.MyStayApplicationService;

@Service
public class MyStayApplicationServiceImplementation implements MyStayApplicationService {

	@Autowired
	HotelRepository hotelRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	RoomRepository roomRepository;

//	@Override
//	public List<Hotel> getHotels(String location, String roomType) {
//		List<Hotel> hotels = new ArrayList<Hotel>();
//		List<Hotel> newHotelList = new ArrayList<Hotel>();
//		hotels = hotelRepository.findAll();
//		for (Hotel h : hotels) {
//			if (h.getLocation().equals(location)) {
//				newHotelList.add(h);
//			}
//		}
//		return newHotelList;
//	}

	@Override
	public UserDto addToDb(String userName, String email) {
		User user = new User();
		user.setUserName(userName);
		user.setEmail(email);
		userRepository.save(user);
		List<User> userList = userRepository.findAll();
		for (User us : userList) {
			if (us.getUserName().equals(userName)) {
				user = us;
			}

		}
		UserDto udto = new UserDto();
		User u = userRepository.getOne(user.getUserId());
		udto.setUserId(u.getUserId());
		udto.setUserName(u.getUserName());
		udto.setEmail(u.getEmail());
		return udto;
	}

	@Override
	public List<HotelDto> getHotels(String location, String roomType) {
		List<HotelDto> hotelDtos = new ArrayList<HotelDto>();
		List<RoomDto> roomDtos = new ArrayList<RoomDto>();
		List<Hotel> hotels = hotelRepository.findAll();
		HotelDto hotelDto = new HotelDto();
		for (Hotel h : hotels) {
			if (h.getLocation().equalsIgnoreCase(location)) {
				hotelDto.setHotelId(h.getHotelId());
				hotelDto.setHotelName(h.getHotelName());
				hotelDto.setLocation(h.getLocation());
				List<Room> rooms = roomRepository.findAll();
				for (Room room : rooms) {
					if (room.getHotel().getHotelId() == h.getHotelId()) {
						if (room.getRoomType().equalsIgnoreCase(roomType)) {
							RoomDto roomDto = new RoomDto();
							roomDto.setRoomId(room.getRoomId());
							roomDto.setRoomType(room.getRoomType());
							roomDtos.add(roomDto);

						}

					}
				}
				hotelDto.setRooms(roomDtos);
			}
			hotelDtos.add(hotelDto);
		}
		return hotelDtos;
	}

//	@Override
//	public List<RoomDto> getRooms(int hotelId, String roomType) {
//		List<RoomDto> newRooms = new ArrayList<RoomDto>();
//		List<Room> rooms = new ArrayList<Room>();
//		rooms = roomRepository.findAll();
//		for (Room r : rooms) {
//			if (r.getHotel().getHotelId() == hotelId) {
//				if (r.getRoomType().equals(roomType)) {
//					RoomDto rDto = new RoomDto();
//					rDto.setRoomId(r.getRoomId());
//					rDto.setRoomType(r.getRoomType());
//					newRooms.add(rDto);
//				}
//			}
//		}
//		return newRooms;
//	}

	@Override
	public void addBookings(int roomId, int hotelId, User user, Date date, String time) {
		List<BookingDto> bookings = new ArrayList<BookingDto>();
		Booking b = new Booking();
		Room r = roomRepository.getOne(roomId);
		Hotel h = hotelRepository.getOne(hotelId);

		b.setRoom(r);
		b.setUser(user);
		b.setHotel(h);
		b.setDate(date);
		b.setTime(time);
		bookingRepository.save(b);
	}

}
