package tw.idv.hunterchen.lab.net;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

/*對照
 * Windows 裝置管理員 網路介面卡
 * 
 */
@Slf4j
public class Ex_NetworkInterface {
	
	public static void showAllNIC(String[] args) {
		Enumeration<NetworkInterface> niList=null;
		try {
			niList = NetworkInterface.getNetworkInterfaces();
		} catch (SocketException e) {
			e.printStackTrace();
		}
		Iterator<NetworkInterface> iterator = niList.asIterator();
		iterator.forEachRemaining(ni->{
			log.info("{}:{}", ni.getIndex(), ni.toString());
		});
		
		
	}
	public static void main(String[] args) {
		Enumeration<NetworkInterface> niList=null;
		try {
			niList = NetworkInterface.getNetworkInterfaces();
		} catch (SocketException e) {
			e.printStackTrace();
		}
		Iterator<NetworkInterface> iterator = niList.asIterator();
		iterator.forEachRemaining(ni->{
			log.info("{}:{}", ni.getIndex(), ni.toString());
		});
		
	
	}

}
