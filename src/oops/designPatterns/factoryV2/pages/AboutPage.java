package oops.designPatterns.factoryV2.pages;

public class AboutPage extends Page{
    private String companyName;
    private String team;

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getTeam() {
        return team;
    }
}
