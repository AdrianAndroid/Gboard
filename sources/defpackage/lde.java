package defpackage;

/* compiled from: PG */
/* renamed from: lde  reason: default package */
/* loaded from: classes.dex */
public enum lde implements nfp {
    UNKNOWN(0),
    REALTIME(1),
    UPTIME(2);
    
    private final int d;

    lde(int i) {
        this.d = i;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
