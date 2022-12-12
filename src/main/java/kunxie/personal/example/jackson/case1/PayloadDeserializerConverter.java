package kunxie.personal.example.jackson.case1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.StdConverter;

import java.util.List;

public class PayloadDeserializerConverter extends StdConverter<String, List<Case1Pojo.Payload>> {

  private static final ObjectMapper objectMapper = new ObjectMapper();
  @Override
  public List<Case1Pojo.Payload> convert(String value) {
    try {
      return objectMapper.readValue(value, new TypeReference<List<Case1Pojo.Payload>>() {});
    }
    catch (JsonProcessingException ex) {
      System.err.println("unable to process the String: " + value);
      return null;
    }
  }
}
