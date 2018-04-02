package edu.somewhere;

import static org.junit.Assert.*;

import java.net.URL;

import org.junit.Test;
import org.kuali.rice.location.v2_0.CampusService;
import org.kuali.rice.location.v2_0.CampusType;
import org.kuali.rice.location.v2_0.FindAllCampusesResponse.Campuses;

import edu.somewhere.KSBCampusServiceClient;

public class KSBCampusServiceClientTest
{

	@Test
	public void campusServiceTest() throws Exception
	{
		KSBCampusServiceClient client = new KSBCampusServiceClient();

		CampusService svc = client.getCampusService( new URL( "http://localhost:8080/kc-dev/remoting/soap/location/v2_0/campusService?wsdl" ) );
		Campuses campuses = svc.findAllCampuses();

		assertEquals( 7, campuses.getCampus().size() );

		for( CampusType campus : campuses.getCampus() )
		{
			System.out.printf( "%s : %s : %s \n", campus.getCode(), campus.getShortName(), campus.getCode() );
		}
	}
}
