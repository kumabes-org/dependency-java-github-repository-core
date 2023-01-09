package br.com.kumabe.models;

import java.io.Serializable;

public class Repository implements Serializable {
	private Long id;
	private String node_id;
	private String name;
	private String fullName;
	private Boolean repositoryPrivate;
	private Owner owner;

	public Repository() {
	}

	public Repository(Long id, String node_id, String name, String fullName, Boolean repositoryPrivate, Owner owner) {
		super();
		this.id = id;
		this.node_id = node_id;
		this.name = name;
		this.fullName = fullName;
		this.repositoryPrivate = repositoryPrivate;
		this.owner = owner;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNode_id() {
		return node_id;
	}

	public void setNode_id(String node_id) {
		this.node_id = node_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Boolean getRepositoryPrivate() {
		return repositoryPrivate;
	}

	public void setRepository_private(Boolean repositoryPrivate) {
		this.repositoryPrivate = repositoryPrivate;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

}
