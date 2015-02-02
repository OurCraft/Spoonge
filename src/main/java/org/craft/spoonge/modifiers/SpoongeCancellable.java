package org.craft.spoonge.modifiers;

import org.craft.modding.events.ICancellable;
import org.craft.modding.modifiers.BytecodeModifier;

@BytecodeModifier("org.spongepowered.api.util.event.Cancellable")
public abstract class SpoongeCancellable implements ICancellable {
}
