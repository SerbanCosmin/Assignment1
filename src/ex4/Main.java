//package ex4;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//
//    abstract class Device {
//        protected int price;
//
//        public Device(int price) {
//            this.price = price;
//        }
//
//        public int getPrice() {
//            return price;
//        }
//    }
//
//    class Keyboard extends Device {
//        public Keyboard(int price) {
//            super(price);
//        }
//    }
//
//    class USB extends Device {
//        public USB(int price) {
//            super(price);
//        }
//    }
//
//    public class ElectronicsShop {
//
//        public static int cheapestdevice(List<Device> devices) {
//            if (devices.isEmpty()) return -1;
//            int minPrice = devices.get(0).getPrice();
//            for (Device device : devices) {
//                if (device.getPrice() < minPrice) {
//                    minPrice = device.getPrice();
//                }
//            }
//            return minPrice;
//        }
//
//        public static int expensivedevice(List<Device> devices) {
//            if (devices.isEmpty()) return -1;
//            int maxPrice = devices.get(0).getPrice();
//            for (Device device : devices) {
//                if (device.getPrice() > maxPrice) {
//                    maxPrice = device.getPrice();
//                }
//            }
//            return maxPrice;
//        }
//
//        public static int expensivebudget(List<USB> usbDrives, int budget) {
//            int maxAffordablePrice = -1;
//            for (USB usb : usbDrives) {
//                int price = usb.getPrice();
//                if (price <= budget && price > maxAffordablePrice) {
//                    maxAffordablePrice = price;
//                }
//            }
//            return maxAffordablePrice;
//        }
//
//        public static int maxspendbudget(List<Keyboard> keyboards, List<USB> usbDrives, int budget) {
//            int maxSpend = -1;
//            for (Keyboard keyboard : keyboards) {
//                for (USB usb : usbDrives) {
//                    int totalCost = keyboard.getPrice() + usb.getPrice();
//                    if (totalCost <= budget && totalCost > maxSpend) {
//                        maxSpend = totalCost;
//                    }
//                }
//            }
//            return maxSpend;
//        }
//
//        public static void main(String[] args) {
//            // Initialize list of keyboards
//            List<Keyboard> keyboards = new ArrayList<>();
//            keyboards.add(new Keyboard(40));
//            keyboards.add(new Keyboard(35));
//            keyboards.add(new Keyboard(70));
//            keyboards.add(new Keyboard(15));
//            keyboards.add(new Keyboard(45));
//
//            // Initialize list of USB drives
//            List<USB> usbDrives = new ArrayList<>();
//            usbDrives.add(new USB(20));
//            usbDrives.add(new USB(15));
//            usbDrives.add(new USB(40));
//            usbDrives.add(new USB(15));
//
//            int budget1 = 30;
//            int budget2 = 60;
//
//            System.out.println("Gunstigste Tastatur" + cheapestdevice(new ArrayList<>(keyboards)));
//            System.out.println("Teuersten Artikel: " + expensivedevice(new ArrayList<>(usbDrives)));
//            System.out.println("Teuersten USB im Budget: " + expensivebudget(usbDrives, budget1));
//            System.out.println("Maximale Ausgaben in Budget: " + maxspendbudget(keyboards, usbDrives, budget2));
//        }
//    }
//}