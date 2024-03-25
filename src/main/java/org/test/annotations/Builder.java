package org.test.annotations;

import org.jilt.BuilderInterfaces;
import org.jilt.BuilderStyle;

@BuilderInterfaces(lastInnerName = "Meta")
@org.jilt.Builder(setterPrefix = "with", style = BuilderStyle.STAGED_PRESERVING_ORDER, factoryMethod = "builder")
public @interface Builder {
}
