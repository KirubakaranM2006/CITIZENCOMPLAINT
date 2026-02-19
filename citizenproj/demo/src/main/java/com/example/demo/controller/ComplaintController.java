package com.example.demo.controller;

import com.example.demo.entity.Complaint;
import com.example.demo.service.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/complaints")
public class ComplaintController {

    @Autowired
    private ComplaintService complaintService;

    @PostMapping("/user/{userId}")
    public Complaint createComplaint(
            @PathVariable Long userId,
            @RequestParam String title,
            @RequestParam String description,
            @RequestParam String category,
            @RequestParam MultipartFile file
    ) throws IOException {

        return complaintService.createComplaintWithImage(
                userId, title, description, category, file);
    }

    @GetMapping
    public List<Complaint> getAllComplaints() {
        return complaintService.getAllComplaints();
    }

    @GetMapping("/user/{userId}")
    public List<Complaint> getByUser(@PathVariable Long userId) {
        return complaintService.getComplaintsByUser(userId);
    }
}
