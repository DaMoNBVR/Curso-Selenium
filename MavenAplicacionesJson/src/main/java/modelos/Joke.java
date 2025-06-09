package modelos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Joke {

    @JsonProperty("type")
    private String type;
    @JsonProperty("setup")
    private String setup;
    @JsonProperty("punchline")
    private String punchline;
    @JsonProperty("id")
    private int id;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {

        final var multilinea = """
                
                {
                
                type: %s
                setup: %s
                punchline: %s
                id: %d
                
                }
                """;

        return String.format(multilinea,type,setup,punchline,id);

    }
}
