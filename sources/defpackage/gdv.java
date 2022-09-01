package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: gdv  reason: default package */
/* loaded from: classes.dex */
public final class gdv implements fnv {
    public static final gdv b = new gdv();
    private final boolean c = false;
    private final boolean d = false;
    private final String e = null;
    private final boolean f = false;
    private final boolean i = false;
    private final String g = null;
    private final String h = null;
    private final Long j = null;
    private final Long k = null;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gdv)) {
            return false;
        }
        gdv gdvVar = (gdv) obj;
        boolean z = gdvVar.c;
        boolean z2 = gdvVar.d;
        String str = gdvVar.e;
        if (fyb.aJ(null, null)) {
            boolean z3 = gdvVar.f;
            boolean z4 = gdvVar.i;
            String str2 = gdvVar.g;
            if (fyb.aJ(null, null)) {
                String str3 = gdvVar.h;
                if (fyb.aJ(null, null)) {
                    Long l = gdvVar.j;
                    if (fyb.aJ(null, null)) {
                        Long l2 = gdvVar.k;
                        if (fyb.aJ(null, null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{false, false, null, false, false, null, null, null, null});
    }
}
