import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class listTest {

    public  static  void     main(String args[]){


        class entity{
            List<String> item;

            void setItem(List<String> item){
                this.item = item;
            }
            List getItem(){
                return item;
            }
        }
        entity entity = new entity();

        List<String > list = new ArrayList<String>();
        entity.setItem(list);
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        List li = entity.getItem();
        entity.getItem().remove("a");
       for(Object s : li){
           System.out.println("entity value is "+ s);

       }

        HashMap<String ,List<String>> map = new HashMap<>();
        for(String item : list){
            map.put(item,list);
        }
        map.get("b").add("a");
        List list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");

        for(String s : map.get("b")){
            System.out.println("value is "+ s);
        }
        System.out.println("======================");
        map.get("b").remove(list2);

        for(String s : map.get("b")){
            System.out.println("value is "+ s);
        }



        System.out.println("dev-100开发！");

        System.out.println("dev-100-001开发！");
    }
}
