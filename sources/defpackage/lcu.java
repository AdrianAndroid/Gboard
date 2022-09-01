package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lcu  reason: default package */
/* loaded from: classes.dex */
final class lcu {
    int a;
    final int b;
    lcu c;
    final Map d = new HashMap(0);

    public lcu(int i, int i2) {
        if (i <= i2) {
            this.a = i;
            this.b = i2;
            this.c = null;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        return "Node" + identityHashCode;
    }
}
