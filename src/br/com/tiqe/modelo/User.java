package br.com.tiqe.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id @GeneratedValue
	private Integer ID_TiqeUser;// (PK, int, not null, auto)
	private String Picture;// (varchar(300), null)
	private String FirstName;// (varchar(20), not null)
	private String LastName;// (varchar(20), not null)
	private String Email;// (varchar(100), not null)
	private String Pass;// (varchar(20), not null)
	private Date Birthday;// (date, null)(mascara: AAAA-MM-DD) — alterar no BD
	private boolean UseTerms;// (boolean, not null)(default: 0, domain: 0-Não, 1-Sim)
	private boolean Status;// (boolean, not null)(default: 0, domain: 0-inativo, 1-ativo)
	private boolean FirstLogin;// (boolean, not null)(default: 0, domain: 0-Não, 1-Sim)
	private String Language;// (varchar(5), not null)(default: pt-Br, domains: pt-Br)
	private boolean SendLogError;// (boolean, not null)(default: 0, domain: 0-Não, 1-Sim) 
	private Date RegisterDate;// (datetime, not null)(mascara: AAAA-MM-DD HH:MM:SS)
	private Date ModifyDate;// (datetime, not null)(mascara: AAAA-MM-DD HH:MM:SS)
	
}
