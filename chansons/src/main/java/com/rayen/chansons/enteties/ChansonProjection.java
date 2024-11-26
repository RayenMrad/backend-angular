package com.rayen.chansons.enteties;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomChan", types = { Chanson.class }) 
public interface ChansonProjection {
	public String getNomChanson(); 

}
