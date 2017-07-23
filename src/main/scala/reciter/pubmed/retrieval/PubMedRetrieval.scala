package reciter.pubmed.retrieval

import javax.ws.rs.core.MediaType
import javax.ws.rs.{GET, Path, PathParam, Produces}

@Path("/pubmed")
trait PubMedRetrieval {
  @GET
  @Path("query/{queryparam}")
  @Produces(Array(MediaType.APPLICATION_JSON))
  def retrieve(@PathParam("query") param: String, @PathParam("fields") fields: String)
}
