package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: ojw  reason: default package */
/* loaded from: classes2.dex */
public final class ojw implements Serializable {
    public static final ojw a = new ojw();
    private static final long serialVersionUID = 0;

    private ojw() {
    }

    private final Object readResolve() {
        return a;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
