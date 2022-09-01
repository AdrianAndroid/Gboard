package j$.time;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class a extends b implements Serializable {
    static final a b = new a(ZoneOffset.UTC);
    private final n a;

    static {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
    }

    a(ZoneOffset zoneOffset) {
        this.a = zoneOffset;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.a.equals(((a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return "SystemClock[" + valueOf + "]";
    }
}
