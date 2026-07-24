class GetSet {
    private String name; 

    public String getName() { 
        return name; 
    } 

    public void setName(String name) {
        this.name = name; 
    }
}

class capp {
    public static void main(String[] args) {
        GetSet obj = new GetSet(); 
        
        obj.setName("Good Morning");
        System.out.println(obj.getName()); 
    }
}