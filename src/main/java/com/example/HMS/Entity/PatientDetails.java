package com.example.HMS.Entity;


	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.validation.constraints.NotBlank;
	import javax.validation.constraints.Pattern;
	import javax.validation.constraints.Size;

	import com.fasterxml.jackson.annotation.JsonFormat;




	@Entity
	@Table(name="PatientDetails")
	public class PatientDetails {

		/**
		 * Customer Entity persisted in Repository
		 */

		
		


		public PatientDetails(//long id,
				String patientId,
				@NotBlank @Size(min = 3, max = 20, message = "Patient Name should be in between 3 to 20 characters") String patientName,
				@NotBlank(message = "Address should not be blank") @Size(max = 50) String address, 
				@NotBlank(message = "Age should not be blank") int age,
				
			    long phoneNo) {
			super();
			this.patientId = patientId;
			this.patientName = patientName;
			this.address = address;
			this.age = age;
			this.phoneNo = phoneNo;
		}




		public String getPatientId() {
			return patientId;
		}

		public void setPatientId(String patientId) {
			this.patientId = patientId;
		}

		public String getPatientName() {
			return patientName;
		}

		public void setPatientName(String patientName) {
			this.patientName = patientName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}


		

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "patientId")
		private String patientId;

		@NotBlank
		@Size(min = 3, max = 20, message = "Customer Name should be in between 3 to 20 characters")
		private String patientName;
		
		@NotBlank(message = "Phone number  should not be blank")
		private long phoneNo;
		
		@NotBlank(message = "age should not be blank")
		private int age;

		public long getPhoneNo() {
			return phoneNo;
		}




		public void setPhoneNo(long phoneNo) {
			this.phoneNo = phoneNo;
		}




		public int getAge() {
			return age;
		}




		public void setAge(int age) {
			this.age = age;
		}

		@NotBlank(message = "Address should not be blank")
		@Size(max = 50)
		private String address;

		
		
	



}
