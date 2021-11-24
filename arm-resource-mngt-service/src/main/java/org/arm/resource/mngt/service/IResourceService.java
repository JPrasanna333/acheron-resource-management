package org.arm.resource.mngt.service;

import java.util.List;

import org.arm.resource.mngt.entity.Resource;

public interface IResourceService {
	public List<Resource> getAllResource();
	
	public void allocateTask(int taskId,int resourceId);

}
