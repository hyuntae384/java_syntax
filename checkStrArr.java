public class checkStrArr {
  public static void main(String[] args) {
    String[] strArr1 = new String[1];
    String[] strArr2 = new String[2];

    strArr1[0] = "Java";
    strArr2[0] = "Java";
    strArr2[1] = new String("Java");

    System.out.println( strArr1[0] == strArr2[0] ); // 같은 "Java" 객체를 참조
    System.out.println( strArr1[0] == strArr2[1] ); // new로 생성된 String이므로 참조가 다름
    System.out.println( strArr2[0] == strArr2[1] ); // new로 생성된 String이므로 참조가 다름
    System.out.println( strArr1[0].equals(strArr2[1]) ); // equal을 이용해 문자열 자체만 같은지 확인하므로 같은
    System.out.println( strArr2[0].equals(strArr2[1]) ); // equal을 이용해 문자열 자체만 같은지 확인하므로 같은
  }
}