package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* renamed from: azi  reason: default package */
/* loaded from: classes.dex */
public final class azi implements azf {
    public final Map b;
    public volatile Map c;

    public azi(Map map) {
        this.b = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof azi) {
            return this.b.equals(((azi) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        return "LazyHeaders{headers=" + valueOf + "}";
    }
}
