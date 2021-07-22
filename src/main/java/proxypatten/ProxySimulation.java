package proxypatten;

import proxypatten.Proxy.AgencyCarStoreProxy;
import proxypatten.Proxy.RunTimeAgencyCarStoreProxy;
import proxypatten.Store.AgencyCarStore;
import proxypatten.Store.AgencyStore;

public class ProxySimulation {
    public static void main(String args[]) {
        ProxySimulation proxySimulation = new ProxySimulation();
        proxySimulation.simulate();
    }
    public void simulate(){
        directlyBuyCar();
        buyCarFromProxyStore();
        runTimeByCar();
    }
    public void runTimeByCar(){
        AgencyCarStore agencyCarStore = new AgencyCarStore();
        RunTimeAgencyCarStoreProxy runTimeAgencyCarStoreProxy = new RunTimeAgencyCarStoreProxy(agencyCarStore);
        AgencyStore carStore = (AgencyStore)runTimeAgencyCarStoreProxy.newProxy(agencyCarStore);
        carStore.sell();
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
