package defpackage;

import java.util.EnumSet;

/* compiled from: PG */
/* renamed from: fmd  reason: default package */
/* loaded from: classes.dex */
public enum fmd {
    ZWIEBACK(2),
    ANDROID_ID(4),
    GAIA(8),
    ACCOUNT_NAME(16);
    
    public static final EnumSet e = EnumSet.allOf(fmd.class);
    public static final EnumSet f = EnumSet.noneOf(fmd.class);
    public final int h;
    public static final EnumSet g = EnumSet.of(ZWIEBACK);

    fmd(int i2) {
        this.h = i2;
    }
}
