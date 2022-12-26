package kunxie.personal.example.jackson.case3;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import kunxie.personal.example.jackson.case3.models.Item;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Map;

import static java.util.stream.Collectors.toMap;
import static kunxie.personal.example.jackson.util.Utility.forJsonString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Case3 {
  private final static String path = "src/main/resources/case3.json";

  public static void main(String[] args) throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();

    String jsonString = forJsonString(path);
    System.out.println("jsonString: ----------");
    System.out.println(jsonString);

    Map<String, String> result = objectMapper
        .readValue(jsonString, new TypeReference<Map<String, Item>>() {})
        .entrySet()
        .stream()
        .collect(toMap(Map.Entry::getKey, entry -> entry.getValue().getTarget()));
    System.out.println("result: ----------");
    System.out.println(result);

    System.out.println("serializedString: ----------");
    System.out.println(objectMapper.writeValueAsString(result));
  }
}
