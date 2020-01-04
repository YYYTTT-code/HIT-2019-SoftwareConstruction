package exception;

public class ObjectExp extends RuntimeException {

  private String expMsg = "MyException";

  public ObjectExp(String expMsg) {
    this.expMsg = expMsg;
  }

  public String getExpMsg() {
    return expMsg;
  }

  public void setExpMsg(String expMsg) {
    this.expMsg = expMsg;
  }

  @Override
  public String toString() {
    return "轨道物体错误\t" + this.expMsg + "\n";
  }


  /**
   * 实现assertTrue的断言功能，如果cond为假则抛出异常，使用该函数进行输入合法判断.
   * @param cond 判断
   * @param msg 异常信息
   * @throws ReadFileExp .
   */
  public static void assertTrue(boolean cond, String msg) throws ReadFileExp {
    if (!cond) {
      throw new ReadFileExp(msg);
    }
  }
}
