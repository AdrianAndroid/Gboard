package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* renamed from: lgi  reason: default package */
/* loaded from: classes.dex */
public final class lgi extends RuntimeException {
    public lgi(Exception exc) {
        super("TunnelExceptions should always be unwrapped to deal with the checked exception underneath, this message should never be seen if TunnelException is used properly.", exc);
    }

    @Override // java.lang.Throwable
    /* renamed from: a */
    public final synchronized Exception getCause() {
        return (Exception) Objects.requireNonNull(super.getCause());
    }
}
