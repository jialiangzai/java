
// 导入数据输入包
import java.util.Scanner;
public class scanner {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  // 请输入第一个和尚的身高
  System.out.println("请输入第一个和尚的身高");
  int height1 = sc.nextInt();
  // 请输入第二个和尚的身高
  System.out.println("请输入第二个和尚的身高");
  int height2 = sc.nextInt();
  // 请输入第三个和尚的身高
  System.out.println("请输入第三个和尚的身高");
  int height3 = sc.nextInt();
  // 最大身高
  int templateHeight = height1>height2?height1:height2;
  int maxHeight = templateHeight>height3?templateHeight:height3;
  System.out.println("三个和尚最高的身高为:"+maxHeight+"cm");
}
}