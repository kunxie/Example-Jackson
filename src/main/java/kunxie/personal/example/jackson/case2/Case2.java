package kunxie.personal.example.jackson.case2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.List;
import java.util.Map;

import static kunxie.personal.example.jackson.util.Utility.forJsonString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Case2 {
  private final static String path = "src/main/resources/case2.json";

  public static void main(String[] args) throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();

    String jsonString = forJsonString(path);
    System.out.println("jsonString: ----------");
    System.out.println(jsonString);

    Map<String, List<String>> pojo = objectMapper.readValue(jsonString, new TypeReference<Map<String, List<String>>>() {});
    System.out.println("pojo: ----------");
    System.out.println(pojo);

    MultiValueMap<String, String> map = new LinkedMultiValueMap<>(pojo);
    map.forEach((key, value) -> System.out.println("key:" + key + " -> " + "value: " + value));
    System.out.println(map);

    String serializedString = objectMapper.writeValueAsString(pojo);
    System.out.println("serializedString: ----------");
    System.out.println(serializedString);
  }
}
