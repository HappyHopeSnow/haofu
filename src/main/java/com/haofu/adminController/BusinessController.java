package com.haofu.adminController;

import com.haofu.output.UnifiedResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jackie on 2015/8/5.
 * Email : chenxinhua@ishehui.com
 * 第三方入驻商家的信息
 */
@Controller
@RequestMapping("admin/business")
public class BusinessController {

    @RequestMapping("tolist")
    public String toList() {
        return "admin/business/list";
    }

    @RequestMapping("list")
    @ResponseBody
    public Map<String, Object> list() {
        final HashMap<String, Object> returnMap = new HashMap<String, Object>();
        return returnMap;
    }

    @RequestMapping("toadd")
    public String toAdd() {
        return "admin/business/add";
    }

    @RequestMapping("toedit")
    public String toEdit(Long id, Model model) throws InvocationTargetException, IllegalAccessException {
        return "admin/business/add";
    }

    /**
     * 新增或编辑seller
     *
     */
    @RequestMapping("saveorupdate")
    @ResponseBody
    public UnifiedResponse saveOrUpdate() {
        final UnifiedResponse unifiedResponse = new UnifiedResponse();
        return unifiedResponse;
    }

}
