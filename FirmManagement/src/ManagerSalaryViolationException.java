public class ManagerSalaryViolationException extends Exception {
  public ManagerSalaryViolationException() {
    super("The salary of department head or director can not be lower than that of any subordinate");
  }
}
