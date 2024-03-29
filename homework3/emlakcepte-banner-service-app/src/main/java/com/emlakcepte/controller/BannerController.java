package com.emlakcepte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emlakcepte.model.Banner;
import com.emlakcepte.service.BannerService;

@RestController
/*
 * class bazında end-point(uygulumanın dışarıya açılan noktaları) tanımları için
 * kullanılaiblir
 */
@RequestMapping(value = "/banners") 
public class BannerController {

	@Autowired
	private BannerService bannerService;

	@PostMapping
	public Banner create(@RequestBody Banner banner) {
		bannerService.create(banner);
		return banner;
	}

	@GetMapping
	public List<Banner> getAll() {
		return bannerService.getAll();	
	}

}
