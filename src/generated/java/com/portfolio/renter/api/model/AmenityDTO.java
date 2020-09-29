package com.portfolio.renter.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.validation.constraints.*;

/** This objects is created for selecting comodities for apartments. */
@ApiModel(description = "This objects is created for selecting comodities for apartments.")
public class AmenityDTO {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  public AmenityDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   */
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AmenityDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Describing this objects function.
   *
   * @return name
   */
  @ApiModelProperty(example = "Wify", required = true, value = "Describing this objects function.")
  @NotNull
  @Pattern(regexp = "^[a-zA-Z]+$")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmenityDTO amenityDTO = (AmenityDTO) o;
    return Objects.equals(this.id, amenityDTO.id) && Objects.equals(this.name, amenityDTO.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmenityDTO {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
