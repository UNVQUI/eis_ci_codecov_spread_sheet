package ar.edu.unq;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for simple App.
 */
public class SpreadSheetTest {
    @Test
    void dummyTest() {
        assertThat(1).isEqualTo(1);
    }

    @Test
    public void testSpreadsheetWithA1andA2ValueRetrieving() {
        SpreadSheet sheet = new SpreadSheet();

        sheet.set("a1", "label");
        sheet.set("a2", 1);

        assertThat(sheet.get("a2")).isEqualTo(1);
        assertThat(sheet.get("a1")).isEqualTo("label");

    }
}
