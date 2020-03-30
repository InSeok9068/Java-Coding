package Java.Coding;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapDiff {
	  public static void main(String[] args) {
	    HashMap<String, Object> hashMap = new HashMap<String, Object>();

	    hashMap.put("one", "1번");
	    hashMap.put("two", "2번");
	    hashMap.put("three", "3번");
	    hashMap.put("four", "4번");
	    hashMap.put("five", "5번");

	    System.out.println(hashMap.toString());

	    LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();

	    linkedHashMap.put("one", "1번");
	    linkedHashMap.put("two", "2번");
	    linkedHashMap.put("three", "3번");
	    linkedHashMap.put("four", "4번");
	    linkedHashMap.put("five", "5번");

	    System.out.println(linkedHashMap.toString());
	  }
	}