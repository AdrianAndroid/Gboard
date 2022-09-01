package defpackage;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lqo  reason: default package */
/* loaded from: classes.dex */
public final class lqo {
    private final Object a;
    private final Object b;

    public lqo(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lqo) {
            lqo lqoVar = (lqo) obj;
            if (jdg.W(this.a, lqoVar.a) && jdg.W(this.b, lqoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ")";
    }
}
