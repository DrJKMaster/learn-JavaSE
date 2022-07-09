package j_internet.a_inet_address;

import java.net.InetAddress;
import java.net.UnknownHostException;

class Test {
    public static void main(String[] args) throws UnknownHostException {
        //获得本机的 InetAddress 对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost.getHostName());
        System.out.println(localHost.getHostAddress());

        //根据指定的主机名获得 InetAddress 对象（由于是未知的主机，所以会报错）
//        InetAddress ye = InetAddress.getByName("ye");
//        System.out.println(ye.getHostName());
//        System.out.println(ye.getHostAddress());

        //根据指定的域名获得 InetAddress 对象
        InetAddress bili = InetAddress.getByName("www.bilibili.com");
        System.out.println(bili.getHostName());
        System.out.println(bili.getHostAddress());
    }
}
