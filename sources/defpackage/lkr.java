package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lkr  reason: default package */
/* loaded from: classes.dex */
public final class lkr extends lnd {
    static final lkr a = new lkr();
    private static final long serialVersionUID = 0;

    private lkr() {
        super(lrq.b, 0);
    }

    private Object readResolve() {
        return a;
    }
}
