package sdk.api.development.examples.festivo_api.model;

import java.util.List;

public class Country {
    private String name;
    private String codeAlpha2;
    private Boolean isSupported;
    private List<String> languages;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCodeAlpha2() {
        return codeAlpha2;
    }
    public void setCodeAlpha2(String codeAlpha2) {
        this.codeAlpha2 = codeAlpha2;
    }
    public Boolean getIsSupported() {
        return isSupported;
    }
    public void setIsSupported(Boolean isSupported) {
        this.isSupported = isSupported;
    }
    public List<String> getLanguages() {
        return languages;
    }
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }
    @Override
    public String toString() {
        return "Country [name=" + name + ", codeAlpha2=" + codeAlpha2 + ", isSupported=" + isSupported + ", languages="
                + languages + "]";
    }    
}
