import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("String 학습 테스트")
public class StringTest {

    @Test
    @DisplayName("1,2 가 들어왔을 때 1과 2로 분리되어 리턴")
    public void splitOfCommaValue(){
        String commaValue = "1,2";
        String[] splitResult = commaValue.split(",");
        Assertions.assertThat(splitResult).containsExactly("1", "2");
    }

    @Test
    @DisplayName("1 이 들어왔을 때 1만을 포함하는 배열로 리턴")
    public void splitOfOneLengthString() {
        String oneLengthValue = "1";
        String[] splitResult = oneLengthValue.split(",");
        Assertions.assertThat(splitResult).contains("1");
    }
}
