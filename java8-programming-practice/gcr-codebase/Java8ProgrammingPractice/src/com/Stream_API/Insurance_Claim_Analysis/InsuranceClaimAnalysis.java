package com.Stream_API.Insurance_Claim_Analysis;

import java.util.*;
import java.util.stream.*;

public class InsuranceClaimAnalysis {

    public static void main(String[] args) {

        List<InsuranceClaim> claims = Arrays.asList(
                new InsuranceClaim("Health", 50000),
                new InsuranceClaim("Vehicle", 20000),
                new InsuranceClaim("Health", 30000),
                new InsuranceClaim("Life", 100000),
                new InsuranceClaim("Vehicle", 40000),
                new InsuranceClaim("Health", 70000)
        );
  Map<String,Double> map = claims.stream().collect(Collectors.groupingBy(c -> c.claimType,Collectors.averagingDouble(c -> c.claimAmount)));	
          map.forEach((type, amount) -> {
        	 System.out.println(type + " average claim amount is : " + amount );
          });
    }
}

