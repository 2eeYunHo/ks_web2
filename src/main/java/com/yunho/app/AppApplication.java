package com.yunho.app;

import com.yunho.app.entity.*;
import com.yunho.app.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {
	private final PersonRepository personRepository;
	private final SocialMediaRepository socialMediaRepository;
	private final InterestsRepository interestsRepository;
	private final SkillRepository skillRepository;
	private final WorkRepository workRepository;

	public AppApplication(PersonRepository personRepository, SocialMediaRepository socialMediaRepository, InterestsRepository interestsRepository, SkillRepository skillRepository, WorkRepository workRepository){
		this.personRepository = personRepository;
		this.socialMediaRepository = socialMediaRepository;
		this.interestsRepository = interestsRepository;
		this.skillRepository = skillRepository;
		this.workRepository = workRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		personRepository.save(new Person("이윤호", "모바일","hello@test.com", "010-1234-5678"));
		socialMediaRepository.save(new SocialMedia("anonymous", "anonymous"));
		interestsRepository.save(new Interests("게임하기"));
		interestsRepository.save(new Interests("음악감상"));
		skillRepository.save(new Skill("C", 30));
		skillRepository.save(new Skill("JAVA",40));
		workRepository.save(new Work("모바일 개발자", "N사", "0.5년","개발도중 잘림..."));
		workRepository.save(new Work("Web 개발자", "G사", "~ing", "웹 관리를 하는중"));

	}

}