/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.nifi.flow;

import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

public class VersionedReportingTask extends VersionedComponent implements VersionedConfigurableComponent, VersionedExtensionComponent {
    private String type;
    private Bundle bundle;
    private Map<String, String> properties;
    private Map<String, VersionedPropertyDescriptor> propertyDescriptors;
    private String annotationData;
    private ScheduledState scheduledState;
    private String schedulingPeriod;
    private String schedulingStrategy;


    @Override
    @ApiModelProperty(value = "The type of the reporting task.")
    public String getType() {
        return type;
    }

    @Override
    public void setType(final String type) {
        this.type = type;
    }

    @Override
    @ApiModelProperty(value = "The details of the artifact that bundled this reporting task type.")
    public Bundle getBundle() {
        return bundle;
    }

    @Override
    public void setBundle(Bundle bundle) {
        this.bundle = bundle;
    }

    @Override
    @ApiModelProperty(value = "The properties of the reporting task.")
    public Map<String, String> getProperties() {
        return properties;
    }

    @Override
    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    @Override
    @ApiModelProperty("The property descriptors for the reporting task.")
    public Map<String, VersionedPropertyDescriptor> getPropertyDescriptors() {
        return propertyDescriptors;
    }

    @Override
    public void setPropertyDescriptors(Map<String, VersionedPropertyDescriptor> propertyDescriptors) {
        this.propertyDescriptors = propertyDescriptors;
    }

    @ApiModelProperty(value = "The annotation for the reporting task. This is how the custom UI relays configuration to the reporting task.")
    public String getAnnotationData() {
        return annotationData;
    }

    public void setAnnotationData(String annotationData) {
        this.annotationData = annotationData;
    }

    @ApiModelProperty("The frequency with which to schedule the reporting task. The format of the value will depend on the value of schedulingStrategy.")
    public String getSchedulingPeriod() {
        return schedulingPeriod;
    }

    public void setSchedulingPeriod(String setSchedulingPeriod) {
        this.schedulingPeriod = setSchedulingPeriod;
    }

    @ApiModelProperty("Indicates scheduling strategy that should dictate how the reporting task is triggered.")
    public String getSchedulingStrategy() {
        return schedulingStrategy;
    }

    public void setSchedulingStrategy(String schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy;
    }

    @Override
    public ComponentType getComponentType() {
        return ComponentType.REPORTING_TASK;
    }

    @ApiModelProperty("Indicates the scheduled state for the Reporting Task")
    public ScheduledState getScheduledState() {
        return scheduledState;
    }

    public void setScheduledState(final ScheduledState scheduledState) {
        this.scheduledState = scheduledState;
    }
}