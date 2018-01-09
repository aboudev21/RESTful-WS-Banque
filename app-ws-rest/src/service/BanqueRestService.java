package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import metier.Compte;

@Path("/banque")
public class BanqueRestService {
	
	private static Map<Integer, Compte> comptes = new HashMap<Integer, Compte>();
		
	@GET
	@Path("/conversion/{montant}")
	@Produces(MediaType.APPLICATION_JSON)
	public double conversionEuroDZD(@PathParam(value="montant") double mt){
		return mt*200;
	}
	
	@GET
	@Path("/comptes/{code}")
	@Produces(MediaType.APPLICATION_JSON)
	public Compte getCompte(@PathParam(value="code") int code){
		return comptes.get(code);
	}
	
	@GET
	@Path("/comptes")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Compte> getComptes(){
		return new ArrayList<>(comptes.values());
	}
	
	@POST
	@Path("/comptes")
	@Produces(MediaType.APPLICATION_JSON)
	public Compte save(Compte cpte){
		comptes.put(cpte.getCode(), cpte);
		return cpte;
	}
	
	@PUT
	@Path("/comptes/{code}")
	@Produces(MediaType.APPLICATION_JSON)
	public Compte update(Compte cpte, @PathParam(value="code") int code){
		comptes.put(code, cpte);
		return cpte;
	}
	
	@DELETE
	@Path("/comptes/{code}")
	@Produces(MediaType.APPLICATION_JSON)
	public Boolean delete(@PathParam(value="code") int code){
		comptes.remove(code);
		return true;
	}
}
