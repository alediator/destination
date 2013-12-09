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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.junit.Before;
import org.junit.Test;

/**
 * Transit bean unit test
 * 
 * @author adiaz
 */
public class TransitBeanTest {

/**
 * Test xml code
 */
public static String TEST_XML = ""
        + "<ExportData xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">"
        + "    <Transits>" 
        + "    <Transit>" 
        + "      <IdGate>2004</IdGate>"
        + "      <IdTransito>81831</IdTransito>"
        + "      <DataRilevamento>2013-10-23T10:34:00Z</DataRilevamento>"
        + "      <Corsia>0</Corsia>" 
        + "      <Direzione>0</Direzione>"
        + "      <KemlerCode />" 
        + "      <OnuCode />" 
        + "    </Transit>"
        + "    <Transit>" 
        + "      <IdGate>2004</IdGate>"
        + "      <IdTransito>81832</IdTransito>"
        + "      <DataRilevamento>2013-10-23T10:34:00Z</DataRilevamento>"
        + "      <Corsia>0</Corsia>" 
        + "      <Direzione>1</Direzione>"
        + "      <KemlerCode />" 
        + "      <OnuCode />" 
        + "    </Transit>"
        + "  </Transits>" 
        + "</ExportData>";

private JAXBContext context;

private Marshaller marshaller;

private Unmarshaller unmarshaller;

@Before
public void setUp() throws Exception {
    context = JAXBContext.newInstance(getClass().getPackage().getName());
    marshaller = context.createMarshaller();
    unmarshaller = context.createUnmarshaller();
}

/**
 * Marshal from code and unmarshal from example xml file and test if the result
 * it's the same
 */
@Test
public void testTransitMarshalUnmarshal() {
    Transits fromCode = new Transits();
    Transit transit = new Transit();
    transit.setIdGate(new Long(2004));
    transit.setIdTransito(new Long(81831));
    transit.setDataRilevamento("2013-10-23T10:34:00Z");
    transit.setCorsia(new Integer(0));
    transit.setDirezione("0");
    fromCode.getTransit().add(transit);
    transit = new Transit();
    transit.setIdGate(new Long(2004));
    transit.setIdTransito(new Long(81832));
    transit.setDataRilevamento("2013-10-23T10:34:00Z");
    transit.setCorsia(new Integer(0));
    transit.setDirezione("1");
    fromCode.getTransit().add(transit);
    StringWriter writer = new StringWriter();
    try {
        marshaller.marshal(fromCode, writer);
        assertNotNull(writer);
        assertNotNull(writer.toString());
        Transits fromXml = ((ExportData) unmarshaller
                .unmarshal(new StringReader(TEST_XML))).getTransits().get(0);
        assertNotNull(fromXml);
        assertEquals(fromXml.getTransit().size(), fromCode.getTransit().size());
        for (int i = 0; i < fromXml.getTransit().size(); i++) {
            Transit transitFromXml = fromXml.getTransit().get(i);
            Transit transitFromCode = fromCode.getTransit().get(i);
            check(transitFromXml.getCorsia(), transitFromCode.getCorsia());
            check(transitFromXml.getDataRilevamento(),
                    transitFromCode.getDataRilevamento());
            check(transitFromXml.getDirezione(), transitFromCode.getDirezione());
            check(transitFromXml.getIdGate(), transitFromCode.getIdGate());
            check(transitFromXml.getIdTransito(),
                    transitFromCode.getIdTransito());
            check(transitFromXml.getKemlerCode(),
                    transitFromCode.getKemlerCode());
            check(transitFromXml.getOnuCode(), transitFromCode.getOnuCode());
        }
    } catch (JAXBException e) {
        // fail
        e.printStackTrace();
        fail("Error on marshal or unmarshal");
    }
}

/**
 * If o1 or o2 are empty Strings an the other one it's null, don't assertEquals.
 * Otherwise do an assertEquals between o1 and o2
 * 
 * @param o1
 * @param o2
 */
private void check(Object o1, Object o2) {
    if (o1 != null && o2 == null) {
        if (o1 instanceof String && "".equals(o1)) {
        } else {
            assertEquals(o1, o2);
        }
    } else if (o2 != null && o1 == null) {
        check(o2, o1);
    } else {
        assertEquals(o1, o2);
    }
}

}
