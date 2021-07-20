package proxypatten.Proxy;

import proxypatten.Store.AgencyCarStore;
import proxypatten.Store.AgencyStore;

public class AgencyCarStoreProxy implements AgencyStore {
    private AgencyCarStore agencyCarStore;

    public AgencyCarStoreProxy(AgencyCarStore agencyCarStore) {
        this.agencyCarStore = agencyCarStore;
    }

    public String sell() {
        System.out.println("Wash car before sell");
        agencyCarStore.sell();
        System.out.println("Revisit customer after sell");
        return null;
    }
}
