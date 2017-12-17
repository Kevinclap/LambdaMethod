package com.amazonaws.lambda.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Lambda implements RequestHandler<Object, String> {

	
	

	
Boom black = new Boom();	
    @Override
    public String handleRequest(Object input, Context context) {
        context.getLogger().log("Input: " + input);

        
       
       black.numbers();
        
        return "Hello from Lambda!";
    }

}
