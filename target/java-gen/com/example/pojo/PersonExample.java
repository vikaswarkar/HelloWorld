
package com.example.pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Person
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "firstName",
    "lastName",
    "age"
})
public class PersonExample {

    /**
     * The person's first name.
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("The person's first name.")
    private String firstName;
    /**
     * The person's last name.
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("The person's last name.")
    private String lastName;
    /**
     * Age in years which must be equal to or greater than zero.
     * 
     */
    @JsonProperty("age")
    @JsonPropertyDescription("Age in years which must be equal to or greater than zero.")
    private Integer age;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The person's first name.
     * 
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * The person's first name.
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * The person's last name.
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * The person's last name.
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Age in years which must be equal to or greater than zero.
     * 
     */
    @JsonProperty("age")
    public Integer getAge() {
        return age;
    }

    /**
     * Age in years which must be equal to or greater than zero.
     * 
     */
    @JsonProperty("age")
    public void setAge(Integer age) {
        this.age = age;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("firstName", firstName).append("lastName", lastName).append("age", age).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(firstName).append(lastName).append(additionalProperties).append(age).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonExample) == false) {
            return false;
        }
        PersonExample rhs = ((PersonExample) other);
        return new EqualsBuilder().append(firstName, rhs.firstName).append(lastName, rhs.lastName).append(additionalProperties, rhs.additionalProperties).append(age, rhs.age).isEquals();
    }

}
