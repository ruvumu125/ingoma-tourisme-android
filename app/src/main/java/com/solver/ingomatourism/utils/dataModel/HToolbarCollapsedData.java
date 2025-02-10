package com.solver.ingomatourism.utils.dataModel;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class HToolbarCollapsedData {
    public static final int $stable = 0;
    @NotNull
    private final ToolBarCollapsedIconData iconData;

    public HToolbarCollapsedData(@NotNull ToolBarCollapsedIconData toolBarCollapsedIconData) {
        this.iconData = toolBarCollapsedIconData;
    }

    public static /* synthetic */ HToolbarCollapsedData copy$default(HToolbarCollapsedData hToolbarCollapsedData, ToolBarCollapsedIconData toolBarCollapsedIconData, int i, Object obj) {
        if ((i & 1) != 0) {
            toolBarCollapsedIconData = hToolbarCollapsedData.iconData;
        }
        return hToolbarCollapsedData.copy(toolBarCollapsedIconData);
    }

    @NotNull
    public final ToolBarCollapsedIconData component1() {
        return this.iconData;
    }

    @NotNull
    public final HToolbarCollapsedData copy(@NotNull ToolBarCollapsedIconData toolBarCollapsedIconData) {
        return new HToolbarCollapsedData(toolBarCollapsedIconData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HToolbarCollapsedData) && Intrinsics.areEqual(this.iconData, ((HToolbarCollapsedData) obj).iconData);

    }

    @NotNull
    public final ToolBarCollapsedIconData getIconData() {
        return this.iconData;
    }

    public int hashCode() {
        return this.iconData.hashCode();
    }

    @NotNull
    public String toString() {
        ToolBarCollapsedIconData toolBarCollapsedIconData = this.iconData;
        return "HToolbarCollapsedData(iconData=" + toolBarCollapsedIconData + ")";
    }
}

