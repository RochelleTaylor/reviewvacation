package org.wecancodeit.reviewvacation;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CategoryPopulater implements CommandLineRunner {

	@Resource
	private ReviewRepository reviewRepo;

	@Resource
	private CategoryRepository categoryRepo;

	@Override
	public void run(String... args) throws Exception {
		Category beaches = new Category("beaches");
		beaches = categoryRepo.save(beaches);
		Review florida = new Review("Florida", beaches, "Is warm......", "imageUrl");
		florida = reviewRepo.save(florida);
		Category mountains = new Category("mountains");
		mountains = categoryRepo.save(mountains);
		Review smokeymountains = new Review("Smokey Mountains", mountains, "Misty.....", "imageUrl");// clickable links
																										// in html

	}
}
