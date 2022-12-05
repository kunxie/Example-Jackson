package kunxie.personal.example.jackson.case1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static kunxie.personal.example.jackson.util.Utility.forJsonString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
class Case1 {
  private final static String path = "src/main/resources/Case1_json.json";
  public static void main(String[] args) throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();

    String jsonString = forJsonString(path);
    System.out.println("jsonString: ----------");
    System.out.println(jsonString);

    Case1Pojo pojo = objectMapper.readValue(jsonString, new TypeReference<Case1Pojo>() {});
    System.out.println("pojo: ----------");
    System.out.println(pojo);
  }
}
