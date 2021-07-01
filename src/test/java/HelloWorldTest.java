
public class HelloWorldTest {

    HelloWorld hw = new HelloWorld();
    void setUp() {
    }

    void tearDown() {
    }

    public void testSayHello(){
        assert("Hello World".equalsIgnoreCase(hw.sayHello()) );
    }
}