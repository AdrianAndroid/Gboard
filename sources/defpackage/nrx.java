package defpackage;

/* compiled from: PG */
/* renamed from: nrx  reason: default package */
/* loaded from: classes2.dex */
public final class nrx {
    private final String a;

    private nrx(String str) {
        this.a = str;
    }

    public static nrx a(String str) {
        return new nrx(str);
    }

    public final String toString() {
        return this.a;
    }
}
