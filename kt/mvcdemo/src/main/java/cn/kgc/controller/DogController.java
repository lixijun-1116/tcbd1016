package cn.kgc.controller;

import cn.kgc.entity.Dog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("dog")
public class DogController {
    //到宠物录入界面
    @RequestMapping("toSaveDog")
    public String toSaveDog(){
        return "save_dog";
    }
    //宠物录入
    @RequestMapping(value = "saveDog",method = RequestMethod.POST)
    public String saveDog(Dog dog,Model model){
        System.out.println("宠物昵称：" + dog.getName() + "，宠物年龄：" + dog.getAge() + "，亲密度：" + dog.getLove());
        model.addAttribute("dog",dog);
        return "dog_message";
    }
}
