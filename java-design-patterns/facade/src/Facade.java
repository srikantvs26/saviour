public class Facade {

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

    public static class HomeManagementFacade {
        private HomeLight homeLight;
        private HomeSecurity homeSecurity;
        private HomeTemperature homeTemperature;

        public HomeManagementFacade() {
            this.homeLight = new HomeLight();
            this.homeSecurity = new HomeSecurity();
            this.homeTemperature = new HomeTemperature();
        }

        public void awayFromHome() {
            System.out.println("===========================AWAY FROM HOME================================");
            homeLight.switchOff();
            homeSecurity.armed();
            homeTemperature.setTemp(12);
        }

        public void inHome() {
            System.out.println("================================IN HOME==================================");
            homeLight.switchOn();
            homeSecurity.unarmed();
            homeTemperature.setTemp(25);
        }

    }

    public static void main(String[] args) {
        System.out.println("Home Management System");
        HomeManagementFacade homeManagementFacade = new HomeManagementFacade();
        homeManagementFacade.awayFromHome();
        homeManagementFacade.inHome();
    }

}
