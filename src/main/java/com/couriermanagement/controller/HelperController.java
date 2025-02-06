package com.couriermanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.couriermanagement.resource.HelperResource;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("api/helper")
@CrossOrigin(origins = "http://localhost:3000")
public class HelperController {

	@Autowired
	private HelperResource helperResource;

	@GetMapping("/user/role/fetch/all")
	@Operation(summary = "Api to get all user roles in application")
	public ResponseEntity<List<String>> fetchAllUserRoles() {
		return helperResource.fetchAllUserRoles();
	}

	@GetMapping("/courier/type/fetch/all")
	@Operation(summary = "Api to get all courier types in application")
	public ResponseEntity<List<String>> fetchAllCourierType() {
		return helperResource.fetchAllCourierTypes();
	}

	@GetMapping("/delivery/time/fetch/all")
	@Operation(summary = "Api to get all delivery time in application")
	public ResponseEntity<List<String>> fetchAllDeliveryTimes() {
		return helperResource.fetchAllDeliveryTimes();
	}

	@GetMapping("/delivery/status/fetch/all")
	@Operation(summary = "Api to get all delivery status in application")
	public ResponseEntity<List<String>> fetchAllDeliveryStatus() {
		return helperResource.fetchAllDeliveryStatus();
	}

}

//package com.couriermanagement.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestHeader;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.couriermanagement.resource.HelperResource;
//import com.couriermanagement.utility.JwtUtils;
//
//import io.swagger.v3.oas.annotations.Operation;
//
//@RestController
//@RequestMapping("api/helper")
//@CrossOrigin(origins = "http://localhost:3000")
//public class HelperController {
//
//    @Autowired
//    private HelperResource helperResource;
//
//    @Autowired
//    private JwtUtils jwtUtils;
//
//    // Endpoint to fetch all user roles
//    @GetMapping("/user/role/fetch/all")
//    @Operation(summary = "Api to get all user roles in application")
//    public ResponseEntity<List<String>> fetchAllUserRoles(@RequestHeader("Authorization") String authHeader) {
//        String jwtToken = extractTokenFromHeader(authHeader);
//        if (jwtToken == null || !jwtUtils.validateToken(jwtToken, getUserDetails(jwtToken))) {
//            return ResponseEntity.status(401).body(null);
//        }
//        return helperResource.fetchAllUserRoles();
//    }
//
//    // Endpoint to fetch all courier types
//    @GetMapping("/courier/type/fetch/all")
//    @Operation(summary = "Api to get all courier types in application")
//    public ResponseEntity<List<String>> fetchAllCourierType(@RequestHeader("Authorization") String authHeader) {
//        String jwtToken = extractTokenFromHeader(authHeader);
//        if (jwtToken == null || !jwtUtils.validateToken(jwtToken, getUserDetails(jwtToken))) {
//            return ResponseEntity.status(401).body(null);
//        }
//        return helperResource.fetchAllCourierTypes();
//    }
//
//    // Helper method to extract token from Authorization header
//    private String extractTokenFromHeader(String authHeader) {
//        if (authHeader != null && authHeader.startsWith("Bearer ")) {
//            return authHeader.substring(7);  // Extract token without "Bearer "
//        }
//        return null;
//    }
//
//    // This is just a placeholder. Replace it with actual logic to get UserDetails.
//    private UserDetails getUserDetails(String jwtToken) {
//        // This should be a method that gets UserDetails based on the JWT token
//        return null;
//    }
//}

