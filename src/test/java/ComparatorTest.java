import ConectionWithAPI.Currency;
import ConectionWithAPI.RestCHF;
import ConectionWithAPI.RestNBP;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ComparatorTest {

    private Comparator comparator;

    @Mock
    RestCHF rest_chf;

    @Mock
    RestNBP restNBP;

    //@InjectMocks

    @Before
    public void setComparator() {
        comparator = new Comparator();

    }

    @Test
    public void simpleComparatorTest() throws IOException {
//
//        ArrayList<Object> listNow = new ArrayList<>();
//        listNow.add("asd, bid=4.00, ask=4.00");
//        when(rest_chf.getCurrencyNow()).thenReturn(new Currency("a", "Frank", "chf", listNow));
//
//        ArrayList<Object> listPast = new ArrayList<>();
//        listPast.add("asd, bid=2.00, ask=2.00");
//        when(rest_chf.getCurrencyPast()).thenReturn(new Currency("a", "Frank", "chf", listPast));
//
//        double[] arrayNow = {4.00, 4.00};
//        when(RestNBP.getAskBidRequest(rest_chf.getCurrencyNow())).thenReturn(arrayNow);
//
//        double[] arrayPast = {2.00, 2.00};
//        when(RestNBP.getAskBidRequest(rest_chf.getCurrencyPast())).thenReturn(arrayPast);
//
//        double actual = comparator.compareToMonthAgo(rest_chf, 100);
//        double expected = 50;
//
//        assertTrue(String.valueOf(actual == expected), true);
    }
}
