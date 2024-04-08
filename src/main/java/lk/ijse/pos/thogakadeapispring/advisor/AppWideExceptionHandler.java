package lk.ijse.pos.thogakadeapispring.advisor;

import lk.ijse.pos.thogakadeapispring.util.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class AppWideExceptionHandler {
    public ResponseEntity handelException(RuntimeException exception){
        StandardResponse standardResponse = new StandardResponse(
                500,"Error",exception.getMessage()
        );

        return  new ResponseEntity(standardResponse, HttpStatus.OK);
    }
}
