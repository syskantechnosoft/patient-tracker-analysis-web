package com.pta.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="prescription")
public class PrescriptionEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO/*, generator="seq"*/)
	@Column(name="request_id")
	private int requestId;
	
	@ManyToOne(cascade=CascadeType.ALL, optional = false)
	@JoinColumn(name="patient_id")
	private PatientEntity patientId;
	
	@ManyToOne(cascade=CascadeType.ALL, optional = false)
	@JoinColumn(name="doctor_id")
	private DoctorEntity doctorId;
	
	@Column(name="request_date")
	private String requestDate;
	
	@ManyToOne(cascade=CascadeType.ALL, optional = false)
	@JoinColumn(name="medicine_id_1")
	private MedicineEntity medicineId1;
	
	@Column(name="quantity_1")
	private int quantity1;
	
	@ManyToOne(cascade=CascadeType.ALL, optional = false)
	@JoinColumn(name="medicine_id_2")
	private MedicineEntity medicineId2;
	
	@Column(name="quantity_2")
	private int quantity2;
	
	@ManyToOne(cascade=CascadeType.ALL, optional = false)
	@JoinColumn(name="medicine_id_3")
	private MedicineEntity medicineId3;
	
	@Column(name="quantity_3")
	private int quantity3;
	
	@ManyToOne(cascade=CascadeType.ALL, optional = false)
	@JoinColumn(name="medicine_id_4")
	private MedicineEntity medicineId4;
	
	@Column(name="quantity_4")
	private int quantity4;
	
	@ManyToOne(cascade=CascadeType.ALL, optional = false)
	@JoinColumn(name="medicine_id_5")
	private MedicineEntity medicineId5;
	
	@Column(name="quantity_5")
	private int quantity5;
	
	@Column(name="other_info")
	private String otherInfo;
	
	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public PatientEntity getPatientId() {
		return patientId;
	}

	public void setPatientId(PatientEntity patientId) {
		this.patientId = patientId;
	}

	public DoctorEntity getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(DoctorEntity doctorId) {
		this.doctorId = doctorId;
	}

	public String getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}

	public MedicineEntity getMedicineId1() {
		return medicineId1;
	}

	public void setMedicineId1(MedicineEntity medicineId1) {
		this.medicineId1 = medicineId1;
	}

	public int getQuantity1() {
		return quantity1;
	}

	public void setQuantity1(int quantity1) {
		this.quantity1 = quantity1;
	}

	public MedicineEntity getMedicineId2() {
		return medicineId2;
	}

	public void setMedicineId2(MedicineEntity medicineId2) {
		this.medicineId2 = medicineId2;
	}

	public int getQuantity2() {
		return quantity2;
	}

	public void setQuantity2(int quantity2) {
		this.quantity2 = quantity2;
	}

	public MedicineEntity getMedicineId3() {
		return medicineId3;
	}

	public void setMedicineId3(MedicineEntity medicineId3) {
		this.medicineId3 = medicineId3;
	}

	public int getQuantity3() {
		return quantity3;
	}

	public void setQuantity3(int quantity3) {
		this.quantity3 = quantity3;
	}

	public MedicineEntity getMedicineId4() {
		return medicineId4;
	}

	public void setMedicineId4(MedicineEntity medicineId4) {
		this.medicineId4 = medicineId4;
	}

	public int getQuantity4() {
		return quantity4;
	}

	public void setQuantity4(int quantity4) {
		this.quantity4 = quantity4;
	}

	public MedicineEntity getMedicineId5() {
		return medicineId5;
	}

	public void setMedicineId5(MedicineEntity medicineId5) {
		this.medicineId5 = medicineId5;
	}

	public int getQuantity5() {
		return quantity5;
	}

	public void setQuantity5(int quantity5) {
		this.quantity5 = quantity5;
	}

	public String getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name="status")
	private String status;	

}
