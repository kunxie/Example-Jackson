package kunxie.personal.example.jackson.case1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.StdConverter;

import java.util.List;

public class PayloadSerializerConverter extends StdConverter<List<Case1Pojo.Payload>, String> {

  private static final ObjectMapper objectMapper = new ObjectMapper();

  @Override
  public String convert(List<Case1Pojo.Payload> value) {
    try {
      return objectMapper.writeValueAsString(value);
    } catch (JsonProcessingException e) {
      System.err.println("unable to process the List<Payload> Object: " + value);
      return null;
    }
  }
}
