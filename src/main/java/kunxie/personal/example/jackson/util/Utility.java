package kunxie.personal.example.jackson.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Utility {
  public static String forJsonString(String path) {
    try {
      return new String(Files.readAllBytes(Paths.get(path)));
    }
    catch (IOException ex) {
      throw new RuntimeException("can't get the json string based on path: " + path, ex);
    }
  }
}
