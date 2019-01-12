import ConectionWithAPI.RestCHF;
import ConectionWithAPI.RestNBP;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ComparatorTest {
    Comparator comparator;

    @Mock
    RestCHF rest_chf;

    //@InjectMocks

    @Before
    public void setComparator() {
        comparator = new Comparator();

    }

    @Test
    public void simpleComparatorTest() throws IOException {
////        ArrayList<Object> listNow = new ArrayList<>();
////        listNow.add("asd, bid:4.00,ask:3.7675");
////        ArrayList<Object> listPast = new ArrayList<>();
////        listPast.add("asd, bid:2.00,ask:3.7675");
//        double[] arrayNow = {4.00, 4.00};
//        double[] arrayPast = {2.00, 2.00};
//        //when(rest_chf.getCurrencyNow()).thenReturn(new Currency("a", "Frank", "chf", listNow));
//        when(RestNBP.getAskBidRequest(rest_chf.getCurrencyNow())).thenReturn(arrayNow);
//        //when(rest_chf.getCurrencyPast()).thenReturn(new Currency("a", "Frank", "chf", listPast));
//        when(RestNBP.getAskBidRequest(rest_chf.getCurrencyNow())).thenReturn(arrayPast);
//        double actual = comparator.compareToMonthAgo(rest_chf, 100);
//        double expected = 50;
//        assertTrue(String.valueOf(actual == expected), true);
    }
}
