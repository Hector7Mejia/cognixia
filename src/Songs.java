
    public class Songs {
        private String uName;
        private String email;
        private String designation;
        private String location;

        public String getuName() {
            return uName;
        }
        public void setuName(String uName) {
            this.uName = uName;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String getDesignation() {
            return designation;
        }
        public void setDesignation(String designation) {
            this.designation = designation;
        }
        public String getLocation() {
            return location;
        }
        public void setLocation(String location) {
            this.location = location;
        }
        public Songs(String uName, String email, String designation, String location) {
            super();
            this.uName = uName;
            this.email = email;
            this.designation = designation;
            this.location = location;
        }
        public Songs() {
            super();
            // TODO Auto-generated constructor stub
        }
        @Override
        public String toString() {
            return "Users [uName=" + uName + ", email=" + email + ", designation=" + designation + ", location=" + location
                    + "]";
        }

    }



