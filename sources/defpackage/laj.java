package defpackage;

/* compiled from: PG */
/* renamed from: laj  reason: default package */
/* loaded from: classes.dex */
public final class laj extends RuntimeException {
    public laj(String str) {
        super(str);
    }

    public laj(Throwable th) {
        super("Failed to initialize FileStorage", th);
    }
}
