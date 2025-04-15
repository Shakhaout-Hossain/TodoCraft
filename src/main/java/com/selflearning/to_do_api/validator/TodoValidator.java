package com.selflearning.to_do_api.validator;

import com.selflearning.to_do_api.exception.TodoBadRequestException;
import com.selflearning.to_do_api.model.Todo;
import com.selflearning.to_do_api.utils.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class TodoValidator implements ITodovalidator {
    @Override
    public void validate(Todo todo){
        if(StringUtils.isBlank(todo.getTitle())){
            throw new TodoBadRequestException("Title is mandatory");
        }
        if(StringUtils.isBlank(todo.getDescription())){
            throw new TodoBadRequestException("Description is mandatory");
        }
        if(StringUtils.isBlank(todo.getCompleted())){
            throw new TodoBadRequestException("Completed is mandatory");
        }
    }
}
