// Product
class Computer {
    private String CPU;
    private String RAM;
    private String storage;

    public Computer(String CPU, String RAM, String storage) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage + "]";
    }
}

// Builder Interface
interface ComputerBuilder {
    ComputerBuilder setCPU(String CPU);
    ComputerBuilder setRAM(String RAM);
    ComputerBuilder setStorage(String storage);
    Computer build();
}

// Concrete Builder
class ConcreteComputerBuilder implements ComputerBuilder {
    private String CPU;
    private String RAM;
    private String storage;

    @Override
    public ComputerBuilder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    @Override
    public ComputerBuilder setRAM(String RAM) {
        this.RAM = RAM;
        return this;
    }

    @Override
    public ComputerBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    @Override
    public Computer build() {
        return new Computer(CPU, RAM, storage);
    }
}

// Main Class
public class BuilderPatternDemo {
    public static void main(String[] args) {
        Computer computer = new ConcreteComputerBuilder()
                .setCPU("Intel i7")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .build();

        System.out.println(computer);
    }
}
