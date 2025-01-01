package learningJava;

import java.security.Key;
import java.util.HashMap;

import javax.print.DocFlavor.STRING;
import javax.xml.crypto.dsig.keyinfo.KeyValue;

import org.apache.commons.compress.archivers.StreamingNotSupportedException;
import org.apache.poi.ss.formula.functions.Value;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, String> hm1=new HashMap<String, String>();
		hm1.put("qa", "url");
		hm1.put("uat", "url");
		System.out.println(hm1);
		System.out.println(hm1.keySet());
		for(String key:hm1.keySet())
		{
			System.out.println("Value is: " + hm1.get(key));
		}
	}

}
