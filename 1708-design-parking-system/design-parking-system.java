class ParkingSystem {
    int big;
    int medium;
    int small;
    int[] arr;
    public ParkingSystem(int big, int medium, int small) {
        // this.big = big;
        // this.medium = medium;
        // this.small=small;
        arr = new int[3];

        arr[0] = big;
        arr[1] = medium;
        arr[2] = small;
    }
    
    public boolean addCar(int carType) {
        if(arr[carType-1]>0){
            arr[carType-1]--;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */