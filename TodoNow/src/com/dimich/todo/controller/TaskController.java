package com.dimich.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.dimich.common.todo.business.RequestContext;
import com.dimich.common.todo.business.Task;
import com.dimich.common.todo.service.TaskService;
import com.dimich.todo.annotation.DeprecatedEndpoint;
import com.dimich.todo.controller.converter.TaskConverter;
import com.dimich.todo.controller.dto.TaskDto;

@Controller
public class TaskController {

	@Autowired
	TaskService taskService;

	@Autowired
	TaskConverter converter;

	
	
	
}
