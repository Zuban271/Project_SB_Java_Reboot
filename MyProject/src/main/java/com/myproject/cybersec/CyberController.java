// класс выполняющий роль контроллера, используемый для реализации веб-приложения
package com.myproject.cybersec;

import org.hibernate.Hibernate;
import org.hibernate.collection.internal.PersistentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

@Controller
public class CyberController {

    @Autowired
    private TM_identifireRepository tm_identifireRepository;
    @Autowired
    private ITM_identifireService tm_identifireService;
    @PostMapping("/add")
    public String addCustomer(@RequestParam String date, @RequestParam String number_TM, @RequestParam String responsible, @RequestParam(defaultValue = "false") Boolean given, @RequestParam String toWhom, @RequestParam String zno, Model model) {
        LocalDate localdate = LocalDate.parse(date);
        TM_identifire tm_identifire = new TM_identifire();
        tm_identifire.setDate(Date.from(localdate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
        tm_identifire.setNumber_TM(number_TM);
        tm_identifire.setResponsible(responsible);
        tm_identifire.setGiven(given);
        tm_identifire.setToWhom(toWhom);
        tm_identifire.setZno(zno);
        tm_identifireRepository.save(tm_identifire);

        Integer Id = tm_identifire.getId();
        var tm_identifires =  (List<TM_identifire>) new  ArrayList<>(Arrays.asList(tm_identifireService.findTM_identifireById(Id)));
        model.addAttribute("tm_identifires", tm_identifires);
        return "showTMIdentifire";
    }

    @GetMapping("/list")
    public String getTMIdentifire(Model model) {

        var tm_identifires = (List<TM_identifire>) tm_identifireService.findAll();
        model.addAttribute("tm_identifires", tm_identifires);


        return "showTMIdentifire";
    }
    @Autowired
    private PlanRepository planRepository;
    @Autowired
    private IPlanService planService;
    @PostMapping("/add_plan")
    public String addPlan(@RequestParam String nameobject, @RequestParam String addressobject, @RequestParam String period, @RequestParam String responsible, @RequestParam(defaultValue = "false") Boolean done, Model model) {
        //LocalDate localdate = LocalDate.parse(date);
        Plan plan = new Plan();
        plan.setNameObject(nameobject);
        plan.setAddressObject(addressobject);
        plan.setPeriod(period);
        plan.setResponsible(responsible);
        plan.setDone(done);
        planRepository.save(plan);

        Integer Id = plan.getId();
        var plans = (List<Plan>) new ArrayList<>(Arrays.asList(planService.findPlantById(Id)));
        model.addAttribute("plans", plans);
        return "showPlan";
    }


    @GetMapping("/listplan")
    public String getPlan(Model model) {

        var plans = (List<Plan>) planService.findAll();
        model.addAttribute("plans", plans);

        return "showPlan";
    }

    @Autowired
    private ProtocolRepository protocolRepository;
    @Autowired
    private IProtocolService protocolService;
    @PostMapping("/add_protocol")
    public String addProtocol(@RequestParam String date, @RequestParam String workplace, @RequestParam String office, @RequestParam String authority, @RequestParam String fio, @RequestParam String position,
     @RequestParam(defaultValue = "false") Boolean confidental, @RequestParam(defaultValue = "false") Boolean notblock, @RequestParam(defaultValue = "false") Boolean integrity,
     @RequestParam(defaultValue = "false") Boolean unregistered, @RequestParam(defaultValue = "false") Boolean device, @RequestParam(defaultValue = "false") Boolean identificator,
     @RequestParam(defaultValue = "false") Boolean password, @RequestParam(defaultValue = "false") Boolean etc, @RequestParam String record, Model model) {
        LocalDate localdate = LocalDate.parse(date);
        Protocol protocol = new Protocol();
        protocol.setDate(Date.from(localdate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
        protocol.setWorkplace(workplace);
        protocol.setOffice(office);
        protocol.setAuthority(authority);
        protocol.setFio(fio);
        protocol.setPosition(position);
        protocol.setConfidental(confidental);
        protocol.setNotblock(notblock);
        protocol.setIntegrity(integrity);
        protocol.setUnregistered(unregistered);
        protocol.setDevice(device);
        protocol.setIdentificator(identificator);
        protocol.setPassword(password);
        protocol.setEtc(etc);
        protocol.setRecord(record);

        protocolRepository.save(protocol);
        Integer Id = protocol.getId();
       var protocols =  (List<Protocol>) new ArrayList<>(Arrays.asList(protocolService.findProtocolById(Id)));
        model.addAttribute("protocols", protocols);
        return "showProtocol";

    }

    @GetMapping("/listprotocol")
    public String getProtocol(Model model) {
        var protocols = (List<Protocol>) protocolService.findAll();
        model.addAttribute("protocols", protocols);
        return "showProtocol";
    }

    @Autowired
    private ActRepository actRepository;
    @Autowired
    private IActService actService;
    @PostMapping("/add_act")
    public String addAct(@RequestParam String department, @RequestParam String  address, @RequestParam String authority, @RequestParam String period, @RequestParam String questions,
     @RequestParam String result, @RequestParam String plan, @RequestParam String appendix, @RequestParam String department1, @RequestParam String position1, @RequestParam String fio1,
     @RequestParam String department2, @RequestParam String position2, @RequestParam String fio2,
     @RequestParam String department3, @RequestParam String position3, @RequestParam String fio3, Model model) {

        Act act = new Act();
        act.setDepartment(department);
        act.setAddress(address);
        act.setAuthority(authority);
        act.setPeriod(period);
        act.setQuestions(questions);
        act.setResult(result);
        act.setPlan(plan);
        act.setAppendix(appendix);

        Employee employee1 = new Employee();
        employee1.setDepartment(department1);
        employee1.setPosition(position1);
        employee1.setFio(fio1);

        Employee employee2 = new Employee();
        employee2.setDepartment(department2);
        employee2.setPosition(position2);
        employee2.setFio(fio2);

        Employee employee3 = new Employee();
        employee3.setDepartment(department3);
        employee3.setPosition(position3);
        employee3.setFio(fio3);

        Set<Employee> employeeSet = new HashSet<>(Arrays.asList(employee1,employee2,employee3));
        act.setEmployees(employeeSet);
        employee1.setActE(act);
        employee2.setActE(act);
        employee3.setActE(act);

        actRepository.save(act);

        Integer Id = act.getId();
        var theact = actService.findActById(Id);
        model.addAttribute("theact", theact);
        return "showAct";


    }

    @GetMapping("/listact")
    public String getAct(Model model) {
        var theact = (List<Act>) actService.findAll();
        model.addAttribute("theact", theact);
        return "showActlist";
    }


    @Autowired
    private AppendixRepository appendixRepository;
    @Autowired
    private IActService appendixService;
    @PostMapping("/add_appendix")
    public String addAppendix(@RequestParam String workplace, @RequestParam String fio_pos_dep, @RequestParam String time_fix, @RequestParam("file") MultipartFile file, @RequestParam String explanation, Model model) throws IOException, SQLException {
        LocalDateTime localDateTime = LocalDateTime.parse(time_fix);
        Appendix appendix = new Appendix();
        appendix.setWorkplace(workplace);
        appendix.setFio_pos_dep(fio_pos_dep);
        appendix.setTime_fix(Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant()));
        //byte[] photoBytes = foto.getBytes();
        //for (MultipartFile file : productsBean.getData()) {
            byte[] bytes = file.getBytes();
            Blob blob = new javax.sql.rowset.serial.SerialBlob(bytes);
            //blob.setBytes(0,bytes);

        appendix.setFoto(blob);
        appendix.setExplanation(explanation);

        appendixRepository.save(appendix);

        Integer Id = appendix.getId();
        blob = appendix.getFoto();
        byte[] fotoBytes = blob.getBytes(1,(int) blob.length());
        var theappendix = appendixService.findAppendixById(Id);
        var base64EncodedImage = "data:image/jpeg;base64," + Base64.getEncoder().encodeToString(fotoBytes);
        model.addAttribute("theappendix", theappendix);
        model.addAttribute("base64EncodedImage",base64EncodedImage);
        blob.free();
        return "showAppendix";

    }

    @GetMapping("/listappendix")
    public String getAppendix(Model model) throws SQLException {
        //Appendix appendix = new Appendix();
        List<Appendix> AppendixList = appendixService.findAllAppendix();
        List<String> base64List = new ArrayList<>();
        for (Appendix appendix: AppendixList) {
            Blob blob = appendix.getFoto();
            byte[] fotoBytes = blob.getBytes(1,(int) blob.length());
            base64List.add("data:image/jpeg;base64," + Base64.getEncoder().encodeToString(fotoBytes));
            blob.free();
        }

        var theappendix = (List<Appendix>)AppendixList;
        var base64EncodedImage = (List<String>)base64List;
        model.addAttribute("theappendix", theappendix);
        model.addAttribute("base64EncodedImage",base64EncodedImage);

        return "showAppendixlist";
    }

    @Autowired
    private AppendixwithoutviolationRepository appendixwithoutviolationRepository;
    @Autowired
    private IActService appendixwithoutviolationService;
    @PostMapping("/add_appendixwithout")
    public String addAppendixwithoutviolation(@RequestParam String date, @RequestParam String fio, @RequestParam String department, @RequestParam String address, @RequestParam String workcount, Model model) {
        LocalDate localDate = LocalDate.parse(date);
        AppendixWithoutViolation appendixWithoutViolation = new AppendixWithoutViolation();
        appendixWithoutViolation.setDate(Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
        appendixWithoutViolation.setFio(fio);
        appendixWithoutViolation.setDepartment(department);
        appendixWithoutViolation.setAddress(address);
        appendixWithoutViolation.setWorkplacecount(Integer.parseInt(workcount));

        appendixwithoutviolationRepository.save(appendixWithoutViolation);

       Integer Id = appendixWithoutViolation.getId();
        var theappendixwithout = appendixwithoutviolationService.findAppendixwithoutById(Id);
        model.addAttribute("theappendixwithout", theappendixwithout);

        return "showAppendixwithout";

    }

    @GetMapping("/listappendixwithout")
    public String getAppendixwithout(Model model) throws SQLException {
        var theappendixwithout = appendixwithoutviolationService.findAllAppendixwithout();
        model.addAttribute("theappendixwithout", theappendixwithout);

        return "showAppendixwithoutlist";
    }
    @GetMapping("/find/{id}")
    public TM_identifire findCustomerById(@PathVariable Integer id) {
        return tm_identifireRepository.findTM_identifireById(id);
    }
}

