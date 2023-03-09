package sdk.api.development.examples.joke_api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

// Essa anotação diz ao Jackson para ignorar qualquer propriedade do JSON 
// que não possua um correspondente na classe Java.
@JsonIgnoreProperties(ignoreUnknown = true)
public class Joke {
    // private Integer id;
    
    @JsonIgnore // ignora uma propriedade ao serializá-la ou desserializá-la
    private String type;

    private String setup;
    
    @JsonProperty("punchline")
    private String punchLine;
        
    // public Integer getId() {
    //     return id;
    // }
    
    // public void setId(Integer id) {
    //     this.id = id;
    // }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getPunchLine() {
        return punchLine;
    }

    public void setPunchLine(String punchLine) {
        this.punchLine = punchLine;
    }

    @Override
    public String toString() {
        return "Joke [type=" + type + ", setup=" + setup + ", punchLine=" + punchLine + "]";
    }
}
