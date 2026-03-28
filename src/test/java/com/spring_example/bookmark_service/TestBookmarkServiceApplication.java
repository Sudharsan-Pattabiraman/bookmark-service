package com.spring_example.bookmark_service;

import org.springframework.boot.SpringApplication;

public class TestBookmarkServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(BookmarkServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
