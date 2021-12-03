package methodstructure.pendrives;

import java.util.List;

public class Pendrives {

    public Pendrive getBest(List<Pendrive> pendriveList) {
        Pendrive minPendrive = pendriveList.get(0);
        for (int i = 0; i < pendriveList.size(); i++) {
            if (minPendrive.comparePricePerCapacity(pendriveList.get(i)) == 1) {
                minPendrive = pendriveList.get(i);
            }
        }
        return minPendrive;
    }

    public Pendrive getCheapest(List<Pendrive> pendriveList) {
        Pendrive cheapPendrive = pendriveList.get(0);
        for (int i = 0; i < pendriveList.size(); i++) {
            if (pendriveList.get(i).isCheaperThan(cheapPendrive)) {
                cheapPendrive = pendriveList.get(i);
            }
        }
        return cheapPendrive;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendriveList, int percent, int capacity) {
        for (Pendrive p : pendriveList) {
            if (p.getCapacity() == capacity) {
                p.risePrice(percent);
            }
        }
    }
}