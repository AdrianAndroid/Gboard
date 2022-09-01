package defpackage;

/* compiled from: PG */
/* renamed from: awg  reason: default package */
/* loaded from: classes.dex */
final class awg extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    public awg(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
