package cmp;

public class Drive {
    private final DriveType driveType;
    private final float driveVolume;
    private final float driveMass;

    public Drive(DriveType driveType, float driveVolume, float driveMass) {
        this.driveType = driveType;
        this.driveVolume = driveVolume;
        this.driveMass = driveMass;
    }

    public DriveType getDriveType() {
        return driveType;
    }

    public float getDriveVolume() {
        return driveVolume;
    }

    public float getDriveMass() {
        return driveMass;
    }

    @Override
    public String toString() {
        return "Диск: " +
                "тип " + driveType +
                ", объем " + driveVolume + " Гб" +
                ", масса = " + driveMass + " кг\n";
    }
}
