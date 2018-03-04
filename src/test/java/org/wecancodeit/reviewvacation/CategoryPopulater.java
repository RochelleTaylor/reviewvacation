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
		Category beaches = new Category("beaches", "/images/barbuda.jpg");
		beaches = categoryRepo.save(beaches);
		Review caribbeans = new Review("Caribbeans", beaches,
				"\"The Caribbean is a region that consists of the Caribbean Sea, its islands and the surrounding coasts. The region is southeast of the Gulf of Mexico and the North American mainland, east of Central America, and north of South America.\",",
				"/images/barbuda.jpg");
		caribbeans = reviewRepo.save(caribbeans);
		Review greece = new Review("Greece", beaches,
				"			\"Greece has the longest coastline in Europe and is the southernmost country in Europe. The mainland has rugged mountains, forests, and lakes, but the country is well known for the thousands of islands dotting the blue Aegean Sea to the east, the Mediterranean Sea to the south, and the Ionian Sea to the west\",\r\n"
						+ "",
				"/images/santorini.jpg");
		greece = reviewRepo.save(greece);
		Review hawaii = new Review("Hawaii", beaches, "Beautiful scenerey, total relaxation and fun for all!",
				"./images/hawaii.jpg");
		hawaii = reviewRepo.save(hawaii);
		Category mountains = new Category("mountains", "./images/kirkjufell.jpg");
		mountains = categoryRepo.save(mountains);
		Review smokeymountains = new Review("Smokey Mountains", mountains,

				"The Great Smoky Mountains are a mountain range rising along the Tennessee–North Carolina border in the southeastern United States. They are a subrange of the Appalachian Mountains, and form part of the Blue Ridge Physiographic Province",
				"./images/smokey.jpg");// clickable links
		smokeymountains = reviewRepo.save(smokeymountains); // in html
		Review kirkjufell = new Review("Iceland", mountains,
				"Grundarfjörður's beautiful landmark is the most photographed mountain in Iceland. Its isolated position jutting out into the sea makes it a focal point for tourists and seamen alike. Surrounded by beaches, Kirkjufell has a lovely walking trail around it as well as a more challenging climb up to the top where bird and fish fossils can be found guide is recommended",
				"./images/kirkjufell.jpg");
		kirkjufell = reviewRepo.save(kirkjufell);
		Review Denali = new Review("Alaska", mountains,
				"Home to North America’s tallest peak, Denali has been a mecca for mountaineering and adventuring for more than a century. Today, the park continues to enchant climbers, pack-rafters, skiers, dog mushers and athletes seeking to test themselves against the raw, unchecked power of a truly wild landscape",
				"./images/Denali.jpg");
		Denali = reviewRepo.save(Denali);

	}
}
