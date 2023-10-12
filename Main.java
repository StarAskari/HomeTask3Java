// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.ArrayList;
import java.util.List;

// Engine attributes and method
public class Main {

    public static class Engine {
    }

    public static class CombustionEngine extends Engine {
        // Combustion engine-specific attributes and methods
    }

    public static class HybridEngine extends Engine {
        // Hybrid engine-specific attributes and methods
    }

    public static class ElectricEngine extends Engine {
        // Hybrid engine-specific attributes and methods
    }

    public static class Manufacture {
        // Manufacture attributes and methods with setters and getters
    }

    public static abstract class Vehicle {
        private Manufacture manufacture;
        private Engine engine;

        public Vehicle(Manufacture manufacture, Engine engine) {
            this.manufacture = manufacture;
            this.engine = engine;
        }

        public abstract void ShowCharacteristics();
    }

    public static class ICEV extends Vehicle {
        public ICEV(Manufacture manufacture, Engine engine) {
            super(manufacture, engine);
        }

        @Override
        public void ShowCharacteristics() {
            // Implement characteristics display for ICEV
        }
    }

    public static class BEV extends Vehicle {
        public BEV(Manufacture manufacture, Engine engine) {
            super(manufacture, engine);
        }

        @Override
        public void ShowCharacteristics() {
            // Implement characteristics display for ICEV
        }
    }

    public static class HybridV extends Vehicle {
        public HybridV(Manufacture manufacture, Engine engine) {
            super(manufacture, engine);
        }

        @Override
        public void ShowCharacteristics() {
            // Implement characteristics display for ICEV
        }
    }

    public static void main(String[] args) {
        List<Vehicle> lstVehicle = new ArrayList<>();
        Manufacture manufactureICEV = new Manufacture();
        Engine engineICEV = new Engine();
        Manufacture manufactureBEV = new Manufacture();
        Engine engineBEV = new Engine();
        Manufacture manufactureHybridV = new Manufacture();
        Engine engineHybridV = new Engine();
        ICEV icev = new ICEV(manufactureICEV, engineICEV);
        BEV bev = new BEV(manufactureBEV, engineBEV);
        HybridV hybridv = new HybridV(manufactureHybridV, engineHybridV);
        lstVehicle.add(icev);
        lstVehicle.add(bev);
        lstVehicle.add(hybridv);

        }

    }


