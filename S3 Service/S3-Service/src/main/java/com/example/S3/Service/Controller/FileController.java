package com.example.S3.Service.Controller;




import com.example.S3.Service.Service.S3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1/files")
public class FileController {
    @Autowired
    private  S3Service s3Service;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestPart("file") MultipartFile file) {
        if (file.isEmpty()) {
            return ResponseEntity.badRequest().body("File is missing");
        }

        // Process the file (e.g., upload to AWS S3)
        return ResponseEntity.ok("File uploaded successfully!");
    }
}
