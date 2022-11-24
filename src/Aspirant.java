public class Aspirant extends  Student{
    private boolean scientificWork;
    public Aspirant(String firstName, String lastName,
                    String group,
                    double averageMark, boolean  scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }
        @Override
        public void getScholarship(){
            if(getAverageMark() == 5){
                System.out.println("Сумма вашей стипендии 2000 сом ");
            }else{
                System.out.println("Сумма вашей стипендии 1800 сом ");
            }
        }
    }
