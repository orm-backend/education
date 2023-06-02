package ru.mtsbank.education.port.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.Hibernate;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
@MappedSuperclass
abstract class BaseEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	protected Integer id;

	@CreationTimestamp
	@Column(name = "created_at", nullable = false)
	protected LocalDateTime createdAt;

	@UpdateTimestamp
	@Column(name = "updated_at")
	protected LocalDateTime updatedAt;

	@Override
	public int hashCode() {
		return Objects.hash(Hibernate.getClass(this), id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (Hibernate.getClass(this) != Hibernate.getClass(obj))
			return false;
		BaseEntity other = (BaseEntity) obj;
		return id != null && Objects.equals(id, other.id);
	}

}
