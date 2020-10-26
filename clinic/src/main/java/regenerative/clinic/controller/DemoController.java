package regenerative.clinic.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import regenerative.clinic.form.DemoForm;
import regenerative.clinic.service.DemoService;

@RequestMapping("clinic/*")
@Controller
public class DemoController {

	@Autowired
    private DemoService demoService;
    /*
     * 初期表示
     */
    @RequestMapping(value="/test", method= RequestMethod.GET)
    @ResponseBody
    public String test() {
        return "demo";
    }

    /*
     * Insertボタン押下
     */
    @RequestMapping(value="/test", method=RequestMethod.POST)
    public String insert(
            @RequestParam(value = "target") String target,
            HttpSession session
    ) {
        if (StringUtils.isEmpty(target)) {
            session.setAttribute("message", "NG,テキストに値を入力してください。");
            return "demo";
        }

        if (!(demoService.add(target))) {
            session.setAttribute("message", "NG,DB更新が失敗しました。");
            return "demo";
        }

        session.setAttribute("message", "OK");
        return "demo";
    }

    /*
     * jumpToSessionボタン押下
     */
    @RequestMapping(value="/test", params = "jumpToSession", method=RequestMethod.POST)
    public String jumpToSession(@RequestParam("target") String target, HttpSession session) {
        session.setAttribute("display", target);
        return "session";
    }

    /*
     * JumpToFormボタン押下
     */
    @RequestMapping(value="/test", params = "jumpToForm", method=RequestMethod.POST)
    public String jumpToForm(@RequestParam("target") String target, @ModelAttribute("form") DemoForm form, Model model) {
        form.setDisplay(target);
        model.addAttribute("form", form);
        return "form";
    }
}
