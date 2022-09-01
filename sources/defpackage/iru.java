package defpackage;

/* compiled from: PG */
/* renamed from: iru  reason: default package */
/* loaded from: classes.dex */
public enum iru {
    UNKNOWN(0),
    NO_CONNECTION(1),
    METERED(3),
    NON_METERED(4),
    CONNECTION_UNKNOWN(2);
    
    final int f;

    iru(int i) {
        this.f = i;
    }
}
