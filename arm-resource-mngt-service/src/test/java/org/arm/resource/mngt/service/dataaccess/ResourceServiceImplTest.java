package org.arm.resource.mngt.service.dataaccess;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.arm.resource.mngt.ArmRMSApplication;
import org.arm.resource.mngt.entity.Resource;
import org.arm.resource.mngt.repository.ResourceRepository;
import org.arm.resource.mngt.service.ResourceService;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = ArmRMSApplication.class)
@Transactional
public class ResourceServiceImplTest {

	@InjectMocks
	ResourceService resourceService;

	@Mock
	private ResourceRepository resourceRepository;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@After
	public void tearDown() throws Exception {
	}	

	@Test
	@DisplayName("Testing Resource")
	public void getAllResources() {
		List<Resource> resource = new ArrayList<>();
		Resource e = new Resource(1, "Gunalan", "Manager", "Custom", Timestamp.valueOf("2020-03-27 09:03:01"),
				Timestamp.valueOf("2020-04-27 09:03:01"), 0);
		resource.add(e);

		when(resourceRepository.findAll()).thenReturn(resource);
		List<Resource> actual = resourceService.getAllResource();

		assertEquals(actual.size(), 1);

	}

}
