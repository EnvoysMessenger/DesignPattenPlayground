package proxypatten;

import proxypatten.Proxy.AgencyCarStoreProxy;
import proxypatten.Store.AgencyCarStore;

public class ProxySimulation {
    public void simulate(){

    }

    public void directlyBuyCar(){
        System.out.println("The process of directly buy car.");
        AgencyCarStore agencyCarStore = new AgencyCarStore();
        agencyCarStore.sell();
    }

    public void buyCarFromProxyStore(){
        System.out.println("The process of buy car from proxy store.");
        AgencyCarStore agencyCarStore = new AgencyCarStore();
        AgencyCarStoreProxy agencyCarStoreProxy = new AgencyCarStoreProxy(agencyCarStore);
        agencyCarStoreProxy.sell();
    }
}
