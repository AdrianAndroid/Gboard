package defpackage;

/* compiled from: PG */
@Deprecated
/* renamed from: mvk  reason: default package */
/* loaded from: classes2.dex */
public enum mvk implements nfp {
    UNUSED(1),
    DECODING(2),
    UPDATING(3);
    
    public final int d;

    mvk(int i) {
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
