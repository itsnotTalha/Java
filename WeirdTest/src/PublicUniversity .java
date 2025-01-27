class PublicUniversity extends University {
    private int numberOfHalls;
    private boolean politicsAllowed;

    public PublicUniversity(String name, String address, int year, int month, int day , int numberOfDepartments,
            int numberOfHalls, boolean politicsAllowed) {
        super(name, address, year, month, day, numberOfDepartments);
        this.numberOfHalls = numberOfHalls;
        this.politicsAllowed = politicsAllowed;
    }

    public int getNumberOfHalls() {
        return numberOfHalls;
    }

    public void setNumberOfHalls(int numberOfHalls) {
        this.numberOfHalls = numberOfHalls;
    }

    public boolean isPoliticsAllowed() {
        return politicsAllowed;
    }

    public void setPoliticsAllowed(boolean politicsAllowed) {
        this.politicsAllowed = politicsAllowed;
    }

    @Override
    public String toString() {
        return "Public - " + super.toString() + ", Halls: " + numberOfHalls + ", Politics Allowed: " + politicsAllowed;
    }
}