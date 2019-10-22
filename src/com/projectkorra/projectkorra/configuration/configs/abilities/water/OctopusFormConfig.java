package com.projectkorra.projectkorra.configuration.configs.abilities.water;

import com.projectkorra.projectkorra.configuration.configs.abilities.AbilityConfig;

public class OctopusFormConfig extends AbilityConfig {

	public final long Cooldown = 3500;
	public final long Duration = 0;
	public final long FormDelay = 500;
	public final double SelectionRange = 15;
	public final double Damage = 2;
	public final double AttackRange = 3;
	public final long UsageCooldown = 200;
	public final double Knockback = .3;
	public final double Radius = 5;
	public final double AngleIncrement = 10;
	
	public final double AvatarState_Damage = 4;
	public final double AvatarState_AttackRange = 3;
	public final double AvatarState_Knockback = 2;
	public final double AvatarState_Radius = 5;
	
	public OctopusFormConfig() {
		super(true, "", "");
	}

	@Override
	public String getName() {
		return "OctopusForm";
	}

	@Override
	public String[] getParents() {
		return new String[] { "Abilities", "Water" };
	}

}