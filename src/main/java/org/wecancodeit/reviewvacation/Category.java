package org.wecancodeit.reviewvacation;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue
	private long id;

	private String name;
	private String imageUrl;

	public String getImageUrl() {
		return imageUrl;
	}

	@OneToMany(mappedBy = "category")
	private Collection<Review> reviews;

	public Category() {
	}

	public Category(String name, String imageUrl) {
		this.name = name;
		this.imageUrl = imageUrl;
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

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Collection<Review> getReviews() {
		return reviews;
	}

	@Override
	public int hashCode() {
		return ((Long) id).hashCode();
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setReviews(Collection<Review> reviews) {
		this.reviews = reviews;
	}
}
