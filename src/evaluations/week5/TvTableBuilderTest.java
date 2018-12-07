package evaluations.week5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;


class TvTableBuilderTest {

    private TvTableBuilder builder = new TvTableBuilder();
    private List<String> expected = Arrays.asList("leg", "leg", "leg", "leg", "shelf", "top");

    @Test
    void build() {
        TvTable tvTable = builder.build();
        List<String> parts = tvTable.getParts();
        Assertions.assertLinesMatch(expected, parts);

    }
    @Test
    void isNotEmpty(){
        TvTable tvTable = builder.build();
        Assertions.assertNotNull(tvTable);
    }
}