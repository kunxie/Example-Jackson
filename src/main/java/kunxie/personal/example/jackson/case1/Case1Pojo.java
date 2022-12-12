package kunxie.personal.example.jackson.case1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Case1Pojo {

  @JsonProperty("string_attribute_1")
  private String stringAttribute1;
  @JsonProperty("num_attribute")
  private int num_attribute;
  @JsonDeserialize(converter = PayloadDeserializerConverter.class)
  @JsonSerialize(converter = PayloadSerializerConverter.class)
  @JsonProperty("string_object_attribute")
  private List<Payload> payload;

  @Setter
  @Getter
  @ToString
  public static class Payload {

    @JsonProperty("attr_x")
    private String attrX;
    @JsonProperty("attr_y")
    private int attrY;
  }
}
