/*
  SelectEffectDiscovery.java

  Firefly Luciferin, very fast Java Screen Capture software designed
  for Glow Worm Luciferin firmware.

  Copyright © 2020 - 2023  Davide Perini  (https://github.com/sblantipodi)

  This program is free software: you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with this program.  If not, see <https://www.gnu.org/licenses/>.
*/
package org.dpsoftware.managers.dto.mqttdiscovery;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import org.dpsoftware.FireflyLuciferin;
import org.dpsoftware.config.Enums;
import org.dpsoftware.utilities.CommonUtility;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
public class SelectEffectDiscovery implements DiscoveryObject {

    @JsonProperty("unique_id")
    String uniqueId;
    String name;
    @JsonProperty("state_topic")
    String stateTopic;
    @JsonProperty("command_template")
    String commandTemplate;
    @JsonProperty("command_topic")
    String commandTopic;
    String icon;
    List<String> options;

    @JsonProperty("value_template")

    @Override
    public String getDiscoveryTopic() {
        return FireflyLuciferin.config.getMqttDiscoveryTopic() + "/select/" + getBaseFireflyDiscoveryTopic() + "/effect/config";
    }

    @Override
    public String getCreateEntityStr() {
        this.name = generateUniqueName("Luciferin Effect Selector");
        this.uniqueId = this.name.replaceAll(" ", "_");
        this.stateTopic = "lights/" + FireflyLuciferin.config.getMqttTopic() + "/effectToGw";
        this.commandTopic = "lights/" + FireflyLuciferin.config.getMqttTopic() + "/effectToGw";
        this.commandTemplate = "{\"state\":\"ON\",\"effect\":\"{{value}}\"}";
        this.options = new ArrayList<>();
        for (Enums.Effect effect : Enums.Effect.values()) {
            options.add(effect.getBaseI18n());
        }
        this.icon = "mdi:format-list-bulleted-type";
        return CommonUtility.toJsonString(this);
    }

    @Override
    public String getDestroyEntityStr() {
        return "";
    }
}