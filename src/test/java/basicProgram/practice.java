package basicProgram;

 class practice {

     String model;

   practice(String model)
   {
       this.model = model;
   }

   void compare(practice p)
   {
        if(this.model.equals(p.model))
        {
            System.out.println("It is of same model");
        }
        else
        {
            System.out.println("It is of different model");
        }
   }

    public static void main(String[] args) {

        practice p1 = new practice("Tesla");
        practice p2 = new practice("Tesla");

        p1.compare(p2);
        p2.compare(p1);

    }
}
