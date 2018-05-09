
package com.uic.atse.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "stages",
    "post",
    "environment",
    "agent",
    "tools",
    "options",
    "parameters",
    "triggers"
})
public class Example {

    @JsonProperty("stages")
    private List<Stage> stages = null;
    @JsonProperty("post")
    private Post_ post;
    @JsonProperty("environment")
    private List<Environment_> environment = null;
    @JsonProperty("agent")
    private Agent_ agent;
    @JsonProperty("tools")
    private List<Tool_> tools = null;
    @JsonProperty("options")
    private Options options;
    @JsonProperty("parameters")
    private Parameters parameters;
    @JsonProperty("triggers")
    private Triggers triggers;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("stages")
    public List<Stage> getStages() {
        return stages;
    }

    @JsonProperty("stages")
    public void setStages(List<Stage> stages) {
        this.stages = stages;
    }

    @JsonProperty("post")
    public Post_ getPost() {
        return post;
    }

    @JsonProperty("post")
    public void setPost(Post_ post) {
        this.post = post;
    }

    @JsonProperty("environment")
    public List<Environment_> getEnvironment() {
        return environment;
    }

    @JsonProperty("environment")
    public void setEnvironment(List<Environment_> environment) {
        this.environment = environment;
    }

    @JsonProperty("agent")
    public Agent_ getAgent() {
        return agent;
    }

    @JsonProperty("agent")
    public void setAgent(Agent_ agent) {
        this.agent = agent;
    }

    @JsonProperty("tools")
    public List<Tool_> getTools() {
        return tools;
    }

    @JsonProperty("tools")
    public void setTools(List<Tool_> tools) {
        this.tools = tools;
    }

    @JsonProperty("options")
    public Options getOptions() {
        return options;
    }

    @JsonProperty("options")
    public void setOptions(Options options) {
        this.options = options;
    }

    @JsonProperty("parameters")
    public Parameters getParameters() {
        return parameters;
    }

    @JsonProperty("parameters")
    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    @JsonProperty("triggers")
    public Triggers getTriggers() {
        return triggers;
    }

    @JsonProperty("triggers")
    public void setTriggers(Triggers triggers) {
        this.triggers = triggers;
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
        return new ToStringBuilder(this).append("stages", stages).append("post", post).append("environment", environment).append("agent", agent).append("tools", tools).append("options", options).append("parameters", parameters).append("triggers", triggers).append("additionalProperties", additionalProperties).toString();
    }

}