// Subsystems
class CPU {
    public void start() {
        System.out.println("CPU starting...");
    }
}

class Memory {
    public void load() {
        System.out.println("Memory loading...");
    }
}

class HardDrive {
    public void read() {
        System.out.println("Hard Drive reading...");
    }
}

// Facade
class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        cpu.start();
        memory.load();
        hardDrive.read();
    }
}

// Main
public class FacadePatternDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startComputer();
    }
}
