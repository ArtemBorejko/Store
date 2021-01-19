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

    @GetMapping("/")
    public String Menu(){
        return "menu";
    }

    @GetMapping("/item")
    public String itemForm(Model model){
        model.addAttribute("item", new Item());
        return "item";
    }

    @PostMapping("/item")
    public String itemSubmit(@ModelAttribute Item item, Model model){
        model.addAttribute("item", item);
        itemService.save(item);
        return "resultOfItem";
    }

    @GetMapping("/upItem/{idOfItem}")
    public String editItem(@PathVariable("idOfItem") int idOfItem, Model model){
        model.addAttribute("item", itemService.getById(idOfItem));
        return "editItem";
    }

    @PostMapping("/updateItem")
    public String postItem(@ModelAttribute Item item){
        itemService.update(item);
        return "redirect:/allItems";
    }

    @GetMapping("/rmItem/{idOfItem}")
    public String deleteItem(@PathVariable("idOfItem") int idOfItem){
        itemService.delete(idOfItem);
        return "redirect:/item";
    }

    @GetMapping("/allItems")
    public String getItems(Model model){
        model.addAttribute("items", itemService.findAll());
        return "allItems";
    }

    @GetMapping("/order")
    public String orderForm(Model model){
        model.addAttribute("order", new Order());
        return "order";
    }

    @PostMapping("/order")
    public String ordersSubmit(@ModelAttribute Order order, Model model){
        model.addAttribute("order", order);
        orderService.save(order);
        return "resultOfOrder";
    }

    @GetMapping("/upOrder/{idOfOrder}")
    public String editOrder(@PathVariable("idOfOrder") int idOfOrder, Model model){
        model.addAttribute("order", orderService.getById(idOfOrder));
        return "editOrder";
    }

    @PostMapping("/updateOrder")
    public String postOrder(@ModelAttribute Order order){
        orderService.update(order);
        return "redirect:/allOrders";
    }

    @GetMapping("/rmOrder/{idOfOrder}")
    public String deleteOrder(@PathVariable("idOfOrder") int idOfOrder){
        orderService.delete(idOfOrder);
        return "redirect:/allOrders";
    }

    @GetMapping("/allOrders")
    public String getOrders(Model model){
        model.addAttribute("orders", orderService.findAll());
        return "allOrders";
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
    public String editProvider(@PathVariable("idOfProvider") int idOfProvider, Model model){ ;
        model.addAttribute("provider", providerService.getById(idOfProvider));
        return "editProvider" ;
    }

    @PostMapping("/updateProvider")
    public String postProvider(@ModelAttribute("provider") Provider provider){
        providerService.update(provider);
        return "redirect:/allProviders";
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

    @PostMapping("/updateClient")
    public String postClient(@ModelAttribute Client client){
        clientService.update(client);
        return "redirect:/allClients";
    }

    @GetMapping("/rmClient/{idOfClient}")
    public String deleteClient(@PathVariable("idOfClient") int idOfClient){
        providerService.delete(idOfClient);
        return "redirect:/client";
    }

    @GetMapping("/allClients")
    public String getClients(Model model){
        model.addAttribute("clients", clientService.findAll());
        return "allClients";
    }

    @GetMapping("/worker")
    public String workerForm(Model model){
        model.addAttribute("worker", new Worker());
        return "worker";
    }

    @PostMapping("/worker")
    public String workerSubmit(@ModelAttribute Worker worker, Model model){
        model.addAttribute("worker", worker);
        workerService.save(worker);
        return "resultOfWorker";
    }

    @GetMapping("/upWorker/{idOfWorker}")
    public String editWorker(@PathVariable("idOfWorker") int idOfWorker, Model model){
        model.addAttribute("worker", workerService.getById(idOfWorker));
        return "editWorker";
    }

    @PostMapping("/updateWorker")
    public String postWorker(@ModelAttribute Worker worker){
        workerService.update(worker);
        return "redirect:/allWorkers";
    }

    @GetMapping("/rmWorker/{idOfWorker}")
    public String deleteWorker(@PathVariable("idOfWorker") int idOfWorker){
        workerService.delete(idOfWorker);
        return "redirect:/worker";
    }

    @GetMapping("/allWorkers")
    public String getWorkers(Model model){
        model.addAttribute("workers", workerService.findAll());
        return "allWorkers";
    }
}
