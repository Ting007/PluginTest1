
package org.joda.time;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.joda.time.TestYearMonthDay_Basics;
import org.joda.time.TestHours;
import org.joda.time.TestInterval_Constructors;
import org.joda.time.TestLocalTime_Properties;
import org.joda.time.TestPeriod_Constructors;
import org.joda.time.TestWeeks;
import org.joda.time.TestInstant_Constructors;
import org.joda.time.TestPartial_Basics;
import org.joda.time.TestDateTimeComparator;
import org.joda.time.TestLocalDateTime_Constructors;
import org.joda.time.TestPartial_Match;
import org.joda.time.TestLocalDateTime_Properties;
import org.joda.time.TestStringConvert;
import org.joda.time.TestMutableDateTime_Basics;
import org.joda.time.TestMutableDateTime_Constructors;
import org.joda.time.TestMonthDay_Basics;
import org.joda.time.TestDuration_Constructors;
import org.joda.time.TestTimeOfDay_Constructors;
import org.joda.time.TestDateTimeZone;
import org.joda.time.TestDateTime_Properties;
import org.joda.time.TestDateTimeZoneCutover;
import org.joda.time.TestDays;
import org.joda.time.TestDateTime_Basics;
import org.joda.time.TestBasePartial;
import org.joda.time.TestYearMonth_Properties;
import org.joda.time.TestTimeOfDay_Basics;
import org.joda.time.TestPeriodType;
import org.joda.time.TestBaseSingleFieldPeriod;
import org.joda.time.TestPartial_Constructors;
import org.joda.time.TestMonths;
import org.joda.time.TestDateMidnight_Constructors;
import org.joda.time.TestDateTimeUtils;
import org.joda.time.TestLocalTime_Constructors;
import org.joda.time.TestMinutes;
import org.joda.time.TestYearMonthDay_Properties;
import org.joda.time.TestYearMonth_Constructors;
import org.joda.time.TestDateTimeFieldType;
import org.joda.time.TestLocalDate_Constructors;
import org.joda.time.TestMonthDay_Properties;
import org.joda.time.TestMutableDateTime_Adds;
import org.joda.time.TestMinMaxLong;
import org.joda.time.TestDateMidnight_Basics;
import org.joda.time.TestSeconds;
import org.joda.time.TestAbstractPartial;
import org.joda.time.TestTimeOfDay_Properties;
import org.joda.time.TestPartial_Properties;
import org.joda.time.TestLocalDateTime_Basics;
import org.joda.time.TestMutablePeriod_Basics;
import org.joda.time.TestYears;
import org.joda.time.TestMutableInterval_Basics;
import org.joda.time.TestMutableInterval_Updates;
import org.joda.time.TestIllegalFieldValueException;
import org.joda.time.TestPeriod_Basics;
import org.joda.time.TestMutablePeriod_Updates;
import org.joda.time.TestMutableDateTime_Properties;
import org.joda.time.TestLocalTime_Basics;
import org.joda.time.TestInstant_Basics;
import org.joda.time.TestYearMonth_Basics;
import org.joda.time.TestDuration_Basics;
import org.joda.time.TestMutableInterval_Constructors;
import org.joda.time.TestInterval_Basics;
import org.joda.time.TestYearMonthDay_Constructors;
import org.joda.time.TestMutablePeriod_Constructors;
import org.joda.time.TestLocalDate_Properties;
import org.joda.time.TestDateTime_Constructors;
import org.joda.time.TestMutableDateTime_Sets;
import org.joda.time.TestDateMidnight_Properties;
import org.joda.time.TestSerialization;
import org.joda.time.TestDurationFieldType;
import org.joda.time.TestDateTimeConstants;
import org.joda.time.TestLocalDate_Basics;
import org.joda.time.TestDurationField;
import org.joda.time.TestMonthDay_Constructors;
import org.joda.time.TestChronology;
import org.joda.time.chrono.TestCopticChronology;
import org.joda.time.chrono.TestEthiopicChronology;
import org.joda.time.chrono.TestIslamicChronology;
import org.joda.time.chrono.TestGJChronology;
import org.joda.time.chrono.TestISOChronology;
import org.joda.time.chrono.TestLenientChronology;
import org.joda.time.chrono.TestBuddhistChronology;
import org.joda.time.chrono.TestGJDate;
import org.joda.time.chrono.TestGregorianChronology;
import org.joda.time.chrono.TestJulianChronology;
import org.joda.time.field.TestPreciseDateTimeField;
import org.joda.time.field.TestUnsupportedDateTimeField;
import org.joda.time.field.TestPreciseDurationField;
import org.joda.time.field.TestScaledDurationField;
import org.joda.time.field.TestFieldUtils;
import org.joda.time.field.TestPreciseDurationDateTimeField;
import org.joda.time.field.TestMillisDurationField;
import org.joda.time.field.TestBaseDateTimeField;
import org.joda.time.field.TestOffsetDateTimeField;
import org.joda.time.format.TestISOPeriodFormatParsing;
import org.joda.time.format.TestTextFields;
import org.joda.time.format.TestPeriodFormatParsing;
import org.joda.time.format.TestPeriodFormatterBuilder;
import org.joda.time.format.TestDateTimeParserBucket;
import org.joda.time.format.TestDateTimeFormat;
import org.joda.time.format.TestISODateTimeFormatParsing;
import org.joda.time.format.TestPeriodFormatter;
import org.joda.time.format.TestPeriodFormat;
import org.joda.time.format.TestDateTimeFormatterBuilder;
import org.joda.time.format.TestDateTimeFormatter;
import org.joda.time.format.TestISODateTimeFormat_Fields;
import org.joda.time.format.TestDateTimeFormatStyle;
import org.joda.time.format.TestISOPeriodFormat;
import org.joda.time.format.TestISODateTimeFormat;
import org.joda.time.tz.TestCachedDateTimeZone;
import org.joda.time.tz.TestBuilder;
import org.joda.time.tz.TestCompiler;
import org.joda.time.tz.TestUTCProvider;
import org.joda.time.tz.TestFixedDateTimeZone;
import org.joda.time.convert.TestConverterManager;
import org.joda.time.convert.TestReadableInstantConverter;
import org.joda.time.convert.TestConverterSet;
import org.joda.time.convert.TestDateConverter;
import org.joda.time.convert.TestReadableIntervalConverter;
import org.joda.time.convert.TestReadableDurationConverter;
import org.joda.time.convert.TestReadablePeriodConverter;
import org.joda.time.convert.TestNullConverter;
import org.joda.time.convert.TestStringConverter;
import org.joda.time.convert.TestCalendarConverter;
import org.joda.time.convert.TestReadablePartialConverter;
import org.joda.time.convert.TestLongConverter;

@SuppressWarnings("deprecation")
@RunWith(Suite.class)
@SuiteClasses({
    TestYearMonthDay_Basics.class,
    TestHours.class,
    TestInterval_Constructors.class,
    TestLocalTime_Properties.class,
    TestPeriod_Constructors.class,
    TestWeeks.class,
    TestInstant_Constructors.class,
    TestPartial_Basics.class,
    TestDateTimeComparator.class,
    TestLocalDateTime_Constructors.class,
    TestPartial_Match.class,
    TestLocalDateTime_Properties.class,
    TestStringConvert.class,
    TestMutableDateTime_Basics.class,
    TestMutableDateTime_Constructors.class,
    TestMonthDay_Basics.class,
    TestDuration_Constructors.class,
    TestTimeOfDay_Constructors.class,
    TestDateTimeZone.class,
    TestDateTime_Properties.class,
    TestDateTimeZoneCutover.class,
    TestDays.class,
    TestDateTime_Basics.class,
    TestBasePartial.class,
    TestYearMonth_Properties.class,
    TestTimeOfDay_Basics.class,
    TestPeriodType.class,
    TestBaseSingleFieldPeriod.class,
    TestPartial_Constructors.class,
    TestMonths.class,
    TestDateMidnight_Constructors.class,
    TestDateTimeUtils.class,
    TestLocalTime_Constructors.class,
    TestMinutes.class,
    TestYearMonthDay_Properties.class,
    TestYearMonth_Constructors.class,
    TestDateTimeFieldType.class,
    TestLocalDate_Constructors.class,
    TestMonthDay_Properties.class,
    TestMutableDateTime_Adds.class,
    TestMinMaxLong.class,
    TestDateMidnight_Basics.class,
    TestSeconds.class,
    TestAbstractPartial.class,
    TestTimeOfDay_Properties.class,
    TestPartial_Properties.class,
    TestLocalDateTime_Basics.class,
    TestMutablePeriod_Basics.class,
    TestYears.class,
    TestMutableInterval_Basics.class,
    TestMutableInterval_Updates.class,
    TestIllegalFieldValueException.class,
    TestPeriod_Basics.class,
    TestMutablePeriod_Updates.class,
    TestMutableDateTime_Properties.class,
    TestLocalTime_Basics.class,
    TestInstant_Basics.class,
    TestYearMonth_Basics.class,
    TestDuration_Basics.class,
    TestMutableInterval_Constructors.class,
    TestInterval_Basics.class,
    TestYearMonthDay_Constructors.class,
    TestMutablePeriod_Constructors.class,
    TestLocalDate_Properties.class,
    TestDateTime_Constructors.class,
    TestMutableDateTime_Sets.class,
    TestDateMidnight_Properties.class,
    TestSerialization.class,
    TestDurationFieldType.class,
    TestDateTimeConstants.class,
    TestLocalDate_Basics.class,
    TestDurationField.class,
    TestMonthDay_Constructors.class,
    TestChronology.class,
    TestCopticChronology.class,
    TestEthiopicChronology.class,
    TestIslamicChronology.class,
    TestGJChronology.class,
    TestISOChronology.class,
    TestLenientChronology.class,
    TestBuddhistChronology.class,
    TestGJDate.class,
    TestGregorianChronology.class,
    TestJulianChronology.class,
    TestPreciseDateTimeField.class,
    TestUnsupportedDateTimeField.class,
    TestPreciseDurationField.class,
    TestScaledDurationField.class,
    TestFieldUtils.class,
    TestPreciseDurationDateTimeField.class,
    TestMillisDurationField.class,
    TestBaseDateTimeField.class,
    TestOffsetDateTimeField.class,
    TestISOPeriodFormatParsing.class,
    TestTextFields.class,
    TestPeriodFormatParsing.class,
    TestPeriodFormatterBuilder.class,
    TestDateTimeParserBucket.class,
    TestDateTimeFormat.class,
    TestISODateTimeFormatParsing.class,
    TestPeriodFormatter.class,
    TestPeriodFormat.class,
    TestDateTimeFormatterBuilder.class,
    TestDateTimeFormatter.class,
    TestISODateTimeFormat_Fields.class,
    TestDateTimeFormatStyle.class,
    TestISOPeriodFormat.class,
    TestISODateTimeFormat.class,
    TestCachedDateTimeZone.class,
    TestBuilder.class,
    TestCompiler.class,
    TestUTCProvider.class,
    TestFixedDateTimeZone.class,
    TestConverterManager.class,
    TestReadableInstantConverter.class,
    TestConverterSet.class,
    TestDateConverter.class,
    TestReadableIntervalConverter.class,
    TestReadableDurationConverter.class,
    TestReadablePeriodConverter.class,
    TestNullConverter.class,
    TestStringConverter.class,
    TestCalendarConverter.class,
    TestReadablePartialConverter.class,
    TestLongConverter.class
})

public class TestAllPackages {
}