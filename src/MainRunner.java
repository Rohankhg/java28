
public class MainRunner {
        private String make;
        private double radius;
        private String color;

        public MainRunner(String make, double radius, String color){
            this.make= make;
            this.radius=radius;
            this.color=color;
        }
       public String toString(){
            return String.format("make-%s, radius-%f, color-%s",make,radius,color);
       }

}
