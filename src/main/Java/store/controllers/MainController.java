package store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import store.entities.*;
import store.services.*;

@Controller
public class MainController {

    private final ProviderService providerService;
    private final ClientService clientService;
    private final OrderService orderService;
    private final WorkerService workerService;
    private final ItemService itemService;

    public MainController(ProviderService providerService, ClientService clientService, WorkerService workerService, ItemService itemService, OrderService orderService) {
        this.providerService = providerService;
        this.clientService = clientService;
        this.itemService = itemService;
        this.workerService = workerService;
        this.orderService = orderService;
    }

    @GetMapping("/menu")
    public String Menu(){
        return "menu";
    }

    @GetMapping("/item")
    public String itemMenu(Model model){
        model.addAttribute("items", itemService.findAll());
        return "menuOfItem";
    }

    @GetMapping("/item/addItem")
    public String itemForm(Model model){
        model.addAttribute("item", new Item());
        return "addItem";
    }

    @PostMapping("/item/addItem")
    public String itemSubmit(@ModelAttribute Item item, Model model){
        model.addAttribute("item", item);
        itemService.save(item);
        return "resultOfItem";
    }

    @GetMapping("/item/upItem/{idOfItem}")
    public String editItem(@PathVariable("idOfItem") int idOfItem, Model model){
        model.addAttribute("item", itemService.getById(idOfItem));
        return "editItem";
    }

    @PostMapping("/item/updateItem")
    public String postItem(@ModelAttribute Item item){
        itemService.update(item);
        return "redirect:/item";
    }

    @GetMapping("/item/rmItem/{idOfItem}")
    public String deleteItem(@PathVariable("idOfItem") int idOfItem){
        itemService.delete(idOfItem);
        return "redirect:/item";
    }

    @GetMapping("/order")
    public String orderMenu(Model model){
        model.addAttribute("orders", orderService.findAll());
        return "menuOfOrder";
    }

    @GetMapping("/order/addOrder")
    public String orderForm(Model model){
        model.addAttribute("order", new Order());
        return "addOrder";
    }

    @PostMapping("/order/addOrder")
    public String ordersSubmit(@ModelAttribute Order order, Model model){
        model.addAttribute("order", order);
        orderService.save(order);
        return "resultOfOrder";
    }

    @GetMapping("/order/upOrder/{idOfOrder}")
    public String editOrder(@PathVariable("idOfOrder") int idOfOrder, Model model){
        model.addAttribute("order", orderService.getById(idOfOrder));
        return "editOrder";
    }

    @PostMapping("/order/updateOrder")
    public String postOrder(@ModelAttribute Order order){
        orderService.update(order);
        return "redirect:/menuOfOrder";
    }

    @GetMapping("/order/rmOrder/{idOfOrder}")
    public String deleteOrder(@PathVariable("idOfOrder") int idOfOrder){
        orderService.delete(idOfOrder);
        return "redirect:/menuOfOrder";
    }

    @GetMapping("/provider")
    public String providerMenu(Model model){
        model.addAttribute("providers", providerService.findAll());
        return "menuOfProvider";
    }

    @GetMapping(value = "/provider/addProvider")
    public String providerForm(Model model){
        model.addAttribute("provider", new Provider());
        return "addProvider";
    }

    @PostMapping("/provider/addProvider")
    public String providerSubmit(@ModelAttribute Provider provider, Model model){
        model.addAttribute("provider", provider);
        providerService.save(provider);
        return "resultOfProvider";
    }

    @GetMapping("/provider/upProvider/{idOfProvider}")
    public String editProvider(@PathVariable("idOfProvider") int idOfProvider, Model model){
        model.addAttribute("provider", providerService.getById(idOfProvider));
        return "editProvider" ;
    }

    @PostMapping("/provider/updateProvider")
    public String postProvider(@ModelAttribute("provider") Provider provider){
        providerService.update(provider);
        return "redirect:/menuOfProvider";
    }

    @GetMapping("/provider/rmProvider/{idOfProvider}")
    public String deleteProvider(@PathVariable("idOfProvider") int idOfProvider){
        providerService.delete(idOfProvider);
        return "redirect:/menuOfProvider";
    }

    @GetMapping("/client")
    public String clientMenu(Model model){
        model.addAttribute("clients", clientService.findAll());
        return "menuOfClient";
    }

    @GetMapping("/client/addClient")
    public String clientForm(Model model){
        model.addAttribute("client", new Client());
        return "addClient";
    }

    @PostMapping("/client/addClient")
    public String clientSubmit(@ModelAttribute Client client, Model model){
        model.addAttribute("client", client);
        clientService.save(client);
        return "resultOfClient";
    }

    @GetMapping("/client/upClient/{idOfClient}")
    public String editClient(@PathVariable("idOfClient") int idOfClient, Model model){
        model.addAttribute("client", clientService.getById(idOfClient));
        return "editClient";
    }

    @PostMapping("/client/updateClient")
    public String postClient(@ModelAttribute Client client){
        clientService.update(client);
        return "redirect:/allClients";
    }

    @GetMapping("/client/rmClient/{idOfClient}")
    public String deleteClient(@PathVariable("idOfClient") int idOfClient){
        clientService.delete(idOfClient);
        return "redirect:/client";
    }

    @GetMapping("/worker")
    public String workerMenu(Model model){
        model.addAttribute("workers", workerService.findAll());
        return "menuOfWorker";
    }

    @GetMapping("/worker/addWorker")
    public String workerForm(Model model){
        model.addAttribute("worker", new Worker());
        return "addWorker";
    }

    @PostMapping("/worker/addWorker")
    public String workerSubmit(@ModelAttribute Worker worker, Model model){
        model.addAttribute("worker", worker);
        workerService.save(worker);
        return "resultOfWorker";
    }

    @GetMapping("/worker/upWorker/{idOfWorker}")
    public String editWorker(@PathVariable("idOfWorker") int idOfWorker, Model model){
        model.addAttribute("worker", workerService.getById(idOfWorker));
        return "editWorker";
    }

    @PostMapping("/worker/updateWorker")
    public String postWorker(@ModelAttribute Worker worker){
        workerService.update(worker);
        return "redirect:/allWorkers";
    }

    @GetMapping("/worker/rmWorker/{idOfWorker}")
    public String deleteWorker(@PathVariable("idOfWorker") int idOfWorker){
        workerService.delete(idOfWorker);
        return "redirect:/worker";
    }

}
