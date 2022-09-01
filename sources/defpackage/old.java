package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: old  reason: default package */
/* loaded from: classes2.dex */
final class old implements Serializable {
    public static final old a = new old();

    private old() {
    }

    private Object readResolve() {
        return a;
    }
}
