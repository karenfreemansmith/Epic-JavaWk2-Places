import org.junit.*;
import static org.junit.Assert.*;

public class PlaceTest {
  @Test
  public void Place_instantiation_true() {
    Place place = new Place("Chicago");
    assertEquals(true, place instanceof Place);
  }

  @Test
  public void getPlaceName_returnsName_String() {
    Place place = new Place("Chicago");
    assertEquals("Chicago", place.getPlaceName());
  }
}
