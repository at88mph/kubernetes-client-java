/*
Copyright 2025 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1alpha3Counter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * DeviceCounterConsumption defines a set of counters that a device will consume from a CounterSet.
 */
@ApiModel(description = "DeviceCounterConsumption defines a set of counters that a device will consume from a CounterSet.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-20T20:47:13.890592Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1alpha3DeviceCounterConsumption {
  public static final String SERIALIZED_NAME_COUNTER_SET = "counterSet";
  @SerializedName(SERIALIZED_NAME_COUNTER_SET)
  @jakarta.annotation.Nonnull
  private String counterSet;

  public static final String SERIALIZED_NAME_COUNTERS = "counters";
  @SerializedName(SERIALIZED_NAME_COUNTERS)
  @jakarta.annotation.Nonnull
  private Map<String, V1alpha3Counter> counters = new HashMap<>();

  public V1alpha3DeviceCounterConsumption() {
  }

  public V1alpha3DeviceCounterConsumption counterSet(@jakarta.annotation.Nonnull String counterSet) {
    this.counterSet = counterSet;
    return this;
  }

  /**
   * CounterSet defines the set from which the counters defined will be consumed.
   * @return counterSet
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "CounterSet defines the set from which the counters defined will be consumed.")
  public String getCounterSet() {
    return counterSet;
  }

  public void setCounterSet(@jakarta.annotation.Nonnull String counterSet) {
    this.counterSet = counterSet;
  }


  public V1alpha3DeviceCounterConsumption counters(@jakarta.annotation.Nonnull Map<String, V1alpha3Counter> counters) {
    this.counters = counters;
    return this;
  }

  public V1alpha3DeviceCounterConsumption putCountersItem(String key, V1alpha3Counter countersItem) {
    if (this.counters == null) {
      this.counters = new HashMap<>();
    }
    this.counters.put(key, countersItem);
    return this;
  }

  /**
   * Counters defines the Counter that will be consumed by the device.  The maximum number counters in a device is 32. In addition, the maximum number of all counters in all devices is 1024 (for example, 64 devices with 16 counters each).
   * @return counters
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Counters defines the Counter that will be consumed by the device.  The maximum number counters in a device is 32. In addition, the maximum number of all counters in all devices is 1024 (for example, 64 devices with 16 counters each).")
  public Map<String, V1alpha3Counter> getCounters() {
    return counters;
  }

  public void setCounters(@jakarta.annotation.Nonnull Map<String, V1alpha3Counter> counters) {
    this.counters = counters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3DeviceCounterConsumption v1alpha3DeviceCounterConsumption = (V1alpha3DeviceCounterConsumption) o;
    return Objects.equals(this.counterSet, v1alpha3DeviceCounterConsumption.counterSet) &&
        Objects.equals(this.counters, v1alpha3DeviceCounterConsumption.counters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counterSet, counters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3DeviceCounterConsumption {\n");
    sb.append("    counterSet: ").append(toIndentedString(counterSet)).append("\n");
    sb.append("    counters: ").append(toIndentedString(counters)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("counterSet");
    openapiFields.add("counters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("counterSet");
    openapiRequiredFields.add("counters");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1alpha3DeviceCounterConsumption
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha3DeviceCounterConsumption.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha3DeviceCounterConsumption is not found in the empty JSON string", V1alpha3DeviceCounterConsumption.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha3DeviceCounterConsumption.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha3DeviceCounterConsumption` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha3DeviceCounterConsumption.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("counterSet").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `counterSet` to be a primitive type in the JSON string but got `%s`", jsonObj.get("counterSet").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha3DeviceCounterConsumption.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha3DeviceCounterConsumption' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha3DeviceCounterConsumption> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha3DeviceCounterConsumption.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha3DeviceCounterConsumption>() {
           @Override
           public void write(JsonWriter out, V1alpha3DeviceCounterConsumption value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha3DeviceCounterConsumption read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1alpha3DeviceCounterConsumption given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1alpha3DeviceCounterConsumption
   * @throws IOException if the JSON string is invalid with respect to V1alpha3DeviceCounterConsumption
   */
  public static V1alpha3DeviceCounterConsumption fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha3DeviceCounterConsumption.class);
  }

  /**
   * Convert an instance of V1alpha3DeviceCounterConsumption to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
