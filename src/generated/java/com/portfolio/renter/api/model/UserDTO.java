package com.portfolio.renter.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.validation.constraints.*;

/** This is a User object register via email. */
@ApiModel(description = "This is a User object register via email.")
public class UserDTO {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("username")
  private String username;

  @JsonProperty("email")
  private String email;

  @JsonProperty("password")
  private String password;

  @JsonProperty("name")
  private String name;

  @JsonProperty("lastname")
  private String lastname;

  @JsonProperty("gender")
  private String gender;

  @JsonProperty("role")
  private String role;

  public UserDTO id(Long id) {
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

  public UserDTO username(String username) {
    this.username = username;
    return this;
  }

  /**
   * objects name that is going to be used and seen by other users.
   *
   * @return username
   */
  @ApiModelProperty(
      example = "admin",
      required = true,
      value = "objects name that is going to be used and seen by other users.")
  @NotNull
  @Pattern(regexp = "^[a-zA-Z]+$")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UserDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * objects email that is going to be used to register.
   *
   * @return email
   */
  @ApiModelProperty(
      example = "dexi@gmail.com",
      required = true,
      value = "objects email that is going to be used to register.")
  @NotNull
  @Pattern(
      regexp =
          "^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserDTO password(String password) {
    this.password = password;
    return this;
  }

  /**
   * objects password that is going to be used for login.
   *
   * @return password
   */
  @ApiModelProperty(
      example = "admin",
      required = true,
      value = "objects password that is going to be used for login.")
  @NotNull
  @Pattern(regexp = "^[a-zA-Z]+$")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * First name of the user.
   *
   * @return name
   */
  @ApiModelProperty(example = "John", required = true, value = "First name of the user.")
  @NotNull
  @Pattern(regexp = "^[a-zA-Z]+$")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserDTO lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

  /**
   * Last name of the user.
   *
   * @return lastname
   */
  @ApiModelProperty(example = "Doe", required = true, value = "Last name of the user.")
  @NotNull
  @Pattern(regexp = "^[a-zA-Z]+$")
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public UserDTO gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Users gender.
   *
   * @return gender
   */
  @ApiModelProperty(example = "male", required = true, value = "Users gender.")
  @NotNull
  @Pattern(regexp = "^[a-zA-Z]+$")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public UserDTO role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Users role.
   *
   * @return role
   */
  @ApiModelProperty(example = "admin", required = true, value = "Users role.")
  @NotNull
  @Pattern(regexp = "^[a-zA-Z]+$")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDTO userDTO = (UserDTO) o;
    return Objects.equals(this.id, userDTO.id)
        && Objects.equals(this.username, userDTO.username)
        && Objects.equals(this.email, userDTO.email)
        && Objects.equals(this.password, userDTO.password)
        && Objects.equals(this.name, userDTO.name)
        && Objects.equals(this.lastname, userDTO.lastname)
        && Objects.equals(this.gender, userDTO.gender)
        && Objects.equals(this.role, userDTO.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, email, password, name, lastname, gender, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDTO {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
