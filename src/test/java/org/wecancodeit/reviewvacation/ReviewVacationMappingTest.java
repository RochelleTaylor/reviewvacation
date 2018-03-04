package org.wecancodeit.reviewvacation;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class ReviewVacationMappingTest {

	@Resource
	private TestEntityManager entityManager;

	@Resource
	private ReviewRepository reviewRepo;

	@Resource
	private CategoryRepository categoryRepo;

	@Test
	public void shouldSaveAndLoadReview() {
		Review review = new Review("Movie", "By genre", "imageUrl");
		review = reviewRepo.save(review);
		long reviewId = review.getId();
		entityManager.flush();
		entityManager.clear();
		review = reviewRepo.findOne(reviewId);
		assertThat(review.getTitle(), is("Carribeans"));
	}

	@Test
	public void shouldSaveAndLoadCategory() {
		Category category = new Category("Is Sunny");
		category = categoryRepo.save(category);
		long categoryId = category.getId();
		entityManager.flush();
		entityManager.clear();
		category = categoryRepo.findOne(categoryId);
		assertThat(category.getName(), is("Is Sunny"));
	}

	@Test
	public void shouldSaveAndLoadAReviewWithACategory() {
		Category category = new Category("Is Sunny");
		category = categoryRepo.save(category);
		Review review = new Review("Carribeans", category, "Is Sunny", "imageUrl");
		review = reviewRepo.save(review);
		long reviewId = review.getId();
		entityManager.flush();
		entityManager.clear();
		review = reviewRepo.findOne(reviewId);

		assertThat(review.getCategory().getName(), is("Is Sunny"));

	}
	// @Test
	// public void shouldSaveTagToReviewRelationship() {
	// Review review = new Review("Carribbeans","Is Sunny","imageUrl");
	// review = courseRepo.save

}
