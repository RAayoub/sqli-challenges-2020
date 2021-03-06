import challenges.shapes.Shapes;
import org.junit.jupiter.api.BeforeAll;

import java.io.StringWriter;

public class ShapesTest {
 
    private StringWriter out;
    private Shapes shapes;
 
    @BeforeAll
    public void initWriter() {
        out = new StringWriter();
        shapes = new Shapes(out);
    }
 
//    @Test
//    public void square() throws IOException {
//        shapes.area("SQUARE", "30");
//        assertEquals("900\n", out.toString());
//    }
//
//    @Test
//    public void rectangle() throws IOException {
//        shapes.area("RECTANGLE", "50,20");
//        assertEquals("1000\n", out.toString());
//    }
//
//    @Test
//    public void triangle() throws IOException {
//        shapes.area("TRIANGLE", "50,20");
//        assertEquals("500\n", out.toString());
//    }
//
//    @Test
//    public void squareAndTriangle() throws IOException {
//        shapes.area("SQUARE", "30");
//        shapes.area("TRIANGLE", "40,20");
//        assertEquals("900\n400\n", out.toString());
//    }
//
//    @Test
//    public void degradedTriangle() throws IOException {
//        shapes.area("TRIANGLE", "20");
//        assertEquals("200\n", out.toString());
//    }
 
}
 