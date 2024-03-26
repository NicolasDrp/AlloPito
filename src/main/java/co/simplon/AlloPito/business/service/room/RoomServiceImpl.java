package co.simplon.AlloPito.business.service.room;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.AlloPito.business.convert.RoomConvert;
import co.simplon.AlloPito.business.dto.RoomDto;
import co.simplon.AlloPito.persistence.repository.IRoomRepository;

@Service
public class RoomServiceImpl implements IRoomService {

	private IRoomRepository repo;

	@Override
	public List<RoomDto> getRooms() {
		return RoomConvert.getInstance().convertListEntityToListDto(repo.findAll());
	}

	@Override
	public RoomDto getRoomById(final int id) {
		return RoomConvert.getInstance().convertEntityToDto(repo.getReferenceById(id));
	}

	@Override
	public RoomDto postRoom(RoomDto room) {
		return RoomConvert.getInstance()
				.convertEntityToDto(repo.save(RoomConvert.getInstance().convertDtoToEntity(room)));
	}

	@Override
	public void deleteRoom(RoomDto room) {
		repo.delete(RoomConvert.getInstance().convertDtoToEntity(room));
	}

	@Autowired
	public void setRepo(IRoomRepository repo) {
		this.repo = repo;
	}

}
