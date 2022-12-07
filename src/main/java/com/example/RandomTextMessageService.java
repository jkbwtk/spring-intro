package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RandomTextMessageService implements MessageService {
  private final String[] words = {
      "Spring",
      "Dependency",
      "Injection",
      "InteliJ",
      "IDEA",
      "Maven",
      "Gradle",
      "Java",
      "Git",
      "GitHub",
  };

  @Bean("messageServiceRandom")

  @Override
  public String getMessage() {
    return words[(int) (Math.random() * words.length)];
  }
}
