package com.portfolio.renter.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.validation.constraints.*;

/** This objects is created for sending address with location. */
@ApiModel(description = "This objects is created for sending address with location.")
public class AddressDTO {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("street")
  private String street;

  @JsonProperty("number")
  private Integer number;

  @JsonProperty("city")
  private String city;

  @JsonProperty("zip_code")
  private Integer zipCode;

  public AddressDTO id(Long id) {
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

  public AddressDTO street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Describing this objects street name.
   *
   * @return street
   */
  @ApiModelProperty(
      example = "Zlatne Grede",
      required = true,
      value = "Describing this objects street name.")
  @NotNull
  @Pattern(regexp = "^[a-zA-Z]+$")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public AddressDTO number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Number of the street. minimum: 1
   *
   * @return number
   */
  @ApiModelProperty(example = "4", required = true, value = "Number of the street.")
  @NotNull
  @Min(1)
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public AddressDTO city(String city) {
    this.city = city;
    return this;
  }

  /**
   * In which city.
   *
   * @return city
   */
  @ApiModelProperty(example = "Novi Sad", required = true, value = "In which city.")
  @NotNull
  @Pattern(regexp = "^[a-zA-Z]+$")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AddressDTO zipCode(Integer zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * Cities zip code. minimum: 1
   *
   * @return zipCode
   */
  @ApiModelProperty(example = "21000", required = true, value = "Cities zip code.")
  @NotNull
  @Min(1)
  public Integer getZipCode() {
    return zipCode;
  }

  public void setZipCode(Integer zipCode) {
    this.zipCode = zipCode;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressDTO addressDTO = (AddressDTO) o;
    return Objects.equals(this.id, addressDTO.id)
        && Objects.equals(this.street, addressDTO.street)
        && Objects.equals(this.number, addressDTO.number)
        && Objects.equals(this.city, addressDTO.city)
        && Objects.equals(this.zipCode, addressDTO.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, street, number, city, zipCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressDTO {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
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
