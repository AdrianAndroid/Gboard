package defpackage;

/* compiled from: PG */
/* renamed from: flv  reason: default package */
/* loaded from: classes.dex */
public final class flv implements Comparable {
    public final byte[] a;

    public flv() {
        this(null);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return fma.e.compare(this.a, ((flv) obj).a);
    }

    public final String toString() {
        return new String(this.a, fma.a);
    }

    public flv(byte[] bArr) {
        this.a = bArr == null ? fma.b : bArr;
    }
}
