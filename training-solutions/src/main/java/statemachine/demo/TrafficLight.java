package statemachine.demo;

public enum TrafficLight {
    RED {
        TrafficLight next() {
            return TrafficLight.RED_YELLOW;
        }
    },

    RED_YELLOW {
        TrafficLight next() {
            return TrafficLight.GREEN;
        }
    },
    GREEN {
        TrafficLight next() {
            return TrafficLight.YELLOW;
        }
    },
    YELLOW {
        TrafficLight next() {
            return TrafficLight.RED;
        }
    };

// a metódus nem enum szintjén, hanem az enum elemeinek a szintjén van deklarálva
    // kötelező deklarálni a next() metódust - abstract
    abstract TrafficLight next();
}
