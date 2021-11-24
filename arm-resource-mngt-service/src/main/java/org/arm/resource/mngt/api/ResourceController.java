package org.arm.resource.mngt.api;

import java.util.List;

import org.arm.resource.mngt.entity.Resource;
import org.arm.resource.mngt.service.IResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
	@Autowired
	private IResourceService resourceService;

	@GetMapping("/resource")
	public List<Resource> getAllResource() {
		return resourceService.getAllResource();
	}
	@GetMapping("/allocate/{taskId}/{resourceId}")
	public void allocateTask(@PathVariable int taskId,@PathVariable int resourceId) {
		resourceService.allocateTask(taskId,resourceId);
	}
}