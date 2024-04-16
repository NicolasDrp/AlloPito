package co.simplon.allopito.business.service.user;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.allopito.business.convert.UserConvert;
import co.simplon.allopito.business.dto.UserDto;
import co.simplon.allopito.persistence.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService
//, UserDetailsService 
{

	private IUserRepository repo;

	@Override
	public List<UserDto> getUsers() {
		return UserConvert.getInstance().convertListEntityToListDto(repo.findAll());
	}

	@Override
	public UserDto getUserById(int id) {
		return UserConvert.getInstance().convertEntityToDto(repo.getReferenceById(id));
	}

	@Override
	public UserDto postUser(UserDto userDto) throws IllegalArgumentException {

        
		return UserConvert.getInstance()
				.convertEntityToDto(repo.save(UserConvert.getInstance().convertDtoToEntity(userDto)));
	}

	@Override
	public void deleteUser(UserDto userDto) {
		repo.delete(UserConvert.getInstance().convertDtoToEntity(userDto));
	}

//	@Override
//	public UserDetails loadUserByUsername(String username) {
//		User user = repo.loadUserByUsername(username);
//		if (user == null) {
//			throw new UsernameNotFoundException("User not found with username: " + username);
//		}
//		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
//				getAuthorities(user));
//	}

//	private Set<GrantedAuthority> getAuthorities(User user) {
//		Set<GrantedAuthority> authorities = new HashSet<>();
//		authorities.add(new SimpleGrantedAuthority(user.getRoleUSer()));
//		return authorities;
//	}

	@Autowired
	public void setRepo(IUserRepository repo) {
		this.repo = repo;
	}

}
