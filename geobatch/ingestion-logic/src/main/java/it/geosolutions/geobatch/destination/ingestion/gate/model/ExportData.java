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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * ExportData bean definition
 * 
 * @author adiaz
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ExportData")
public class ExportData implements Serializable {

/** serialVersionUID */
private static final long serialVersionUID = -1873585122098049899L;

private List<Transits> Transits;

/**
 * @return the transits
 */
@XmlElement
public List<Transits> getTransits() {
    if (this.Transits == null) {
        this.Transits = new ArrayList<Transits>();
    }
    return Transits;
}

/**
 * @param transits the transits to set
 */
public void setTransit(List<Transits> transits) {
    this.Transits = transits;
}

}
