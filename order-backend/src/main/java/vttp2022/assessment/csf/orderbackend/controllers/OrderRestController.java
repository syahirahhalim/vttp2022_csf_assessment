package vttp2022.assessment.csf.orderbackend.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vttp2022.assessment.csf.orderbackend.models.Order;
import vttp2022.assessment.csf.orderbackend.models.OrderSummary;
import vttp2022.assessment.csf.orderbackend.services.OrderService;

import java.util.UUID;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping(path="/api/orders", produces=MediaType.APPLICATION_JSON_VALUE)
public class OrderRestController {

    @Autowired
    //private OrderService oService;

   //private Logger logger = Logger.getLogger(OrderRestController.class.getOrderByEmail());


   @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> postRegistration(@RequestBody String payload) {

       // Order ord;
     //   OrderSummary oSummary;

      //  logger.info("Payload: %s".formatted(payload));

        // Read the payload and save the data to database
      //  String id = UUID.randomUUID().toString().substring(0, 8);
        
        //try {
          //  ord = ord.create(payload);
          //  ord.setId(id);
      //  } catch (Exception ex) {
       //     oSummary = new Response();
       //     oSummary.setCode(400);
       //     oSummary.setMessage(ex.getMessage());
      //      return ResponseEntity
       //         .status(HttpStatus.BAD_REQUEST)
       //         .body(resp.toJson().toString());
       // }

     //   oSummary = new OrderSummary();
     //   oSummary.setCode(201);
      //  oSummary.setMessage(id);
    //   oSummary.setData(reg.toJson().toString());
    //    return ResponseEntity
    //        .status(HttpStatus.CREATED)
      //      .body(resp.toJson().toString());
 // }

