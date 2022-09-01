package defpackage;

/* compiled from: PG */
/* renamed from: nhz  reason: default package */
/* loaded from: classes2.dex */
public final class nhz extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public nhz() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final ngd a() {
        return new ngd(getMessage());
    }
}
