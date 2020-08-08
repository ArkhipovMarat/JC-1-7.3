import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class GenericTest {
    @Test
    public void genericTest() {
        String inputParameter1 = "Нетология";
        Integer inputParameter2 = 1;

        Box<String> sample1 = new Box<>(inputParameter1);
        Box<Integer> sample2 = new Box<>(inputParameter2);

//        Assertions.assertEquals(sample1.getClass(),sample2.getClass());

        assertThat(Box.class,typeCompatibleWith(sample2.getClass()));
        assertThat(Box.class,typeCompatibleWith(sample1.getClass()));
    }
}
