package seo.youn; // 패키지가 서로 다르다

import seo.Protected;

public class ProtectedMain extends Protected {
    public static void main(String[] args){
        ProtectedMain proM = new ProtectedMain();
        System.out.println(proM.laastName);
    }
}

