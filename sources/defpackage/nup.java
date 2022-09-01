package defpackage;

/* compiled from: PG */
/* renamed from: nup  reason: default package */
/* loaded from: classes2.dex */
public enum nup {
    UNARY,
    CLIENT_STREAMING,
    SERVER_STREAMING,
    BIDI_STREAMING,
    UNKNOWN;

    public final boolean a() {
        return this == UNARY || this == SERVER_STREAMING;
    }

    public final boolean b() {
        return this == UNARY || this == CLIENT_STREAMING;
    }
}
