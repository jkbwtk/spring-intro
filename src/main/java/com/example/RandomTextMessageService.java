package com.example;

import org.springframework.stereotype.Component;

@Component("messageServiceRandom")
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

  @Override
  public String getMessage() {
    return words[(int) (Math.random() * words.length)];
  }
}
