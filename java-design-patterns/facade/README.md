Facade Design pattern
-----------------------
Facade design pattern ka maqsad hai system ko simplify karna. Jab hum ek complex system ya software banate hain, usme kai saare components hote hain jo milkar kaam karte hain. Har component ka apna ek set of functions hote hain. Agar humein in components ke functions use karne ho to har ek se alag-alag deal karna padta hai, jo kaafi mushkil aur confusing ho sakta hai.

Facade pattern ek "facade" (simple interface) provide karta hai jo in sab complex operations ko chhupa deta hai aur users ko ek simple interface deta hai jiske zariye woh aasani se kaam kar sakte hain.

Real-world Example:
--------------------
Sochiye aapke paas ek ghar hai jisme alag-alag systems hain jaise lighting system, heating system, aur security system. In systems ko manually operate karna kaafi mushkil ho sakta hai, kyunki har system ke apne control methods hote hain.

Without Facade:
----------------
Lighting system ke liye aapko har switch on/off karna padta hai.
Heating system ke liye aapko thermostat set karna padta hai.
Security system ke liye aapko alarm set karna padta hai.
Yeh sab karna thoda tedious aur time-consuming hai.

With Facade:
--------------
Ek smart home controller (Facade) imagine kijiye jo in sab systems ko ek single interface se control karne ka option de. Ab aapke paas sirf ek remote ya mobile app hai jisse aap:

Lights on/off kar sakte hain.
Heating set kar sakte hain.
Security alarm activate kar sakte hain.
Aapko bas ek button press karna hai aur sab systems automatically manage ho jate hain.

Coding Example:
C++ ya Java mein iska implementation kuch aisa hoga:

// Complex subsystems
class Light {
    public void on() { System.out.println("Light is on"); }
    public void off() { System.out.println("Light is off"); }
}

class Heater {
    public void setTemperature(int temp) { System.out.println("Heater temperature set to " + temp); }
}

class Security {
    public void arm() { System.out.println("Security system armed"); }
    public void disarm() { System.out.println("Security system disarmed"); }
}

// Facade
class SmartHomeFacade {
    private Light light;
    private Heater heater;
    private Security security;

    public SmartHomeFacade() {
        this.light = new Light();
        this.heater = new Heater();
        this.security = new Security();
    }

    public void homeMode() {
        System.out.println("Switching to Home Mode:");
        light.on();
        heater.setTemperature(22);
        security.disarm();
    }

    public void awayMode() {
        System.out.println("Switching to Away Mode:");
        light.off();
        heater.setTemperature(18);
        security.arm();
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        SmartHomeFacade smartHome = new SmartHomeFacade();
        smartHome.homeMode();
        smartHome.awayMode();
    }
}
Conclusion:
Facade pattern aapko complex systems ko easily manage karne ka tareeka provide karta hai. Is pattern ka use karke aap apne code ko simple aur user-friendly bana sakte hain. 