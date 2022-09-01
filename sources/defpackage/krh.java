package defpackage;

/* compiled from: PG */
/* renamed from: krh  reason: default package */
/* loaded from: classes.dex */
final class krh extends Exception {
    public krh(Throwable th) {
        super("An unknown error occurred during upgrade. The upgrade may fail repeatedly when retried.", th);
    }
}
