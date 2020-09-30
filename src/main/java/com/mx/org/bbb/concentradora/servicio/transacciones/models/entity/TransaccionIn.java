package com.mx.org.bbb.concentradora.servicio.transacciones.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TransaccionIn {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "tclave")
	private String tclave;

	@Column(name = "caja")
	private String caja;

	@Column(name = "id_turno")
	private int idTurno;

	@Column(name = "id_ticket")
	private int idTicket;

	@Column(name = "i_clave")
	private int iclave;

	@Column(name = "p_clave")
	private int pclave;

	@Column(name = "icb")
	private String icb;

	@Column(name = "fecha")
	private Date fecha;

	@Column(name = "estatus")
	private int estatus;

	@Column(name = "atm_fecha")
	private Date atmFecha;

	@Column(name = "user_id")
	private int userId;

	@Column(name = "monto")
	private Double monto;

	@Column(name = "referencia")
	private String referencia;

	@Column(name = "folio")
	private String folio;

	public TransaccionIn() {

	}

	public TransaccionIn(Long id, String tclave, String caja, int idTurno, int idTicket, int iclave, int pclave,
			String icb, Date fecha, int estatus, Date atmFecha, int userId, Double monto, String referencia,
			String folio) {
		this.id = id;
		this.tclave = tclave;
		this.caja = caja;
		this.idTurno = idTurno;
		this.idTicket = idTicket;
		this.iclave = iclave;
		this.pclave = pclave;
		this.icb = icb;
		this.fecha = fecha;
		this.estatus = estatus;
		this.atmFecha = atmFecha;
		this.userId = userId;
		this.monto = monto;
		this.referencia = referencia;
		this.folio = folio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTclave() {
		return tclave;
	}

	public void setTclave(String tclave) {
		this.tclave = tclave;
	}

	public String getFolio() {
		return folio;
	}

	public void setFolio(String folio) {
		this.folio = folio;
	}

	public String getCaja() {
		return caja;
	}

	public void setCaja(String caja) {
		this.caja = caja;
	}

	public int getIdTurno() {
		return idTurno;
	}

	public void setIdTurno(int idTurno) {
		this.idTurno = idTurno;
	}

	public int getIdTicket() {
		return idTicket;
	}

	public void setIdTicket(int idTicket) {
		this.idTicket = idTicket;
	}

	public int getIclave() {
		return iclave;
	}

	public void setIclave(int iclave) {
		this.iclave = iclave;
	}

	public int getPclave() {
		return pclave;
	}

	public void setPclave(int pclave) {
		this.pclave = pclave;
	}

	public String getIcb() {
		return icb;
	}

	public void setIcb(String icb) {
		this.icb = icb;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getEstatus() {
		return estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

	public Date getAtmFecha() {
		return atmFecha;
	}

	public void setAtmFecha(Date atmFecha) {
		this.atmFecha = atmFecha;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
}
