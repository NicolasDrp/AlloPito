package co.simplon.allopito.controller;

import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import co.simplon.allopito.business.dto.BedDto;
import co.simplon.allopito.business.service.bed.IBedService;
import co.simplon.allopito.presentation.controller.bed.DeleteBedController;
import co.simplon.allopito.presentation.controller.bed.GetBedByIdController;
import co.simplon.allopito.presentation.controller.bed.GetBedsController;
import co.simplon.allopito.presentation.controller.bed.GetEmptyBedByServiceController;
import co.simplon.allopito.presentation.controller.bed.PostBedController;

@ExtendWith(MockitoExtension.class)
class BedControllerTest {
	
	@Mock
	private IBedService service;

	@InjectMocks
	private GetBedsController getBedsController;

	@InjectMocks
	private GetBedByIdController getBedByIdController;

	@InjectMocks
	private PostBedController postBedController;

	@InjectMocks
	private DeleteBedController deleteBedController;
	
	@InjectMocks
	private GetEmptyBedByServiceController getEmptyBedByServiceController;

	BedDto bedDto = new BedDto();

	@Test
	void getBedsController() {
		try {
			getBedsController.getBeds();
			verify(service, times(1)).getBeds();
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void getBedByIdController() {
		try {
			getBedByIdController.getBedById(1);
			verify(service, times(1)).getBedById(1);
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void postBedController() {
		try {
			postBedController.postBed(bedDto);
			verify(service, times(1)).postBed(bedDto);
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void deleteBedController() {
		try {
			deleteBedController.deleteBed(bedDto);
			verify(service, times(1)).deleteBed(bedDto);
		} catch (Exception e) {
			fail(e);
		}
	}
	
	@Test
	void getEmptyBedByServiceController() {
		try {
			getEmptyBedByServiceController.getEmptyBedsByService(1);
			verify(service, times(1)).getEmptyBedsByService(1);
		} catch (Exception e) {
			fail(e);
		}
	}

}
