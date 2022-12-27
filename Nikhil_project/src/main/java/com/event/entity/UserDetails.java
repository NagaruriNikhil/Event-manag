package com.event.entity;

	import javax.persistence.*;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.ToString;

	@Entity
	@Data
	@AllArgsConstructor
	@ToString
	@Table(name="UserDtls")
	@Component
	public class UserDetails {
		
		@Id
		@GeneratedValue
		public long id;
		
		public String username;
		public String phone;
		public String email;
		public String date;
		public String venue;

		
	}


