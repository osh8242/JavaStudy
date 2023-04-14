//영화 예매하기
package kr.or.kosa.dto;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cinema {
   
   public int inputIntValue;
   public int[] choice;   
   public String[][] seat;   
   public static int resNum;   
   public int[][] resSeat;
   
   public Cinema(int row, int col) {
      this.seat = new String[row][col];
      for (int i = 0 ; i < row ; i++) {
         for (int j = 0 ; j < col ; j++) {
            this.seat[i][j] = (i+1)+"-"+(j+1);
         }         
      }
      
      this.resSeat = new int[row][col];
      for (int i = 0 ; i < row ; i++) {
         for (int j = 0 ; j < col ; j++) {
            this.resSeat[i][j] = 0;
         }         
      }      
      this.choice = new int[2];
      this.inputIntValue = 0;
   }
   static {
      resNum = 0;
   }
   
   public int showMenu() {
      System.out.println("************************");
      System.out.println("****** 영화 예매하기 ******");
      System.out.println("************************");
      System.out.println("1. 예매하기");
      System.out.println("2. 예매조회");
      System.out.println("3. 예매취소");
      System.out.println("-원하시는 메뉴의 번호를 입력해주세요-");
      return inputIntValue();
   }
   
   public void showSeat(String[][] seat) {
      for (int i = 0 ; i < seat.length ; i++) {
         for (int j = 0 ; j < seat[i].length ; j++) {
            System.out.printf("[%s]",seat[i][j]);
         }
         System.out.println();
      }
   }
   
   //정수를 입력받아 출력하는 함수
   public int inputIntValue() { 
      Scanner sc = new Scanner(System.in);
      this.inputIntValue = sc.nextInt();
      System.out.println();
      return this.inputIntValue;
   }
   
   // 좌석 "4-5"를 입력받아 int[]배열 [4,5]로 출력하는 함수
   public void inputStrValue() { 
      Scanner sc = new Scanner(System.in);
      String inputStrValue = sc.nextLine();
      System.out.println();
      String[] result = inputStrValue.split("-");
      for(int i = 0 ; i < this.choice.length ; i++) {
         this.choice[i] = Integer.parseInt(result[i])-1;
      }
   }
   
   public void selectSeat() {
      System.out.println("예매하고 싶으신 좌석을 선택해주세요.");
      System.out.println("입력예시) 1-1");
      inputStrValue();      
   }
   
   public boolean isReserved(int[] choice) {
      if(seat[choice[0]][choice[1]].equals("불가")) {
         System.out.println("해당 좌석은 예매가 불가능합니다");
         return true;
      } else {
         System.out.println("해당 좌석은 예매가 가능합니다");
         return false;}
   }
   
   public int ruSureReservation() {
      System.out.println("예매하시겠습니까?");
      System.out.println("1.네\t2.아니오");
      return inputIntValue();
   }
   
   public void reservation(int[] choice) {
      this.seat[choice[0]][choice[1]] = "불가";      
      resNum++;
      this.resSeat[choice[0]][choice[1]] = resNum;
      showReservation(choice);
   }
   
   public void showReservation(int[] choice) {
      System.out.println("예매정보");
      System.out.println("예약번호 : "+resNum);
      System.out.println("좌석 : "+(choice[0]+1)+"-"+(choice[1]+1));
      goToMenu();
   }
   
   public void checkRes() {
      System.out.println("예약번호로 좌석을 조회합니다");
      System.out.println("예약번호를 입력하세요");
      inputIntValue();
      if(resNumToSeat(this.inputIntValue)) {
         System.out.println("예약번호 : "+this.inputIntValue);
          System.out.println("예약좌석 : "+(this.choice[0]+1)+"-"+(this.choice[1]+1)); 
      } else {
         System.out.println("해당 예약번호로 조회된 정보가 없습니다");
      }
      goToMenu();
   }
   
   public void removeRes() {      
      System.out.println("취소할 예약번호를 입력하세요");
      inputIntValue();
      if(resNumToSeat(this.inputIntValue)) {
         System.out.println("["+(this.choice[0]+1)+"-"+(this.choice[1]+1)+"] 좌석을 취소하시겠습니까?");
          System.out.println("1.예\t2.아니오");
          inputIntValue();
          if(inputIntValue ==1) {
             resSeat[this.choice[0]][this.choice[1]] = 0;
             seat[this.choice[0]][this.choice[1]] = (this.choice[0]+1)+"-"+(this.choice[1]+1);         
             System.out.println("예약이 취소되었습니다.");
             goToMenu();
          } else {System.out.println("초기화면으로 돌아갑니다");}
      } else {
         System.out.println("해당 예약번호로 조회된 정보가 없습니다");
         goToMenu();
      }
         
   }
   
   public void goToMenu() {
      System.out.println("초기화면으로 돌아갑니다\n");       
   }
   
   public boolean resNumToSeat(int inputIntValue) {
      for (int i = 0 ; i < this.resSeat.length ; i++) {
            for (int j = 0 ; j < this.resSeat[i].length ; j++) {
               if(resSeat[i][j] == this.inputIntValue) {
                  this.choice[0] = i;
                  this.choice[1] = j;
                  return true;
               }
            }
         }
      return false;
   }
   
   public void run() {
      boolean runState = true;
      do {
         try {
            switch(showMenu()) {
               case 1:{
                  showSeat(this.seat);
                  selectSeat();
                  if(isReserved(this.choice)) {continue;}
                  else if(ruSureReservation()==1) {
                     reservation(this.choice);
                     continue;
                  } else {ㅌ
                     goToMenu();
                     continue;
                     }
               }            
               case 2:{
                  checkRes();
                  continue;
               }
               case 3:{
                  removeRes();
                  continue;
               }
               case 123456789:{
                  System.out.println("프로그램을 종료합니다");
                  runState = false;
                  continue;
               }
               default:{
                  System.out.println("올바른 메뉴번호를 입력해주세요\n");
               }
         }
         } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
            System.out.println("잘못된 값을 입력하셨습니다");
            System.out.println("초기화면으로 돌아갑니다\n");
            continue;
         } catch (Exception e) {
            System.out.println("초기화면으로 돌아갑니다\n");
         }
      } while(runState);
   }
   
}