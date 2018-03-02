package org.wecancodeit.reviewvacation;

import java.util.Collection;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Category {

	@Id
	@GeneratedValue
	private long id;

	@OneToMany(mappedBy = "Category")
	private Collection<Review> reviews;

	private String type;

	public Collection<Review> getReviews() {
		return reviews;
	}

	@SuppressWarnings("unused")

	private Category() {
	}

	public long getId() {
		return id;
	}

	public Category(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	@Override
	public int hashCode() {
		return ((Long) id).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		return id == ((Category) obj).id;
	}
}