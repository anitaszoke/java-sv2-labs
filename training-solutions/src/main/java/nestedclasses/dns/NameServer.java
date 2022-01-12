package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {
    private List<DnsEntry> dnsEntries;

    public NameServer() {
        this.dnsEntries = new ArrayList<>();
    }

    public void addEntry(String hostName, String hostIp) {
        checkingAddEntry(hostName, hostIp);
        dnsEntries.add(new DnsEntry(hostName, hostIp));

    }

    public void removeEntryByName(String hostName) {
        DnsEntry dnsEntry = removeByName(hostName);
        dnsEntries.remove(dnsEntry);
    }

    public void removeEntryByIp(String hostIP) {
        DnsEntry dnsEntry = removeByIp(hostIP);
        dnsEntries.remove(dnsEntry);
    }


    public String getIpByName(String hostName) {
        DnsEntry entry = getByName(hostName);
        return entry.hostIp;
    }

    public String getNameByIp(String hostIP) {
        DnsEntry entry = getByIp(hostIP);
        return entry.hostName;
    }

    private DnsEntry getByIp(String hostIP) {
        for (DnsEntry d : dnsEntries) {
            if (d.hostIp.equals(hostIP)) {
                return d;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    private DnsEntry removeByIp(String hostIp) {
        DnsEntry byIp = dnsEntries.get(0);
        for (DnsEntry d : dnsEntries) {
            if (d.hostIp.equals(hostIp)) {
                byIp = d;
            }
        }

        return byIp;
    }

    private DnsEntry removeByName(String name) {
        DnsEntry byName = dnsEntries.get(0);
        for (DnsEntry d : dnsEntries) {
            if (d.hostIp.equals(name)) {
                byName = d;
            }
        }
        return byName;
    }

    private DnsEntry getByName(String hostName) {
        for (DnsEntry d : dnsEntries) {
            if (d.hostName.equals(hostName)) {
                return d;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    private void checkingAddEntry(String hostName, String hostIp) {
        for (DnsEntry d : dnsEntries) {
            if (d.hostName.equals(hostName) || d.hostIp.equals(hostIp)) {
                throw new IllegalArgumentException("Already exists");
            }
        }
    }

    private static class DnsEntry {
        private String hostName;
        private String hostIp;

        public DnsEntry(String hostName, String hostIp) {
            this.hostName = hostName;
            this.hostIp = hostIp;
        }
    }
}