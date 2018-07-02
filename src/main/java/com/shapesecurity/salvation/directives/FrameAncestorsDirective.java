package com.shapesecurity.salvation.directives;

import com.shapesecurity.salvation.directiveValues.AncestorSource;

import javax.annotation.Nonnull;
import java.util.Set;

public class FrameAncestorsDirective extends AncestorSourceListDirective {
	@Nonnull
	private static final String name = "frame-ancestors";

	public FrameAncestorsDirective(@Nonnull Set<AncestorSource> ancestorSources) {
		super(FrameAncestorsDirective.name, ancestorSources);
	}

	@Nonnull
	@Override
	public Directive<AncestorSource> construct(Set<AncestorSource> newValues) {
		return new FrameAncestorsDirective(newValues);
	}
}
