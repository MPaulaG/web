package ec.edu.itsqmet.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "bird_category")

public class BirdCategoryDTO {
	@Id
	private Integer id;
	private String name;

}
