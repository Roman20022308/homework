import java.util.HashMap;

import java.util.Map;
//*Я не списывал у Ярика)

public class CaesarCodec  {
            Map mapsm,mapsd;
            int keyn;
        public CaesarCodec(int key){
            keyn=key;
            Map<Character, Character>mapsd=new HashMap<>();
            Map<Character, Character>mapse=new HashMap<>();
            for (int i=97;i<123;i++)
            {
                mapse.put((char) i,(char) (97+(i-97+keyn%26+26)%26));
                mapse.put(Character.toUpperCase((char) i),Character.toUpperCase((char) (97+(i-97+keyn%26+26)%26)));
            }
            for (int i=97;i<123;i++)
            {
                mapsd.put((char) i,(char) (97+(i-97-keyn%26+26)%26));
                mapsd.put((Character.toUpperCase((char) i)),Character.toUpperCase((char) (97+(i-97-keyn%26+26)%26)));
            }
            this.mapsm=mapse;
            this.mapsd=mapsd;
        }
    public String decode(String input){
        String r="";
        for(int i=0;i<input.length();i++)
        {
            Character n= (Character) mapsd.get(input.charAt(i));
            if(n==null)
            {
                r+=input.charAt(i);
            }
            else {r+=n;}
        }
        return r;
    };
    public String encode(String input){
        String r="";
        for(int i=0;i<input.length();i++)
        {
                Character n= (Character) mapsm.get(input.charAt(i));
                if(n==null)
                {
                    r+=input.charAt(i);
                }
                else {r+=n;}
        }
        return r;
    };
    public static void main(String[] args) {
        CaesarCodec c=new CaesarCodec(3);
        System.out.println(c.encode("aA d,  "));
        System.out.println(c.decode("dD g, "));
        CaesarCodec n=new CaesarCodec(-2);
        System.out.println(n.encode("aA d,  "));
        System.out.println(n.decode("yY b,  ")); }}

