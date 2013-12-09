/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2002-2011, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package it.geosolutions.geobatch.destination.common.utils;

import java.sql.Timestamp;

import org.joda.time.format.DateTimeFormatter;

/**
 * Time utilities using JodaTime
 * 
 * @author adiaz
 */
public class TimeUtils {

/**
 * Default formatter for the time
 */
public static final DateTimeFormatter DEFAULT_FORMATTER = org.joda.time.format.DateTimeFormat
        .forPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").withZoneUTC();

/**
 * Obtain a time stamp for a input sting with the default format
 * 
 * @param date
 * @return
 */
public static Timestamp getTimeStamp(String date) {
    return date != null ? new Timestamp(DEFAULT_FORMATTER.parseMillis(date))
            : null;
}

}
