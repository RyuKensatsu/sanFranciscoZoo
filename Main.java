package zoo;

import java.util.*;

public class Main {
    public static void main(String[] args){
        List<Soigneurs> soigneurs = new ArrayList<>();
        SoigneurManagerIntf sm = new SoigneurManager();
        System.out.println("Bienvenue à toi dans ton zoo !\nNous allons créer un premier soigneur pour commencer :)");
        Soigneurs bily = sm.newSoigneur();
        soigneurs.add(bily);
        sm.getStats(soigneurs.get(0));
        AnimalManagerIntf am = new AnimalManager();
        Animal bob = am.adoptAnimal();

    }
}
