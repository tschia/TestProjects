package ca.bc.gov.hlth.testwebapp.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import ca.bc.gov.health.beans.SomeBean;

/**
 *
 * @author
 */
@Path("javaee8")
public class JavaEE8Resource {

    @Inject
    SomeBean someBean;

    @GET
    public Response ping() {
        
        return Response
                .ok(someBean.getTestProperty())
                .build();
    }
}
