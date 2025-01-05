package less21;

public class AutoPilot {
    //организуем двунаправленную связь-Автобус знает что у него есть автопилот и
    //автопилот знает про автобус
    private Autobus autobus;
    private String softwareVersion;

    public AutoPilot(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    @Override
    public String toString() {
        return "AutoPilot{" +
                "SV='" + softwareVersion + '\'' +
                '}';
    }

    public Autobus getAutobus() {
        return autobus;
    }

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }
}
