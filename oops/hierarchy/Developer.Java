    package hierarchy;

    public class Developer extends Employee{

        private String language;

        Developer(int id,double salary,String name,String language){
            super(id,salary,name);
            this.language=language;
        }

        public void setLanguage(String language){
            this.language = language;
        }

        public String getLanguage(){
            return this.language;
        }

        public void printDetails(){
            super.printDetails();
            System.out.println("Language: "+this.language);
        }
    }