package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* renamed from: lzc  reason: default package */
/* loaded from: classes.dex */
public final class lzc extends Exception {
    private static final long serialVersionUID = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzc(Exception exc) {
        super(exc);
        jdg.u(exc);
    }

    @Override // java.lang.Throwable
    public final /* bridge */ /* synthetic */ Throwable getCause() {
        return (Exception) Objects.requireNonNull(super.getCause());
    }
}
