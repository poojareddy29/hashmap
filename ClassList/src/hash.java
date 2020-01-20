import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class hash {
public static void main(String[] args) {
// TODO Auto-generated method stub
hash classgrades = new hash();
classgrades.printClassList();
classgrades.printClassList2();

}
Map<String,String> classgrades = new HashMap<String,String>();
public hash() {
classgrades.put("Bob","A");
classgrades.put("Mary","C");
classgrades.put("Sarah","B");
classgrades.put("Philip","A");
classgrades.put("Greg","F");
}

public void printClassList() {
Iterator<Entry<String, String>> entries = classgrades.entrySet().iterator();
while (entries.hasNext()) {
Entry<String, String> entry = entries.next();
System.out.println("Key = " +entry.getKey() + " ,Value = " + entry.getValue());
}
}


public void printClassList2() {
for(Map.Entry<String, String> entry : classgrades.entrySet()) {
  System.out.println("Key = " +entry.getKey() + " ,Value = " + entry.getValue());
}

for (String key : classgrades.keySet()) {
System.out.println("Key = " + key);
}

for (String value : classgrades.values()) {
System.out.println("Values = " + value);
}

}
}


