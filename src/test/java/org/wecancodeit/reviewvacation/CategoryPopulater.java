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
		Category movies = new Category("Movies");
		movies = categoryRepo.save(movies);
		Review fantasy = new Review("Black Panther", movies,
				"\"Black Panther\" follows T'Challa who, after the events of \"Captain America: Civil War,\" returns home to the isolated, technologically advanced African nation of Wakanda to take his place as King. However, when an old enemy reappears on the radar, T'Challa's mettle as King and Black Panther is tested when he is drawn into a conflict that puts the entire fate of Wakanda and the world at risk",
				"imageUrl");
		fantasy = reviewRepo.save(fantasy);
		Review comedy = new Review("Hot Rod", movies,
				"Amateur stuntman Rod Kimble has a problem--his step-father Frank is a jerk. Frank picks on Rod, tosses him around like a rag doll in their weekly sparring sessions and definitely doesn't respect him, much less his stunts. But, when Frank falls ill, it's up to Rod to stage the jump of his life in order to save his step-father. The plan: Jump 15 buses, raise the money for Frank's heart operation, and then... kick his ass.",
				"imageUrl");
		comedy = reviewRepo.save(comedy);

		// Category mountains = new Category("mountains");
		// mountains = categoryRepo.save(mountains);
		// Review smokeymountains = new Review("Smokey Mountains", mountains,

		// "The Great Smoky Mountains are a mountain range rising along the
		// Tennessee–North Carolina border in the southeastern United States. They are a
		// subrange of the Appalachian Mountains, and form part of the Blue Ridge
		// Physiographic Province",
		// "imageUrl");// clickable links
		// smokeymountains = reviewRepo.save(smokeymountains); // in html

	}
}
