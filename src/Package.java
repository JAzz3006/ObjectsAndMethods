public class Package {

    private final float mass;
    private  final String address;
    private final boolean isTurnable;
    private final String regNumber;
    private final boolean isFragile;
    private final Dimensions dimensions;

    public Package(float mass, String address, boolean isTurnable, String regNumber, boolean isFragile, Dimensions dimensions) {
        this.mass = mass;
        this.address = address;
        this.isTurnable = isTurnable;
        this.regNumber = regNumber;
        this.isFragile = isFragile;
        this.dimensions = dimensions;
    }

    public float getMass() {
        return mass;
    }

    public String getAddress() {
        return address;
    }

    public boolean isTurnable() {
        return isTurnable;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public boolean isFragile() {
        return isFragile;
    }

    public float getVolume(){
        return dimensions.getVolume();
    }

    public Package changeAddress(String address){
        return new Package(mass, address,  isTurnable, regNumber, isFragile, dimensions);
    }

    public Package changeMass(float mass){
        return new Package(mass, address,  isTurnable, regNumber, isFragile, dimensions);
    }

    public Package changeDimensions(Dimensions dimensions){
        return new Package(mass, address,  isTurnable, regNumber, isFragile, dimensions);
    }
    @Override
    public String toString() {
        return "Package{" +
                "mass=" + mass +
                ", address='" + address + '\'' +
                ", isTurnable=" + isTurnable +
                ", regNumber='" + regNumber + '\'' +
                ", isFragile=" + isFragile +
                ", dimensions=" + dimensions +
                '}';
    }
}
