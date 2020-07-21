package store.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import store.entities.*;
import store.repositories.*;
import store.services.ClientService;
import store.services.ProviderService;

@Controller
public class MainController {

    public ProviderService providerService;
    public ClientService clientService;

    public MainController(ProviderService providerService, ClientService clientService) {
        this.providerService = providerService;
        this.clientService = clientService;
    }

    @GetMapping("/")
    public String Menu(){
        return "menu";
    }


    @GetMapping("/provider")
    public String providerForm(Model model){
        model.addAttribute("provider", new Provider());
        return "provider";
    }

    @PostMapping("/provider")
    public String providerSubmit(@ModelAttribute Provider provider, Model model){
        model.addAttribute("provider", provider);
        providerService.save(provider);
        return "resultOfProvider";
    }

    @GetMapping("/upProvider/{idOfProvider}")
    public String editProvider(@PathVariable("idOfProvider") int idOfProvider, Model model){
        model.addAttribute("provider", providerService.getById(idOfProvider));
        return "editProvider";
    }

    @PostMapping("/updateProvider")
    public String providerSubmitEdit(@ModelAttribute Provider provider, Model model){
        providerService.update(provider);
        model.addAttribute("provider", provider);
        return "resultOfProvider";
    }

    @GetMapping("/rmProvider/{idOfProvider}")
    public String deleteProvider(@PathVariable("idOfProvider") int idOfProvider){
        providerService.delete(idOfProvider);
        return "redirect:/provider";
    }

    @GetMapping("/allProviders")
    public String getProviders(Model model){
        model.addAttribute("providers", providerService.findAll());
        return "allProviders";
    }

    @GetMapping("/client")
    public String clientForm(Model model){
        model.addAttribute("client", new Client());
        return "client";
    }

    @PostMapping("/client")
    public String clientSubmit(@ModelAttribute Client client, Model model){
        model.addAttribute("client", client);
        clientService.save(client);
        return "resultOfClient";
    }

    @GetMapping("/upClient/{idOfClient}")
    public String editClient(@PathVariable("idOfClient") int idOfClient, Model model){
        model.addAttribute("client", clientService.getById(idOfClient));
        return "editClient";
    }

    @GetMapping("/rmClient/{idOfClient}")
    public String deleteClient(@PathVariable("idOfClient") int idOfClient){
        clientService.delete(idOfClient);
        return "redirect:/client";
    }

    @GetMapping("/allClients")
    public String getClients(Model model){
        model.addAttribute("clients", clientService.findAll());
        return "allClients";
    }
}
