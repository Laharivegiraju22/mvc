package com.mindtree.mystayapplication.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.mystayapplication.dto.RoomDto;
import com.mindtree.mystayapplication.entity.Booking;
import com.mindtree.mystayapplication.entity.Room;
import com.mindtree.mystayapplication.entity.User;
import com.mindtree.mystayapplication.service.MyStayApplicationService;
import com.mindtree.mystayapplication.service.serviceimplementation.MyStayApplicationServiceImplementation;

@Controller
//@RestController
public class MyStayApplicationController {

	@Autowired
	MyStayApplicationService mystayService = new MyStayApplicationServiceImplementation();

	@RequestMapping("/")
	public String helloPage() {
		return "index";
	}

	@RequestMapping("/successful")
	public String register(@RequestParam String userName, String email, Model model) {

		model.addAttribute("users", mystayService.addToDb(userName, email));

		return "successful";
	}

	@RequestMapping("/booking")
	public String getHotels(@RequestParam String location, String roomType, Model model) {
		model.addAttribute("Hotel", mystayService.getHotels(location, roomType));

		return "booking";
	}

//	@RequestMapping("/searchRoom")
//	public String SearchRoom(@RequestParam int hotelId, String roomType, Model model) {
//		// return mystayService.getRooms(hotelId, roomType);
//		model.addAttribute("rooms", mystayService.getRooms(hotelId, roomType));
//		model.addAttribute("hotelId", hotelId);
//		return "successful";
//	}

//	@RequestMapping("booking")
//	public String BookRoom(@RequestParam User user, int roomId, int hotelId, Date date, String time, Model model) {
//
//		mystayService.addBookings(roomId, hotelId, user, date, time);
//		return "booking";
//	}

}
