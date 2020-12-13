public class Telephone {
    private String code_Country;
    private String nomberFirst;
    private String nomberSecond;
    private String nomberThird;
    private String telephone;
    public Telephone(String telephone){
        this.telephone=telephone;
        if(telephone.indexOf("+")==0){
            this.code_Country=telephone.substring(1,2);
            this.nomberFirst=telephone.substring(2,5);
            this.nomberSecond= telephone.substring(5,8);
            this.nomberThird=telephone.substring(8,telephone.length());
        }
        else{
            this.code_Country=telephone.substring(0,1);
            this.nomberFirst=telephone.substring(1,4);
            this.nomberSecond= telephone.substring(4,7);
            this.nomberThird=telephone.substring(7,telephone.length());
        }
    }

    @Override
    public String toString() {
        return "+"+"<"+code_Country+">"+"<"+nomberFirst+">"+"<"+
                nomberSecond+">"+"<"+nomberThird+">";
    }
}
