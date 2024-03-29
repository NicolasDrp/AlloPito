package co.simplon.allopito.presentation.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.allopito.business.dto.UserDto;
import co.simplon.allopito.business.service.user.IUserService;

@RestController
@CrossOrigin
public class GetUsersController {

	private IUserService service;

	/**
	 * Retrieves all users.
	 *
	 * @return A list of DTOs representing all users.
	 */
	@GetMapping("/users")
	public List<UserDto> getUsers() {
		return service.getUsers();
	}

	/**
	 * Sets the user service for this controller.
	 *
	 * @param service The user service to be set.
	 */
	@Autowired
	public void setService(IUserService service) {
		this.service = service;
	}
	
}
