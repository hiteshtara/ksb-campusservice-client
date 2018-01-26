package edu.somewhere;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.ws.security.handler.WSHandlerConstants;
import org.kuali.rice.location.v2_0.CampusService;
import org.kuali.rice.location.v2_0.CampusService_Service;

public class KSBCampusServiceClient
{

	public CampusService getCampusService( URL url )
	{

		CampusService_Service svc = new CampusService_Service(url);

		CampusService campusService = svc.getCampusServicePort();

		Client client = ClientProxy.getClient( campusService );
		Endpoint cxfEP = client.getEndpoint();

		Map<String, Object> outProps = new HashMap<String, Object>();
		outProps.put( WSHandlerConstants.ACTION, "Signature" );
		outProps.put( WSHandlerConstants.USER, "rice" );
		outProps.put( WSHandlerConstants.PW_CALLBACK_CLASS, KSBClientCallbackHandler.class.getName() );
		outProps.put( WSHandlerConstants.SIG_PROP_FILE, "client-sign.properties" );
		outProps.put(WSHandlerConstants.SIG_KEY_ID, "DirectReference");
		WSS4JOutInterceptor wssOut = new WSS4JOutInterceptor( outProps );

		cxfEP.getOutInterceptors().add( wssOut );

		return campusService;
	}


}
