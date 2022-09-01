package defpackage;

/* compiled from: PG */
/* renamed from: hda  reason: default package */
/* loaded from: classes.dex */
abstract class hda {
    final long g;

    public hda(long j) {
        this.g = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long b(int i, int i2, int i3) {
        return (i2 << 32) | (i << 60) | i3;
    }

    public abstract int a();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hda) && this.g == ((hda) obj).g;
    }

    public int hashCode() {
        return mhq.d(this.g);
    }
}
