package oct24;

public class exception {
    class IllegalToDriveException extends Exception {
        public IllegalToDriveException(String message) {
            super(message);
        }

        class DrivingLicenseValidator {

            public void validateAge(int age) throws IllegalToDriveException {
                if (age < 18) {
                    throw new IllegalToDriveException("Not legal to drive: Age is less than 18.");
                } else {
                    System.out.println("Legal to drive!");
                }
            }

            public  void main(String[] args) {
                DrivingLicenseValidator validator = new DrivingLicenseValidator();
                int age = 15;

                try {
                    validator.validateAge(age);
                } catch (IllegalToDriveException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
    }
}





