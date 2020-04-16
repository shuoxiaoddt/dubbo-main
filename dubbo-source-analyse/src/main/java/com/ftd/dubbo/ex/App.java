package com.ftd.dubbo.ex;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.URLBuilder;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ExtensionLoader<Protocol> extensionLoader = ExtensionLoader.getExtensionLoader(Protocol.class);
        URL url = URL.valueOf("192.168.1.3:20880");
        Protocol adaptiveExtension = extensionLoader.getAdaptiveExtension();
        List<Protocol> dubbo = extensionLoader.getActivateExtension(url, "dubbo");
        System.out.println(adaptiveExtension.getDefaultPort());

    }
}
