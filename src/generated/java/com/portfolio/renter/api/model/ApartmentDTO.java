package com.portfolio.renter.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;

/** This objects is created for setting up your appartment. */
@ApiModel(description = "This objects is created for setting up your appartment.")
public class ApartmentDTO {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("numberOfRooms")
  private Integer numberOfRooms;

  @JsonProperty("numberOfGuest")
  private Integer numberOfGuest;

  @JsonProperty("datesToRent")
  @Valid
  private List<String> datesToRent = null;

  @JsonProperty("price")
  private Double price;

  @JsonProperty("checkIn")
  @Valid
  private List<String> checkIn = null;

  @JsonProperty("checkOut")
  @Valid
  private List<String> checkOut = null;

  @JsonProperty("status")
  private Boolean status;

  @JsonProperty("location")
  private LocationDTO location;

  @JsonProperty("host")
  private UserDTO host;

  @JsonProperty("amenities")
  @Valid
  private List<AmenityDTO> amenities = null;

  @JsonProperty("images")
  @Valid
  private List<ImageDTO> images = null;

  public ApartmentDTO id(Long id) {
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

  public ApartmentDTO numberOfRooms(Integer numberOfRooms) {
    this.numberOfRooms = numberOfRooms;
    return this;
  }

  /**
   * Describing this objects function. minimum: 1
   *
   * @return numberOfRooms
   */
  @ApiModelProperty(example = "1", value = "Describing this objects function.")
  @Min(1)
  public Integer getNumberOfRooms() {
    return numberOfRooms;
  }

  public void setNumberOfRooms(Integer numberOfRooms) {
    this.numberOfRooms = numberOfRooms;
  }

  public ApartmentDTO numberOfGuest(Integer numberOfGuest) {
    this.numberOfGuest = numberOfGuest;
    return this;
  }

  /**
   * Describing this objects function. minimum: 1
   *
   * @return numberOfGuest
   */
  @ApiModelProperty(example = "1", value = "Describing this objects function.")
  @Min(1)
  public Integer getNumberOfGuest() {
    return numberOfGuest;
  }

  public void setNumberOfGuest(Integer numberOfGuest) {
    this.numberOfGuest = numberOfGuest;
  }

  public ApartmentDTO datesToRent(List<String> datesToRent) {
    this.datesToRent = datesToRent;
    return this;
  }

  public ApartmentDTO addDatesToRentItem(String datesToRentItem) {
    if (this.datesToRent == null) {
      this.datesToRent = new ArrayList<>();
    }
    this.datesToRent.add(datesToRentItem);
    return this;
  }

  /**
   * Dates for renting apartment.
   *
   * @return datesToRent
   */
  @ApiModelProperty(example = "2018-03-20T09:12:28Z", value = "Dates for renting apartment.")
  public List<String> getDatesToRent() {
    return datesToRent;
  }

  public void setDatesToRent(List<String> datesToRent) {
    this.datesToRent = datesToRent;
  }

  public ApartmentDTO price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * Price per night stay. minimum: 0.0
   *
   * @return price
   */
  @ApiModelProperty(example = "10.0", value = "Price per night stay.")
  @DecimalMin("0.0")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public ApartmentDTO checkIn(List<String> checkIn) {
    this.checkIn = checkIn;
    return this;
  }

  public ApartmentDTO addCheckInItem(String checkInItem) {
    if (this.checkIn == null) {
      this.checkIn = new ArrayList<>();
    }
    this.checkIn.add(checkInItem);
    return this;
  }

  /**
   * Check in.
   *
   * @return checkIn
   */
  @ApiModelProperty(example = "2018-03-20T09:12:28Z", value = "Check in.")
  public List<String> getCheckIn() {
    return checkIn;
  }

  public void setCheckIn(List<String> checkIn) {
    this.checkIn = checkIn;
  }

  public ApartmentDTO checkOut(List<String> checkOut) {
    this.checkOut = checkOut;
    return this;
  }

  public ApartmentDTO addCheckOutItem(String checkOutItem) {
    if (this.checkOut == null) {
      this.checkOut = new ArrayList<>();
    }
    this.checkOut.add(checkOutItem);
    return this;
  }

  /**
   * Check in.
   *
   * @return checkOut
   */
  @ApiModelProperty(example = "2018-03-20T09:12:28Z", value = "Check in.")
  public List<String> getCheckOut() {
    return checkOut;
  }

  public void setCheckOut(List<String> checkOut) {
    this.checkOut = checkOut;
  }

  public ApartmentDTO status(Boolean status) {
    this.status = status;
    return this;
  }

  /**
   * Availability status.
   *
   * @return status
   */
  @ApiModelProperty(example = "true", value = "Availability status.")
  public Boolean getStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public ApartmentDTO location(LocationDTO location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   *
   * @return location
   */
  @ApiModelProperty(value = "")
  @Valid
  public LocationDTO getLocation() {
    return location;
  }

  public void setLocation(LocationDTO location) {
    this.location = location;
  }

  public ApartmentDTO host(UserDTO host) {
    this.host = host;
    return this;
  }

  /**
   * Get host
   *
   * @return host
   */
  @ApiModelProperty(value = "")
  @Valid
  public UserDTO getHost() {
    return host;
  }

  public void setHost(UserDTO host) {
    this.host = host;
  }

  public ApartmentDTO amenities(List<AmenityDTO> amenities) {
    this.amenities = amenities;
    return this;
  }

  public ApartmentDTO addAmenitiesItem(AmenityDTO amenitiesItem) {
    if (this.amenities == null) {
      this.amenities = new ArrayList<>();
    }
    this.amenities.add(amenitiesItem);
    return this;
  }

  /**
   * Get amenities
   *
   * @return amenities
   */
  @ApiModelProperty(value = "")
  @Valid
  public List<AmenityDTO> getAmenities() {
    return amenities;
  }

  public void setAmenities(List<AmenityDTO> amenities) {
    this.amenities = amenities;
  }

  public ApartmentDTO images(List<ImageDTO> images) {
    this.images = images;
    return this;
  }

  public ApartmentDTO addImagesItem(ImageDTO imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Get images
   *
   * @return images
   */
  @ApiModelProperty(value = "")
  @Valid
  public List<ImageDTO> getImages() {
    return images;
  }

  public void setImages(List<ImageDTO> images) {
    this.images = images;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApartmentDTO apartmentDTO = (ApartmentDTO) o;
    return Objects.equals(this.id, apartmentDTO.id)
        && Objects.equals(this.numberOfRooms, apartmentDTO.numberOfRooms)
        && Objects.equals(this.numberOfGuest, apartmentDTO.numberOfGuest)
        && Objects.equals(this.datesToRent, apartmentDTO.datesToRent)
        && Objects.equals(this.price, apartmentDTO.price)
        && Objects.equals(this.checkIn, apartmentDTO.checkIn)
        && Objects.equals(this.checkOut, apartmentDTO.checkOut)
        && Objects.equals(this.status, apartmentDTO.status)
        && Objects.equals(this.location, apartmentDTO.location)
        && Objects.equals(this.host, apartmentDTO.host)
        && Objects.equals(this.amenities, apartmentDTO.amenities)
        && Objects.equals(this.images, apartmentDTO.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        id,
        numberOfRooms,
        numberOfGuest,
        datesToRent,
        price,
        checkIn,
        checkOut,
        status,
        location,
        host,
        amenities,
        images);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApartmentDTO {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numberOfRooms: ").append(toIndentedString(numberOfRooms)).append("\n");
    sb.append("    numberOfGuest: ").append(toIndentedString(numberOfGuest)).append("\n");
    sb.append("    datesToRent: ").append(toIndentedString(datesToRent)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    checkIn: ").append(toIndentedString(checkIn)).append("\n");
    sb.append("    checkOut: ").append(toIndentedString(checkOut)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    amenities: ").append(toIndentedString(amenities)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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
