package ujkhatri.handlers;

//import org.springframework.http.HttpStatusCode;
//import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
class ErrorHandlingControllerAdvice {
    @ExceptionHandler
    public String handleException(Exception ex) {
        System.out.println(ex.toString());
        return "Some error occurred";
//        var problemDetail = ProblemDetail.forStatus(HttpStatusCode.valueOf(500));
//        problemDetail.setDetail("The record not found");
//        return problemDetail;
    }
}

