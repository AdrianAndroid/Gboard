package defpackage;

import java.io.Serializable;
import java.util.EnumMap;

/* compiled from: PG */
/* renamed from: lli  reason: default package */
/* loaded from: classes.dex */
final class lli implements Serializable {
    private static final long serialVersionUID = 0;
    final EnumMap a;

    public lli(EnumMap enumMap) {
        this.a = enumMap;
    }

    Object readResolve() {
        return new llj(this.a);
    }
}
