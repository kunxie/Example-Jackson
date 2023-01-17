package kunxie.personal.example.jackson.case4;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import kunxie.personal.example.jackson.case4.pojo.Case4Pojo;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

import static kunxie.personal.example.jackson.util.Utility.forJsonString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Case4 {

  private final static String arrayPath = "src/main/resources/case4-array.json";
    private final static String objectPath = "src/main/resources/case4-object.json";

  public static void main(String[] args) throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true); /* key configuration */

    String arrayPerson = forJsonString(arrayPath);
    System.out.println("jsonString: ----------");
    System.out.println(arrayPerson);
    List<Case4Pojo> arrayResult = objectMapper.readValue(arrayPerson, new TypeReference<List<Case4Pojo>>() {});
    System.out.println("arrayResult: ----------");
    System.out.println(arrayResult);
    System.out.println("serialized arrayResult: ----------");
    System.out.println(objectMapper.writeValueAsString(arrayResult));

    String objectPerson = forJsonString(objectPath);
    System.out.println("jsonString: ----------");
    System.out.println(objectPerson);
    List<Case4Pojo> objectResult = objectMapper.readValue(objectPerson, new TypeReference<List<Case4Pojo>>() {});
    System.out.println("objectResult: ----------");
    System.out.println(objectResult);
    System.out.println("serialized objectResult: ----------");
    System.out.println(objectMapper.writeValueAsString(objectResult));
  }
}
