package org.wecancodeit.reviewvacation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Review {

	@Id
	@GeneratedValue
	private long id;

	@ManyToOne
	private Category category;

	// public String getType() {
	// return type;
	// }

	// private String type;
	private String imageUrl;

	private String title;

	public Category getCategory() {
		return category;
	}

	public String getTitle() {
		return title;
	}

	@Lob
	private String description;

	public long getId() {
		return id;
	}

	public Review() {
	}

	public Review(String title, Category category, String description, String imageUrl) {
		this.title = title;
		this.category = category;
		this.description = description;
		this.imageUrl = imageUrl;
	}

	public Review(String title, String description, String imageUrl) {
		this.title = title;
		this.description = description;
		this.imageUrl = imageUrl;
	}

	public String getDescription() {
		return description;
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
		return id == ((Review) obj).id;
	}
}
