package proxypatten.Proxy;

import proxypatten.Store.AgencyStore;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class RunTimeAgencyCarStoreProxy implements InvocationHandler {
    private Object object;

    public Object newProxy(Object object){
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }
    public RunTimeAgencyCarStoreProxy(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        checkBeforeSell();

        return method.invoke(object,args);
    }
    private void checkBeforeSell(){
        System.out.println("Check the car.");
    }

}
