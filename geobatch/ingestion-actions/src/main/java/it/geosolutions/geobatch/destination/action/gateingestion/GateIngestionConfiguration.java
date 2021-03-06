/*
 *  GeoBatch - Open Source geospatial batch processing system
 *  http://geobatch.geo-solutions.it/
 *  Copyright (C) 2013 GeoSolutions S.A.S.
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
package it.geosolutions.geobatch.destination.action.gateingestion;

import it.geosolutions.geobatch.actions.ds2ds.Ds2dsConfiguration;

/**
 * Gate ingestion configuration. Not use input ds (input data it's read from xml)
 * 
 * @author adiaz
 */
public class GateIngestionConfiguration extends Ds2dsConfiguration {

/**
 * Ignore primary keys in the xml file and generate it
 */
private Boolean ignorePks;

public GateIngestionConfiguration(String id, String name, String description) {
    super(id, name, description);
}

/**
 * @return the ignorePks
 */
public boolean getIgnorePks() {
    return ignorePks;
}

/**
 * @param ignorePks the ignorePks to set
 */
public void setIgnorePks(boolean ignorePks) {
    this.ignorePks = ignorePks;
}

}
