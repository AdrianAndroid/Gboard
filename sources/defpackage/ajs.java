package defpackage;

import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* renamed from: ajs  reason: default package */
/* loaded from: classes.dex */
public final class ajs {
    public final ajk a;
    public final int b;
    public final int c;

    public ajs(int i, int i2, Map map) {
        boolean z = true;
        nq.b(!map.isEmpty());
        nq.b(i > i2 ? false : z);
        this.b = i;
        this.c = i2;
        this.a = new ajk(map);
    }

    public final String toString() {
        return String.format(Locale.US, "TextLink{start=%s, end=%s, entityScores=%s}", Integer.valueOf(this.b), Integer.valueOf(this.c), this.a);
    }
}
