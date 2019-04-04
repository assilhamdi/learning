package org.exoplatform.addon.perkstore.entity;

import org.exoplatform.commons.api.persistence.ExoEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@ExoEntity
@Table(name = "ELEARNING_LECON")
public class Lecon {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ID_LECON")
  private Long idLecon;

  @Column(name = "DESCRIPTION_LECON")
  private String descriptionLecon;

  @Column(name = "TITRE_LECON")
  private String titreLecon;

  @Column(name = "CONTENU_LECON")
  private String contenuLecon;

  @ManyToOne
  @JoinColumn(name = "COURS_ID")
  private Cours cours;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "lecon")
  private List<Exercice> exercices;

  public Lecon() {
  }

  public Lecon(String descriptionLecon,
               String titreLecon,
               String contenuLecon,
               Cours cours,
               List<Exercice> exercices) {
    this.descriptionLecon = descriptionLecon;
    this.titreLecon = titreLecon;
    this.contenuLecon = contenuLecon;
    this.cours = cours;
    this.exercices = exercices;
  }

  public Long getIdLecon() {
    return idLecon;
  }

  public void setIdLecon(Long idLecon) {
    this.idLecon = idLecon;
  }

  public String getDescriptionLecon() {
    return descriptionLecon;
  }

  public void setDescriptionLecon(String descriptionLecon) {
    this.descriptionLecon = descriptionLecon;
  }

  public String getTitreLecon() {
    return titreLecon;
  }

  public void setTitreLecon(String titreLecon) {
    this.titreLecon = titreLecon;
  }

  public String getContenuLecon() {
    return contenuLecon;
  }

  public void setContenuLecon(String contenuLecon) {
    this.contenuLecon = contenuLecon;
  }

  public Cours getCours() {
    return cours;
  }

  public void setCours(Cours cours) {
    this.cours = cours;
  }

  public List<Exercice> getExercices() {
    return exercices;
  }

  public void setExercices(List<Exercice> exercices) {
    this.exercices = exercices;
  }
}
