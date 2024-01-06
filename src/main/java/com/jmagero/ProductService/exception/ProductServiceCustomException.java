package com.jmagero.ProductService.exception;

import com.jmagero.ProductService.model.ErrorResponse;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Data
public class ProductServiceCustomException extends RuntimeException {
    private String errorCode;
    public ProductServiceCustomException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    @ControllerAdvice
    public static class RestResponseExceptionHandler extends ResponseEntityExceptionHandler {
            @ExceptionHandler(ProductServiceCustomException.class)
            public ResponseEntity<ErrorResponse> handleProductServiceException(ProductServiceCustomException ex){
              return new ResponseEntity<>(new ErrorResponse().builder()
                      .errorMessage(ex.getMessage())
                              .errorCode(ex.getErrorCode())
                                      .errorMessage(ex.getMessage())
                                              .build(), HttpStatus.NOT_FOUND);
            }
    }
}
