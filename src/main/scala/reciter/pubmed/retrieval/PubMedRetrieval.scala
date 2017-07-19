package reciter.pubmed.retrieval

import javax.ws.rs.{GET, Path, PathParam, Produces}

@Path("/pubmed")
trait PubMedRetrieval {
  @GET
  @Path("query/{queryparam}")
  @Produces("application/json")
  def retrieve(@PathParam("query") param: String, @PathParam("fields") fields: String)
}
