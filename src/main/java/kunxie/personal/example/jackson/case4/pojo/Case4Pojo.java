package kunxie.personal.example.jackson.case4.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.util.List;


@Getter
@ToString
public class Case4Pojo {
  private List<Person> person;

  @Getter
  @ToString
  public static class Person {
    private String name;
    private String gender;
  }
}
