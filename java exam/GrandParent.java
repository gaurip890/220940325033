public class GrandParent
{


    String grandfathername;
    String grandmothername;

    GrandParent(String gfname, String gmname)
    {
        grandfathername = gfname;
        grandmothername = gmname;
        System.out.println(grandfathername);
        System.out.println(grandmothername);
    }
}



class parent extends GrandParent {

    String fathername;
    String mothername;

    parent(String fname, String mname, String gffname, String gmmname) {

        super("parent grandfather", "parent grandmother");
        fathername = fname;
        mothername = mname;
        System.out.println("parent first constructor");
        System.out.println(fathername);
        System.out.println(mothername);

    }
}



//part3
class child extends parent {
     public child(String father, String mother, String grandfather, String grandmother) {
         super(father, mother, grandfather, grandmother);
     }


     public static void main(String[] args) {
         System.out.println("program started");
         GrandParent gp=new GrandParent("hira","vimla");
         parent p= new parent ("father","mother","grandf","grandm");

         child c = new child("alok", "neelima", "hira", "vimla");

         System.out.println("program ended");


     }
 }



