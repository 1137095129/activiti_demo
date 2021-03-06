package com.wjf.github.activitidemo.entity;

import lombok.*;

import java.io.Serializable;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class NodeInfo extends NodeBaseInfo implements Serializable {
	private static final long serialVersionUID = 5095052473882781755L;

	private String id;

	private String name;

	private String width;

	private String height;

	private String top;

	private String left;

	private Integer type;

	private Integer path;

	private String userGroup;

}
