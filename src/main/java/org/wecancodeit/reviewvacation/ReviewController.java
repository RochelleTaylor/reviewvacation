package org.wecancodeit.reviewvacation;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {

	@Resource
	ReviewRepository reviewRepo;

	@Resource
	CategoryRepository categoryRepo;

	@RequestMapping(value = "review")
	public String getAReview(@RequestParam Long id, Model model) {
		model.addAttribute("review", reviewRepo.findOne(id));
		return "review";
	}

	@RequestMapping(value = "/reviews")
	public String reviews(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews";
	}

	@RequestMapping(value = "categories")
	public String getAllCategories(Model model) {
		model.addAttribute("categories", categoryRepo.findAll());
		return "categories";
	}

	@RequestMapping(value = "reviewcategory")
	public String getACategory(@RequestParam Long id, Model model) {
		model.addAttribute("category", categoryRepo.findOne(id));
		return "reviewcategory";
	}

}
