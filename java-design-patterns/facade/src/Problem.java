public class Problem {

    // Complex subsystems
    static class HomeLight {
        public void switchOn() {
            System.out.println("Lights are switched on");
        }

        public void switchOff() {
            System.out.println("Lights are switched off");
        }
    }

    static class HomeTemperature {
        private Integer temp;

        public Integer getTemp() {
            return temp;
        }

        public void setTemp(Integer temp) {
            this.temp = temp;
            System.out.println("Current temperature is :: " + this.temp);
        }
    }

    static class HomeSecurity {
        public void armed() {
            System.out.println("Security System is armed");
        }

        public void unarmed() {
            System.out.println("Security system is unarmed");
        }
    }

    public static void main(String[] args) {
        System.out.println("Home Management System");
        
        HomeLight homeLight = new HomeLight();
        HomeSecurity homeSecurity = new HomeSecurity();
        HomeTemperature homeTemperature = new HomeTemperature();
        
        System.out.println("===========================AWAY FROM HOME================================");
        homeLight.switchOff();
        homeSecurity.armed();
        homeTemperature.setTemp(12);

        System.out.println("================================IN HOME==================================");
        homeLight.switchOn();
        homeSecurity.unarmed();
        homeTemperature.setTemp(25);
    }

}
