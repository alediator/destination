/*
 *  Copyright (C) 2007 - 2013 GeoSolutions S.A.S.
 *  http://www.geo-solutions.it
 * 
 *  GPLv3 + Classpath exception
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package it.geosolutions.geobatch.destination.ingestion.gate.model;

import static org.junit.Assert.assertEquals;
import it.geosolutions.geobatch.destination.common.utils.TimeUtils;

import org.junit.Test;

/**
 * Test Joda time formatter
 * 
 * @author adiaz
 */
public class JodaTimeTest {

/**
 * Test if the formatter run correctly between String and milliseconds
 */
@Test
public void testJodaTime() {
    String stringDate = "2013-10-23T10:34:00Z";
    long millis = TimeUtils.DEFAULT_FORMATTER.parseMillis(stringDate);
    assertEquals(stringDate, TimeUtils.DEFAULT_FORMATTER.print(millis));
}

}
