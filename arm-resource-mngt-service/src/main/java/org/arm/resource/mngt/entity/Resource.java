package org.arm.resource.mngt.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Resource {

	@Id
	private int resourceId;
	private String resourceName;
	private String resourceType;
	private String availability;
	private Timestamp createDate;
	private Timestamp updateDate;
	private int isDeleted;
	
	
}
