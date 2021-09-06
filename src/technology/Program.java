package technology;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Program {
    Computer test_computer;
    Laptop  test_laptop;
    SmartPhone test_smartphone;

    @Before
    public void createTestObjects() {
        test_computer = new Computer(16, 400, "Hp");
        test_laptop = new Laptop(18, 500, "Apple", 5);
        test_smartphone = new SmartPhone(8, 200, "Samsung", 60);
    }

    @Test
    public void deviceTurnsOn(){
        assertEquals("Power ON", Computer.computerOn());
        assertEquals("Power ON", Laptop.computerOn());
        assertEquals("Power ON", SmartPhone.computerOn());

    }

    @Test
    public void deviceTurnsOFF(){
        assertEquals("Turing off", Computer.computerOff());
        assertEquals("Turing off", Laptop.computerOff());
        assertEquals("Turing off", SmartPhone.computerOff());

    }

    @Test
    public void installingProgram(){
        assertEquals("installation complete", Laptop.installProgram(""));
    }

    @Test
    public void textingSomeone(){
        assertEquals("text sent", SmartPhone.textingSomeone(""));
    }
}
