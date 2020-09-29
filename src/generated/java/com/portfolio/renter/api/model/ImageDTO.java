package com.portfolio.renter.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.validation.constraints.*;

/** This objects is created for setting up images for your appartment. */
@ApiModel(description = "This objects is created for setting up images for your appartment.")
public class ImageDTO {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("path")
  private String path;

  public ImageDTO id(Long id) {
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

  public ImageDTO path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Url path to the image.
   *
   * @return path
   */
  @ApiModelProperty(example = "/images/picture.jpg", value = "Url path to the image.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageDTO imageDTO = (ImageDTO) o;
    return Objects.equals(this.id, imageDTO.id) && Objects.equals(this.path, imageDTO.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageDTO {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
