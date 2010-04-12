package net.sf.jfuzzydate.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Date;
import java.util.Locale;


/**
 * 
 *
 * @author ma�
 */
public class FuzzyDateFormatImplTest {
    //~ Static fields/initializers ---------------------------------------------

    /**
     * 
     */
    private static final int SECONDS_DAY = 60 * 60 * 24;

    /**
     * 
     */
    private static final int SECONDS_WEEK = SECONDS_DAY * 7;

    /**
     * 
     */
    private static final int SECONDS_MONTH = SECONDS_DAY * 30;

    /**
     * 
     */
    private static final int SECONDS_YEAR = SECONDS_DAY * 256;

    //~ Methods ----------------------------------------------------------------

    /**
     * Test method for {@link
     * net.sf.jfuzzydate.impl.FuzzyDateFormatImpl#formatDistance(java.util.Date)}.
     */
    @Test
    public void testFormatDistanceDate() {
    }

    /**
     * Test method for {@link
     * net.sf.jfuzzydate.impl.FuzzyDateFormatImpl#formatDistance(java.util.Date,
     * java.util.Locale)}.
     */
    @Test
    public void testFormatDistanceDateLocale() {
        FuzzyDateFormatImpl impl = new FuzzyDateFormatImpl(DefaultFuzzingConfiguration.getInstance());

        assertEquals("a minute ago",
                     impl.formatDistance(new Date(new Date().getTime() -
                                                  (30 * 1000)), Locale.ENGLISH));
        assertEquals("in a minute",
                     impl.formatDistance(new Date(new Date().getTime() +
                                                  (30 * 1000)), Locale.ENGLISH));
        assertEquals("two minutes ago",
                     impl.formatDistance(new Date(new Date().getTime() -
                                                  (60 * 2 * 1000)),
                                         Locale.ENGLISH));
        assertEquals("in two minutes",
                     impl.formatDistance(new Date(new Date().getTime() +
                                                  (60 * 2 * 1000)),
                                         Locale.ENGLISH));
        assertEquals("in 35 minutes",
                     impl.formatDistance(new Date(new Date().getTime() +
                                                  (60 * 35 * 1000)),
                                         Locale.ENGLISH));
        assertEquals("a day ago",
                     impl.formatDistance(new Date(new Date().getTime() -
                                                  (SECONDS_DAY * 1000)),
                                         Locale.ENGLISH));
        assertEquals("in 5 days",
                     impl.formatDistance(new Date(new Date().getTime() +
                                                  (SECONDS_DAY * 5 * 1000)),
                                         Locale.ENGLISH));
        assertEquals("a week ago",
                     impl.formatDistance(new Date(new Date().getTime() -
                                                  (SECONDS_DAY * 7 * 1000)),
                                         Locale.ENGLISH));
        assertEquals("vor einer Woche",
                     impl.formatDistance(new Date(new Date().getTime() -
                                                  (SECONDS_DAY * 7 * 1000)),
                                         Locale.GERMAN));
        assertEquals("vor zwei Wochen",
                     impl.formatDistance(new Date(new Date().getTime() -
                                                  (SECONDS_DAY * 14 * 1000)),
                                         Locale.GERMAN));
    }

    /**
     * Test method for {@link
     * net.sf.jfuzzydate.impl.FuzzyDateFormatImpl#formatDuration(java.util.Date,
     * java.util.Date, java.util.Locale)}.
     */
    @Test
    public void testFormatDurationDateDateLocale() {
    }

    /**
     * Test method for {@link
     * net.sf.jfuzzydate.impl.FuzzyDateFormatImpl#formatDuration(java.util.Date,
     * java.util.Locale)}.
     */
    @Test
    public void testFormatDurationDateLocale() {
    }

    /**
     * Test method for {@link
     * net.sf.jfuzzydate.impl.FuzzyDateFormatImpl#formatDuration(long,
     * java.util.Locale)}.
     */
    @Test
    public void testFormatDurationLongLocale() {
        FuzzyDateFormatImpl impl = new FuzzyDateFormatImpl(DefaultFuzzingConfiguration.getInstance());
        assertEquals("a minute", impl.formatDuration(30 * 1000, Locale.ENGLISH));
        assertEquals("two minutes",
                     impl.formatDuration(60 * 2 * 1000, Locale.ENGLISH));
        assertEquals("35 minutes",
                     impl.formatDuration(60 * 35 * 1000, Locale.ENGLISH));
        assertEquals("a day",
                     impl.formatDuration(SECONDS_DAY * 1000, Locale.ENGLISH));
        assertEquals("5 days",
                     impl.formatDuration(SECONDS_DAY * 5 * 1000, Locale.ENGLISH));
        assertEquals("a week",
                     impl.formatDuration(SECONDS_DAY * 7 * 1000, Locale.ENGLISH));
    }

    /**
     * Test method for {@link
     * net.sf.jfuzzydate.impl.FuzzyDateFormatImpl#FuzzyDateFormatImpl(net.sf.jfuzzydate.impl.DefaultFuzzingConfiguration)}.
     */
    @Test
    public void testFuzzyDateFormatImpl() {
    }
}
