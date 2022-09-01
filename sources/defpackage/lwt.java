package defpackage;

import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: lwt  reason: default package */
/* loaded from: classes.dex */
public final class lwt {
    public static final Comparator a = new jpf(8);
    public static final lwt b = new lwt(new lwr(Collections.emptyList()));
    public final lwr c;

    public lwt(lwr lwrVar) {
        this.c = lwrVar;
    }

    public final boolean a() {
        return this.c.isEmpty();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lwt) && ((lwt) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ (-1);
    }

    public final String toString() {
        return this.c.toString();
    }
}
