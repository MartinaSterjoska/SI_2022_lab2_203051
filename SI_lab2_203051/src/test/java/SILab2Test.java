import org.junit.jupiter.api.Test;

import java.io.LineNumberInputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

@Test
void everyBranch(){
    List<String> list1 = List.of();
    List<String> list2 = List.of("0", "#");
    List<String> list3 = List.of("0","#","#","#","0","#","0","#","#");

    IllegalArgumentException notPerfect, notGreater, square;

    notGreater = assertThrows(IllegalArgumentException.class, () -> SILab2.function(list1));
    assertTrue(notGreater.getMessage().contains("List length should be greater than 0"));

    notPerfect = assertThrows(IllegalArgumentException.class, () -> SILab2.function(list2));
    assertTrue(notPerfect.getMessage().contains("List length should be a perfect square"));

    square = assertThrows(IllegalArgumentException.class, () -> SILab2.function(list3));
    assertEquals(list3, square);
}
}
