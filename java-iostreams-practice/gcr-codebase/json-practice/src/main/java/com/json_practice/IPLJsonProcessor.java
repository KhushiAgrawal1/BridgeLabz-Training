package com.json_practice;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class IPLJsonProcessor {

    public static void processJson(String inputPath, String outputPath) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        // Read JSON
        List<Match> matches = mapper.readValue(new File(inputPath), new TypeReference<List<Match>>() {});

        // Apply censorship
        for (Match m : matches) {
            String oldTeam1 = m.getTeam1();
            String oldTeam2 = m.getTeam2();

            m.setTeam1(CensorshipUtils.maskTeamName(oldTeam1));
            m.setTeam2(CensorshipUtils.maskTeamName(oldTeam2));

            // Mask scores map keys
            Map<String, Integer> newScore = new HashMap<>();
            for (Map.Entry<String, Integer> entry : m.getScore().entrySet()) {
                String maskedTeam = CensorshipUtils.maskTeamName(entry.getKey());
                newScore.put(maskedTeam, entry.getValue());
            }
            m.setScore(newScore);

            m.setWinner(CensorshipUtils.maskTeamName(m.getWinner()));
            m.setPlayer_of_match(CensorshipUtils.redactPlayer(m.getPlayer_of_match()));
        }

        // Write censored JSON
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputPath), matches);
        System.out.println("Censored JSON written to: " + outputPath);
    }
}

