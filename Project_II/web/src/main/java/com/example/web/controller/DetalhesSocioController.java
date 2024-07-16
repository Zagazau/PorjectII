//package com.example.web.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import java.util.List;
//
//@Controller
//public class DetalhesSocioController {
//
//    @Autowired
//    private SocioBLL socioBLL;
//
//    @Autowired
//    private PlanoBLL planoBLL;
//
//    @GetMapping("/detalhesSocio")
//    public String detalhesSocio(@RequestParam("id") int id, Model model) {
//        Socio socio = socioBLL.getSocioById(id);
//        if (socio != null) {
//            Plano plano = planoBLL.findPlanoById(socio.getIdPlano());
//            model.addAttribute("socio", socio);
//            model.addAttribute("plano", plano);
//            return "detalhesSocio";
//        }
//        return "redirect:/home";
//    }
//
//    @GetMapping("/editarSocio")
//    public String editarSocio(@RequestParam("id") int id, Model model) {
//        Socio socio = socioBLL.getSocioById(id);
//        if (socio != null) {
//            List<Plano> planos = planoBLL.getAllPlanos();
//            model.addAttribute("socio", socio);
//            model.addAttribute("planos", planos);
//            return "editarSocio";
//        }
//        return "redirect:/home";
//    }
//
//    @PostMapping("/atualizarSocio")
//    public String atualizarSocio(@ModelAttribute Socio socio, RedirectAttributes redirectAttributes) {
//        socioBLL.updateSocio(socio);
//        redirectAttributes.addFlashAttribute("message", "Sócio atualizado com sucesso!");
//        return "redirect:/rececionista";
//    }
//}
//
//
//
//
//
//
