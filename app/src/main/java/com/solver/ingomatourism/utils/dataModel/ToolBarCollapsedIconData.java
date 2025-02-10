package com.solver.ingomatourism.utils.dataModel;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

import org.jetbrains.annotations.NotNull;

@Metadata
public abstract class ToolBarCollapsedIconData {
    public static final int $stable = 0;

    @Metadata
    public static final class None extends ToolBarCollapsedIconData {
        public static final int $stable = 0;
        @NotNull
        public static final None INSTANCE = new None();

        private None() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata
    public static final class ShareData extends ToolBarCollapsedIconData {
        public static final int $stable = 0;
        @NotNull
        private final String shareText;
        @NotNull
        private final String shareUrl;

        public ShareData(@NotNull String str, @NotNull String str2) {
            super((DefaultConstructorMarker) null);
            this.shareUrl = str;
            this.shareText = str2;
        }

        public static /* synthetic */ ShareData copy$default(ShareData shareData, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = shareData.shareUrl;
            }
            if ((i & 2) != 0) {
                str2 = shareData.shareText;
            }
            return shareData.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return this.shareUrl;
        }

        @NotNull
        public final String component2() {
            return this.shareText;
        }

        @NotNull
        public final ShareData copy(@NotNull String str, @NotNull String str2) {
            return new ShareData(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShareData)) {
                return false;
            }
            ShareData shareData = (ShareData) obj;
            return Intrinsics.areEqual(this.shareUrl, shareData.shareUrl) && Intrinsics.areEqual(this.shareText, shareData.shareText);

        }

        @NotNull
        public final String getShareText() {
            return this.shareText;
        }

        @NotNull
        public final String getShareUrl() {
            return this.shareUrl;
        }

        public int hashCode() {
            return this.shareText.hashCode() + (this.shareUrl.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ShareData(shareUrl=" + this.shareUrl + ", shareText=" + this.shareText + ")";

        }
    }

    public /* synthetic */ ToolBarCollapsedIconData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ToolBarCollapsedIconData() {
    }
}

