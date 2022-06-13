import entity.Alphinist;
import entity.GroupList;
import entity.Mountain;

public class Application {
    public static void main(String[] args) {

        Mountain mountain1 = new Mountain("Джомолу́нгма", "Китай", 8848);
        Mountain mountain2 = new Mountain("Эльбрус", "Россия", 5642);
        Mountain mountain3 = new Mountain("Килиманджа́ро", "Танзания", 5881);

        GroupList groupList1 = new GroupList(mountain1);
        GroupList groupList2 = new GroupList(mountain2);
        GroupList groupList3 = new GroupList(mountain3);

        Alphinist alpinists1 = new Alphinist("Анна", "адрес 1");
        Alphinist alpinists2 = new Alphinist("Артем", "адрес 2");
        Alphinist alpinists3 = new Alphinist("София", "адрес 3");
        Alphinist alpinists4 = new Alphinist("Александр", "адрес 4");
        Alphinist alpinists5 = new Alphinist("Виктория", "адрес 5");
        Alphinist alpinists6 = new Alphinist("Максим", "адрес 6");
        Alphinist alpinists7 = new Alphinist("Дарья", "адрес 7");

        groupList1.addAlpinist(alpinists1, alpinists2);
        groupList2.addAlpinist(alpinists3, alpinists4, alpinists5);
        groupList3.addAlpinist(alpinists6, alpinists7);

    }
}
