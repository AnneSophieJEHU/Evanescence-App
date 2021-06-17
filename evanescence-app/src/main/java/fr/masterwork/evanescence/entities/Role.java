package fr.masterwork.evanescence.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "t_role", uniqueConstraints = { @UniqueConstraint(columnNames = "role", name = "role_role_UNIQUE"),
	@UniqueConstraint(columnNames = "description", name = "role_description_UNIQUE") }, indexes = {
		@Index(name = "role_id_IDX", columnList = "id") })
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 25, nullable = false)
    private String role;

    @Column(length = 30, nullable = false)
    private String description;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "t_clients_roles", joinColumns = @JoinColumn(name = "idRole"), inverseJoinColumns = @JoinColumn(name = "idClient"))
    private List<Client> clients;

    public Role() {
	// Empty no-arg constructor for JPA
    }

    public Role(Long id, String role, String description) {
	this.id = id;
	this.role = role;
	this.description = description;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getRole() {
	return role;
    }

    public void setRole(String role) {
	this.role = role;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

}