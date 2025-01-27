class PrivateUniversity extends University {
    private boolean ugcApproved;
    private int numberOfTrusteeMember;

    public PrivateUniversity(String name, String address, int year, int month, int day, int numberOfDepartments,
            boolean ugcApproved, int numberOfTrusteeMember) {
        super(name, address, year, month, day, numberOfDepartments);
        this.ugcApproved = ugcApproved;
        this.numberOfTrusteeMember = numberOfTrusteeMember;
    }

    public boolean isUgcApproved() {
        return ugcApproved;
    }

    public void setUgcApproved(boolean ugcApproved) {
        this.ugcApproved = ugcApproved;
    }

    public int getNumberOfTrusteeMember() {
        return numberOfTrusteeMember;
    }

    public void setNumberOfTrusteeMember(int numberOfTrusteeMember) {
        this.numberOfTrusteeMember = numberOfTrusteeMember;
    }

    @Override
    public String toString() {
        return "Private - " + super.toString() + ", UGC Approved: " + ugcApproved + ", Trustee Members: "
                + numberOfTrusteeMember;
    }
}