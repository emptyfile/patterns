package com.company.Builder;

public class DeluxeVisit {
    private String doctorName;
    private String visitTime;
    private DoctorOffice doctorOffice;
    private String massage;
    private String procedure;

    private DeluxeVisit(DeluxeVisitBuilder deluxeVisitBuilder) {
        this.doctorName = deluxeVisitBuilder.doctorName;
        this.visitTime = deluxeVisitBuilder.visitTime;
        this.doctorOffice = deluxeVisitBuilder.doctorOffice;
        this.massage = deluxeVisitBuilder.massage;
        this.procedure = deluxeVisitBuilder.procedure;
    }

    public static class DeluxeVisitBuilder{
        private String doctorName;
        private String visitTime;
        private DoctorOffice doctorOffice;
        private String massage;
        private String procedure;

        public DeluxeVisitBuilder(String doctorName, String visitTime) {
            if (doctorName == null || visitTime == null) {
                throw new IllegalArgumentException("doctor`s name and time can not be null");
            }
            this.doctorName = doctorName;
            this.visitTime = visitTime;
        }

        public DeluxeVisitBuilder addDoctorOffice(DoctorOffice doctorOffice){
            this.doctorOffice = doctorOffice;
            return this;
        }

        public DeluxeVisitBuilder addMassage(String massage){
            this.massage = massage;
            return this;
        }

        public DeluxeVisitBuilder addProcedure(String procedure){
            this.procedure = procedure;
            return this;
        }

        public DeluxeVisit build() {
            return new DeluxeVisit(this);
        }
    }
}
