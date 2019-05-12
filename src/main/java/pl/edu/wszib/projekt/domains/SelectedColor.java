package pl.edu.wszib.projekt.domains;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "selected_colors") //jpa samo utworzy tabelę

public class SelectedColor {

    @Id // wskazanie żt to Id
    @GeneratedValue(strategy = GenerationType.AUTO) // ma być generowanie automatycznie
    private Integer id; //identyfikator obirktu - wiersza w bazie danych
    private String color;
    private Date ctime;

    public SelectedColor() { // konstruktor bezargumentowy ważny!!!
    }

    public SelectedColor(String color, Date ctime) {
        this.color = color;
        this.ctime = ctime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }



}
