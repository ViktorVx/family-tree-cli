package org.pva.familytreecli;

import lombok.RequiredArgsConstructor;
import org.pva.familytreecli.graph.AppGraph;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

import static java.lang.System.exit;

@SpringBootApplication
@RequiredArgsConstructor
public class FamilyTreeCliApplication implements CommandLineRunner {

	private final AppGraph appGraph;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(FamilyTreeCliApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}

	@Override
	public void run(String... args) {
		var scanner = new Scanner(System.in);
		var info = "";
		while (true) {
			info = scanner.nextLine();
			if (info.equals("exit")) {
				exit(0);
			}
			System.out.println(info);
		}
	}
}
