package com.company.jmixpm.security;

import io.jmix.dynattrui.role.DynamicAttributesRole;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.securityui.role.UiMinimalRole;

@ResourceRole(name = "CombinedManagerRole", code = CombinedManagerRole.CODE, scope = "UI")
public interface CombinedManagerRole extends ProjectManagementRole, DynamicAttributesRole, UiMinimalRole {
    String CODE = "combined-manager-role";
}