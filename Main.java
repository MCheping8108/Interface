import java.net.InetAddress;

public class Main {
    public static void main(String[] args) throws Exception{
        // 调用java.net.InetAddress模块，获取IP地址
        InetAddress IP = InetAddress.getLocalHost();

        // 打印到控制台
        System.out.println(IP.getHostAddress());
    }
}
