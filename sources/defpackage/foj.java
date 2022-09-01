package defpackage;

/* compiled from: PG */
/* renamed from: foj  reason: default package */
/* loaded from: classes.dex */
public final class foj extends UnsupportedOperationException {
    private final fmv a;

    public foj(fmv fmvVar) {
        this.a = fmvVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(String.valueOf(this.a)));
    }
}
