package github.com.bean;

public class Config {

    private final String k;

    private final String v;

    public Config(String k, String v) {
        this.k = k;
        this.v = v;
    }

    public String getK() {
        return k;
    }

    public String getV() {
        return v;
    }

}
