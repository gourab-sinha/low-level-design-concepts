package oops.designPatterns.builder;

public class SubwaySandwichOrderV4 {
    private String bread;
    private String vaggies;
    private String souces;
    private String salads;

    public SubwaySandwichOrderV4(Builder b){
        this.bread = b.bread;
        this.salads = b.salads;
        this.souces = b.souces;
        this.vaggies = b.vaggies;
    }

    public String getBread(){
        return bread;
    }

    public String getVaggies(){
        return vaggies;
    }

    public  String getSouces(){
        return souces;
    }

    public String getSalads(){
        return salads;
    }

    public static class Builder{
        public String bread;
        public String vaggies;
        public String souces;
        public String salads;

        public Builder setBread(String bread){
            this.bread = bread;
            return this;
        }

        public Builder setVaggies(String vaggies){
            this.vaggies = vaggies;
            return this;
        }

        public Builder setSouces(String souces){
            this.souces = souces;
            return this;
        }

        public Builder setSalads(String salads){
            this.salads = salads;
            return this;
        }

        public SubwaySandwichOrderV4 build(){
            return new SubwaySandwichOrderV4(this);
        }
    }

}
