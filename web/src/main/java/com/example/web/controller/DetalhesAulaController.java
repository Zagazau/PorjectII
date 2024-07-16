//package com.example.web.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//public class DetalhesAulaController {
//
//    @Autowired
//    private AulaBLL aulaBLL;
//
//    @Autowired
//    private ModalidadeBLL modalidadeBLL;
//
//    @Autowired
//    private FuncionarioBLL funcionarioBLL;
//
//    @GetMapping("/detalhesAula")
//    public String getDetalhesAula(@RequestParam("id") int id, Model model) {
//        Aula aula = aulaBLL.getAulaById(id);
//        if (aula == null) {
//            return "redirect:/home";
//        }
//
//        Modalidade modalidade = modalidadeBLL.getModalidadeById(aula.getIdModalidade());
//        Funcionario instrutor = funcionarioBLL.getFuncionarioById(aula.getIdFuncionario());
//
//        model.addAttribute("aula", aula);
//        model.addAttribute("modalidadeName", modalidade.getModalidade());
//        model.addAttribute("instrutorName", instrutor.getNome());
//
//        return "detalhesAula";
//    }
//
//}
