package com.stackroute.movieservice;
import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.stackroute.movieservice.domain.Movie;
import com.stackroute.movieservice.repository.MovieRepository;
import com.stackroute.movieservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

@SpringBootApplication
public class MovieServiceApplication  {

	public static void main(String[] args) {
		SpringApplication.run(MovieServiceApplication.class, args);
	}
}

//	"id": 1,
//			"title": "3idiots",
//			"language": "hindi",
//			"comments": "best movie"
//},
//		{
//		"id": 2,
//		"title": "Guru",
//		"language": "hindi",
//		"comments": "avg movie"
//		},
//		{
//		"id": 3,
//		"title": "Devdas",
//		"language": "hindi",
//		"comments": "awesome movie"
//		}
//		]



