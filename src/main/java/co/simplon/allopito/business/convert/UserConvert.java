package co.simplon.allopito.business.convert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import co.simplon.allopito.business.dto.UserDto;
import co.simplon.allopito.persistence.entity.User;

/**
 * This class provides methods to convert between User entities and DTOs.
 */
@Component
public class UserConvert {

	private static UserConvert instance;

	private UserConvert() {

	}

	/**
	 * Retrieves the singleton instance of UserConvert.
	 *
	 * @return The singleton instance of UserConvert.
	 */
	public static UserConvert getInstance() {
		if (instance == null) {
			instance = new UserConvert();
		}
		return instance;
	}

	/**
	 * Converts a UserDto to a User entity.
	 *
	 * @param dto The UserDto to be converted.
	 * @return The corresponding User entity.
	 * @throws IllegalArgumentException If the input dto is null.
	 */
	public User convertDtoToEntity(UserDto dto) {
		if (dto == null) {
			throw new IllegalArgumentException("UserDto cannot be null");
		}
		User user = new User();
		user.setIdUser(dto.getIdUser());
		user.setFirstnamePatient(dto.getFirstnamePatient());
		user.setLastnameUser(dto.getLastnameUser());
		user.setPassword(dto.getPassword());
		user.setRoleUSer(dto.getRoleUSer());
		user.setUsername(dto.getUsername());

		if (dto.getService() != null) {
			user.setService(ServiceConvert.getInstance().convertDtoToEntity(dto.getService()));
		}
		return user;
	}

	/**
	 * Converts a list of UserDto objects to a list of User entities.
	 *
	 * @param listDto The list of UserDto objects to be converted.
	 * @return The corresponding list of User entities.
	 */
	public List<User> convertListDtoToListEntity(List<UserDto> listDto) {
		List<User> list = new ArrayList<>();
		for (UserDto user : listDto) {
			list.add(convertDtoToEntity(user));
		}
		return list;
	}

	/**
	 * Converts a User entity to a UserDto.
	 *
	 * @param user The User entity to be converted.
	 * @return The corresponding UserDto.
	 * @throws IllegalArgumentException If the input user is null.
	 */
	public UserDto convertEntityToDto(User user) {
		if (user == null) {
			throw new IllegalArgumentException("User cannot be null");
		}
		UserDto dto = new UserDto();
		dto.setIdUser(user.getIdUser());
		dto.setFirstnamePatient(user.getFirstnamePatient());
		dto.setLastnameUser(user.getLastnameUser());
		dto.setPassword(user.getPassword());
		dto.setRoleUSer(user.getRoleUSer());
		dto.setUsername(user.getUsername());

		if (user.getService() != null) {
			dto.setService(ServiceConvert.getInstance().convertEntityToDto(user.getService()));
		}
		return dto;
	}

	/**
	 * Converts a list of User entities to a list of UserDto objects.
	 *
	 * @param list The list of User entities to be converted.
	 * @return The corresponding list of UserDto objects.
	 */
	public List<UserDto> convertListEntityToListDto(List<User> list) {
		List<UserDto> listDto = new ArrayList<>();
		for (User user : list) {
			listDto.add(convertEntityToDto(user));
		}
		return listDto;
	}

}
