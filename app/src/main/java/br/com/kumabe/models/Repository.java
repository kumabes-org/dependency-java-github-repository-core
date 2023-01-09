package br.com.kumabe.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "repositories")
public class Repository implements Serializable {
	private static final long serialVersionUID = -9041038079905647679L;

	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "node_id")
	private String nodeId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "full_name")
	private String fullName;
	
	@Column(name = "private")
	private Boolean repositoryPrivate;
		
	@ManyToOne
	@JoinColumn(name = "owner_id")
	private Owner owner;

	public Repository() {
	}

	public Repository(Long id, String nodeId, String name, String fullName, Boolean repositoryPrivate, Owner owner) {
		super();
		this.id = id;
		this.nodeId = nodeId;
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

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
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

	public void setRepositoryPrivate(Boolean repositoryPrivate) {
		this.repositoryPrivate = repositoryPrivate;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
}
