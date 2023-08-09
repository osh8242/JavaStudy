/*
    java api는 네트워크 작업을 지원하기 위해서 ...
    java.net .... 다양한 클래스 제공

    1. 크로스 도메인 오류 (java 코드 처리 : read)
    2. 크롤링 (특정 페이지 원하는 정보 추출)
*/

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class Ex01_URLConnection {
    public static void main(String[] args) throws IOException {
        //사진 URL
        String urlstr = "https://contents.kyobobook.co.kr/sih/fit-in/458x0/pdt/9791191891287.jpg";

        URL url = new URL(urlstr);
        BufferedInputStream bis = new BufferedInputStream(url.openStream());
        URLConnection uc = url.openConnection();

        //URLConnection 연결된 주소에서 원하는 정보를 추출하기
        int fileSize = uc.getContentLength();
        String contentType = uc.getContentType();
        System.out.println("fileSize = " + fileSize);
        System.out.println("contentType = " + contentType);

        //read 복제....
        FileOutputStream fos = new FileOutputStream("copyimage.jpg");
        //파일생성(빈), 프로젝트 폴더가 default 경로

        byte[] buffer = new byte[4096];
        int n = 0;
        int count = 0;
        while ((n = bis.read(buffer)) != -1) {
            fos.write(buffer,0,n);
            fos.flush();
            System.out.println("n : " + n);
            count ++;
        }
        System.out.println("count = " + count);
        fos.close();
        bis.close();
    }
}
