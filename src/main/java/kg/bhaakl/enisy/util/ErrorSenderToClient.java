package kg.bhaakl.enisy.util;

import kg.bhaakl.enisy.exceptions.UserException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.ArrayList;
import java.util.List;

public class ErrorSenderToClient {
    public static List<String> returnErrorsToClient(BindingResult bindingResult) {
        List<String> result = new ArrayList<>();
        if (bindingResult.hasErrors()) {
            List<FieldError> errors = bindingResult.getFieldErrors();
            for (FieldError error : errors) {
                String errorMsg = error.getField() +
                        " - " + (error.getDefaultMessage() == null ? error.getCode() : error.getDefaultMessage()) +
                        "; ";
                result.add(errorMsg);
            }
        }
        return result;
    }
}
