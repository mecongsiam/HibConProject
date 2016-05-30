package com.javahash.hibernate.controller.command;

import com.javahash.hibernate.bean.Request;
import com.javahash.hibernate.bean.Response;

/**
 * Created by meco on 29.05.2016.
 */
public interface Command {
    Response execute(Request request);


}
